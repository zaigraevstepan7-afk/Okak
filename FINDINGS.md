# Elixir Loader — анализ APK (откуда скачивается «elixir-executable»)

Разбор `app-release.apk` (`com.elixir.loader`, versionName **1.7**, versionCode **4**).
Это **root-загрузчик читов** для игры **Standoff 2** (`com.axlebolt.standoff2`).

## Краткий ответ

Все сетевые запросы идут на один backend:

```
https://elixir-api.cc/
```

Бинарник («elixir-executable» / loader) скачивается **двумя** путями:

### 1. Сам нативный бинарник версии чита — по URL от сервера

`ReleasesApi` (decompiled: `sources/com/elixir/loader/data/api/releases/ReleasesApi.java`):

| Метод | Endpoint | Назначение |
|-------|----------|-----------|
| `checkVersion` | `GET version/check?is_pc=&sub_type=external` | вернёт `downloadUrl` + `hash` последней версии |
| `getHistory` | `GET version/history?is_pc=&sub_type=` | список версий |
| `downloadBinary` | `@Streaming @GET @Url <url>` | **скачивает сам бинарник** по абсолютному URL, который пришёл в `downloadUrl` |

Поток (`sources/com/elixir/loader/data/api/releases/VersionCheckResponse.java` → `kf2.java`):

1. `checkVersion()` → `VersionCheckResponse { latestVersion, downloadUrl, hash, isOutdated, ... }`
2. `kf2.a(url)` вызывает `ReleasesApi.downloadBinary(url)` и стримит тело в файл.
3. SHA-256 файла сверяется с `hash` (`hp.P(File)` = HashUtils, `sources/defpackage/hp.java`).

> `downloadBinary` помечен `@Url`, то есть бинарник может лежать на любом хосте,
> который укажет сервер (CDN/зеркало), а не обязательно на `elixir-api.cc`.

### 2. Обновление самого APK лоадера — фиксированный endpoint

`LoaderApi` / `LoaderDownloadApi`
(`sources/com/elixir/loader/data/api/loader/`):

| Метод | Endpoint |
|-------|----------|
| `getHash` | `GET loader/hash/{ext}` |
| `download` (`@Streaming`) | `GET loader/download/{ext}` |

`ext` = `"apk"` для самообновления (`pw0.java` → файл `loader_update.apk`,
устанавливается через `cd` / PackageInstaller).
Архитектура определяется в `ke.java` через `Build.SUPPORTED_ABIS` (проверка на `x86_64`).

## Как бинарник запускается (root)

ViewModel `bi0.java` + корутины `vh0/wh0/xh0/yh0`, шелл через libsu
(`com.topjohnwu.superuser.Shell`):

- `chmod 777 <файл>` — `yh0.java`
- `killall -9 <имя> 2>/dev/null || true` — `wh0.java`
- запуск произвольной команды `Shell.cmd(cmd).exec()` — `xh0.java`
- проверка живости процесса: `su -c "kill -0 <pid>"` — `th0.java`
- stdout → `elixir_stdout.log`, PID → `elixir_run.pid`
  (рядом с бинарником в `/data/data/com.elixir.loader/files`)

## Конфигурация сети

`sources/defpackage/jd.java` — DI-граф Retrofit, все клиенты:

```java
new Retrofit.Builder().baseUrl("https://elixir-api.cc/")...
```

## Другие endpoint'ы того же API

| Группа | Endpoint |
|--------|----------|
| auth | `client/login/{key}` (`AuthApi`) |
| configs | `configs/create`, `configs/update`, `configs/delete`, `configs/list`, `configs/market`, `configs/share/{code}` |
| releases | `version/check`, `version/history`, `version/download/` |
| loader | `loader/hash/{ext}`, `loader/download/{ext}` |

## Прочее

- Версия игры тянется парсингом Google Play (`th0.java`, Jsoup,
  `play.google.com/store/apps/details?id=...`).
- Telegram: `https://t.me/elixir_reborn_community`, `https://t.me/elixir_cheat`.
- Разрешения: `INTERNET`, `REQUEST_INSTALL_PACKAGES`, чтение медиа; root через libsu.

## Содержимое репозитория

- `app-release.apk` — исходный APK (из присланного архива).
- `decompiled/sources/` — декомпилированный Java-код (jadx).
- `decompiled/AndroidManifest.xml` — читаемый манифест.

> Декомпиляция выполнена для разбора. Имена `defpackage/*` и однобуквенные классы —
> результат обфускации R8; смысловые имена сохранились в API-классах `com.elixir.loader.*`.
