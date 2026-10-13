<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria-Symbol" width="120" height="120" />

### *Android-App zur Verwaltung deiner Fotos und Videos: leistungsstark, privat und werbefrei*

---

</div>

## 📌 **Überblick**

**Simon-Galleria** ist eine native **Android**-Foto- und Videogalerie für Menschen, die die volle Kontrolle über ihre Erinnerungen wollen, ohne auf Komfort zu verzichten. Keine Werbung, kein Tracking und keine unnötigen Berechtigungen: nur ein schnelles, aufgeräumtes Erlebnis, das auf dich zugeschnitten ist.

Du kannst deine Fotos und Videos ansehen, organisieren und bearbeiten, deine sensibelsten Inhalte verbergen und gelöschte Elemente dank des integrierten Papierkorbs in Sekunden wiederherstellen. Alles läuft **direkt auf deinem Gerät**, in völliger Privatsphäre.

---

## ✨ **Funktionen**

* 🖼️ **Integrierter Fotoeditor:** zuschneiden, Größe ändern, drehen, spiegeln, zeichnen und Filter direkt in der App anwenden.
* 🔐 **Datenschutz zuerst:** entferne EXIF-Metadaten wie GPS-Koordinaten und Kameradetails.
* 🔒 **Erweiterte Sicherheit:** sperre Fotos, Videos oder die gesamte App mit PIN, Muster oder Fingerabdruck.
* ♻️ **Integrierter Papierkorb:** stelle versehentlich gelöschte Fotos und Videos in Sekunden wieder her.
* 🎨 **Dynamische Themes:** Material Design mit hellen/dunklen Themes, die dem System folgen, plus individuelle Themes.
* 📷 **Viele unterstützte Formate:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF und viele mehr.
* 🔍 **Suche und Ordner:** schnelle Mediensuche und Verwaltung von einbezogenen, ausgeschlossenen und versteckten Ordnern.
* 🖥️ **Hintergrundbild und Widget:** lege ein Foto als Hintergrundbild fest und füge das Ordner-Widget zu deinem Startbildschirm hinzu.
* 📴 **Keine Verbindung erforderlich:** die App funktioniert vollständig **offline**.

---

## 📲 **Kompatibilität**

| | |
|---|---|
| **Android** | 8.0 (Oreo) und neuer |
| **Mindestversion** | API 26 |
| **Ziel-SDK** | API 36 |
| **Kompilierungs-SDK** | API 36 |
| **Paket** | `com.simonecompany.simongalleria` |
| **Version** | `1.0.0` (build 28) |

---

## 🔐 **Datenschutz und Sicherheit**

Datenschutz ist das Herzstück der App: kein Konto, keine gesammelten Daten und keine Verbindung zur Außenwelt. Die Sperrfunktionen schützen die gesamte App oder nur die von dir gewählten Inhalte, während das Entfernen von EXIF-Metadaten das versehentliche Teilen deines Standorts oder der Aufnahmedetails verhindert.

| Berechtigung | Wann | Wofür sie dient |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Fotos und Videos auf dem Gerät lesen |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektiver Zugriff auf ausgewählte Dateien |
| `ACCESS_MEDIA_LOCATION` | immer | Standort aus EXIF-Metadaten lesen |
| `SET_WALLPAPER` | auf Anfrage | Ein Foto als Hintergrundbild festlegen |
| `POST_NOTIFICATIONS` | Android 13+ | Benachrichtigungen der App |
| `WRITE_EXTERNAL_STORAGE` | bis Android 10 | Medien speichern und bearbeiten |
| `MANAGE_EXTERNAL_STORAGE` | optional | Vollständige Dateiverwaltung |
| `RECEIVE_BOOT_COMPLETED` | immer | Die Medienliste nach einem Neustart aktualisieren |

Die App **erfordert keine** Netzwerkberechtigung und keinen Kamerazugriff.

---

## 🧑‍💻 **Entwicklung**

Das Projekt wird mit **Gradle** und **Kotlin** erstellt:

```bash
./gradlew assembleFossDebug     # Debug-APK
./gradlew assembleFossRelease   # Release-APK
```

---

## 🐛 **Bekannte Probleme**

* Zum Zeitpunkt der Veröffentlichung keine gemeldet.

---

<div align="center">

### ⭐ Wenn du die App nützlich findest, hinterlasse einen Stern ⭐

</div>
