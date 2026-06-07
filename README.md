# Okak — Elixir Loader APK (распаковка и анализ)

Содержимое присланного архива `apprelease.zip` (внутри был `app-release.apk`),
распакованное и декомпилированное.

- **[FINDINGS.md](FINDINGS.md)** — где и как скачивается «elixir-executable» (бинарник лоадера).
- `app-release.apk` — исходный APK.
- `decompiled/sources/` — декомпилированный код (jadx).
- `decompiled/AndroidManifest.xml` — манифест.

**TL;DR:** backend — `https://elixir-api.cc/`. Бинарник версии чита тянется через
`ReleasesApi.downloadBinary(@Url)` по `downloadUrl` из `version/check`, с SHA-256
проверкой; APK лоадера обновляется через `loader/download/{ext}`. Запуск — с root
(libsu), `chmod 777` + `Shell.cmd(...)`. Подробности в FINDINGS.md.
