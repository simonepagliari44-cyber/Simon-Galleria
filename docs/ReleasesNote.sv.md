<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ikon för Simon-Galleria" width="120" height="120" />

### *Android-app för att hantera dina foton och videor: kraftfull, privat och reklamfri*

---

</div>

## 📌 **Översikt**

**Simon-Galleria** är ett inbyggt galleri för foton och videor för **Android**, byggt för människor som vill ha full kontroll över sina minnen utan att ge avkall på bekvämlighet. Inga annonser, ingen spårning och inga onödiga behörigheter: bara en snabb och prydlig upplevelse skräddarsydd för dig.

Du kan visa, organisera och redigera dina foton och videor, dölja ditt mest känsliga innehåll och återställa raderade objekt på några sekunder tack vare den inbyggda papperskorgen. Allt körs **direkt på din enhet**, helt privat.

---

## ✨ **Funktioner**

* 🖼️ **Inbyggd fotoredigerare:** beskär, ändra storlek, rotera, vänd, rita och använd filter direkt i appen.
* 🔐 **Integritet i första hand:** ta bort EXIF-metadata som GPS-koordinater och kameradetaljer.
* 🔒 **Avancerad säkerhet:** lås foton, videor eller hela appen med PIN, mönster eller fingeravtryck.
* ♻️ **Inbyggd papperskorg:** återställ oavsiktligt raderade foton och videor på några sekunder.
* 🎨 **Dynamiska teman:** Material Design med ljusa/mörka teman som följer systemet, plus anpassade teman.
* 📷 **Många format som stöds:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF och många fler.
* 🔍 **Sökning och mappar:** snabb mediesökning och hantering av inkluderade, uteslutna och dolda mappar.
* 🖥️ **Bakgrundsbild och widget:** ange ett foto som bakgrundsbild och lägg till mappwidgeten på startskärmen.
* 📴 **Ingen anslutning krävs:** appen fungerar helt **offline**.

---

## 📲 **Kompatibilitet**

| | |
|---|---|
| **Android** | 8.0 (Oreo) och senare |
| **Minimiversion** | API 26 |
| **Mål-SDK** | API 36 |
| **Kompilerings-SDK** | API 36 |
| **Paket** | `com.simonecompany.simongalleria` |
| **Version** | `1.0.0` (build 28) |

---

## 🔐 **Integritet och säkerhet**

Integritet är appens hjärta: inget konto, ingen insamlad data och ingen anslutning till omvärlden. Låsfunktionerna skyddar hela appen eller bara det innehåll du väljer, medan borttagning av EXIF-metadata förhindrar att din plats eller dina fotodetaljer delas av misstag.

| Behörighet | När | Vad den används till |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Läsa foton och videor på enheten |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektiv åtkomst till valda filer |
| `ACCESS_MEDIA_LOCATION` | alltid | Läsa plats från EXIF-metadata |
| `SET_WALLPAPER` | på begäran | Ange ett foto som bakgrundsbild |
| `POST_NOTIFICATIONS` | Android 13+ | Appaviseringar |
| `WRITE_EXTERNAL_STORAGE` | till och med Android 10 | Spara och redigera media |
| `MANAGE_EXTERNAL_STORAGE` | valfritt | Fullständig filhantering |
| `RECEIVE_BOOT_COMPLETED` | alltid | Uppdatera medialistan efter en omstart |

Appen **kräver inte** nätverksbehörighet eller kameraåtkomst.

---

## 🧑‍💻 **Utveckling**

Projektet byggs med **Gradle** och **Kotlin**:

```bash
./gradlew assembleFossDebug     # felsöknings-APK
./gradlew assembleFossRelease   # release-APK
```

---

## 🐛 **Kända problem**

* Inga rapporterade vid tidpunkten för utgivningen.

---

<div align="center">

### ⭐ Om du tycker att appen är användbar, lämna en stjärna ⭐

</div>
