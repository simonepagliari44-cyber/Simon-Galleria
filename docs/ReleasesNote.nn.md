<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria-ikon" width="120" height="120" />

### *Android-app for å handsame bileta og videoane dine: kraftfull, privat og annonsefri*

---

</div>

## 📌 **Oversikt**

**Simon-Galleria** er eit nativt **Android**-bilete- og videogalleri laga for folk som vil ha full kontroll over minna sine utan å gi avkall på komfort. Ingen annonsar, ingen sporing og ingen unødvendige løyve: berre ei rask og ryddig oppleving skreddarsydd for deg.

Du kan sjå, organisere og redigere bileta og videoane dine, gøyme det mest sensitive innhaldet og gjenopprette sletta element i løpet av sekund takka vere den innebygde papirkorga. Alt køyrer **direkte på eininga di**, i fullstendig privatliv.

---

## ✨ **Funksjonar**

* 🖼️ **Innebygd fotoredigerar:** skjer, endre storleik, roter, spegelvend, teikn og bruk filter rett i appen.
* 🔐 **Personvern først:** fjern EXIF-metadata som GPS-koordinatar og kameradetaljar.
* 🔒 **Avansert tryggleik:** lås bilete, videoar eller heile appen med ein PIN, eit mønster eller fingeravtrykk.
* ♻️ **Innebygd papirkorg:** gjenopprett utilsikta sletta bilete og videoar i løpet av sekund.
* 🎨 **Dynamiske tema:** Material Design med lyse/mørke tema som følgjer systemet, pluss tilpassa tema.
* 📷 **Mange støtta format:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF og mange fleire.
* 🔍 **Søk og mapper:** rask mediesøk og handsaming av inkluderte, ekskluderte og skjulte mapper.
* 🖥️ **Bakgrunn og widget:** set eit bilete som bakgrunn og legg mappewidgeten til på startskjermen.
* 📴 **Inga tilkopling nødvendig:** appen fungerer heilt **offline**.

---

## 📲 **Kompatibilitet**

| | |
|---|---|
| **Android** | 8.0 (Oreo) og seinare |
| **Minimumsversjon** | API 26 |
| **Mål-SDK** | API 36 |
| **Kompilerings-SDK** | API 36 |
| **Pakke** | `com.simonecompany.simongalleria` |
| **Versjon** | `1.0.0` (build 28) |

---

## 🔐 **Personvern og tryggleik**

Personvern er hjartet i appen: ingen konto, ingen innsamla data og inga tilkopling til omverda. Låsefunksjonane verner heile appen eller berre innhaldet du vel, medan fjerning av EXIF-metadata hindrar at du ved eit uhell deler posisjonen eller opptaksdetaljane dine.

| Løyve | Når | Kva det er til |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Lese bilete og videoar på eininga |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektiv tilgang til valde filer |
| `ACCESS_MEDIA_LOCATION` | alltid | Lese posisjon frå EXIF-metadata |
| `SET_WALLPAPER` | på førespurnad | Sette eit bilete som bakgrunn |
| `POST_NOTIFICATIONS` | Android 13+ | Appvarsel |
| `WRITE_EXTERNAL_STORAGE` | opp til Android 10 | Lagre og redigere media |
| `MANAGE_EXTERNAL_STORAGE` | valfritt | Full filhandsaming |
| `RECEIVE_BOOT_COMPLETED` | alltid | Oppdatere medielista etter omstart |

Appen **krev ikkje** nettverkstilgang eller kameratilgang.

---

## 🧑‍💻 **Utvikling**

Prosjektet er bygd med **Gradle** og **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug-APK
./gradlew assembleFossRelease   # release-APK
```

---

## 🐛 **Kjende problem**

* Ingen rapportert på utgivingstidspunktet.

---

<div align="center">

### ⭐ Om du finn appen nyttig, gi han ei stjerne ⭐

</div>
