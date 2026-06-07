# Бинарник лоадера (нативный исполняемый файл)

Скачано с backend `https://elixir-api.cc/` (см. [../FINDINGS.md](../FINDINGS.md)).

## elixir_external_v1.6.8

| Поле | Значение |
|------|----------|
| Версия | 1.6.8 (`external`) |
| Версия игры | 0.38.2 (Standoff 2) |
| Changelog | "- fixed network issues" |
| URL | `https://elixir-api.cc/version/download/executable_external_v1.6.8_1780564097098` |
| Получен через | `GET version/check?is_pc=false&sub_type=external` → поле `downloadUrl` |
| Размер | 53 361 776 байт |
| SHA-256 | `360c421b008f53378fe446953ec1b5000671de898f554f6b3420b9553639f335` ✓ (совпал с `hash` из version/check) |
| Тип | ELF 64-bit LSB PIE, ARM aarch64, interpreter `/system/bin/linker64`, dynamically linked, **not stripped** |
| BuildID (sha1) | `8382dabb9090e764fd6b41c51aef75f7064cec93` |

> ⚠️ Это нативный Android-исполняемый файл, который приложение запускает с правами
> root (`chmod 777` + `Shell.cmd` через libsu). Файл сохранён только для разбора —
> **не запускался**. Запускать недоверенный бинарник опасно.

Проверка целостности:

```sh
sha256sum elixir_external_v1.6.8
# 360c421b008f53378fe446953ec1b5000671de898f554f6b3420b9553639f335
```
