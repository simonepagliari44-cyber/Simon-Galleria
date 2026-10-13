<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria-ikon" width="120" height="120" />

### *Android-app for å administrere bildene og videoene dine: kraftig, privat og annonsefri*

---

</div>

## 📌 **Oversikt**

**Simon-Galleria** er et nativt **Android**-bilde- og videogalleri laget for folk som vil ha full kontroll over minnene sine uten å gi avkall på bekvemmelighet. Ingen annonser, ingen sporing og ingen unødvendige tillatelser: bare en rask og ryddig opplevelse skreddersydd for deg.

Du kan vise, organisere og redigere bildene og videoene dine, skjule det mest sensitive innholdet og gjenopprette slettede elementer i løpet av sekunder takket være den innebygde papirkurven. Alt kjører **direkte på enheten din**, i fullstendig privatliv.

---

## ✨ **Funksjoner**

* 🖼️ **Innebygd fotoredigerer:** beskjær, endre størrelse, roter, speilvend, tegn og bruk filtre rett i appen.
* 🔐 **Personvern først:** fjern EXIF-metadata som GPS-koordinater og kameradetaljer.
* 🔒 **Avansert sikkerhet:** lås bilder, videoer eller hele appen med en PIN, et mønster eller fingeravtrykk.
* ♻️ **Innebygd papirkurv:** gjenopprett utilsiktet slettede bilder og videoer i løpet av sekunder.
* 🎨 **Dynamiske temaer:** Material Design med lyse/mørke temaer som følger systemet, pluss egendefinerte temaer.
* 📷 **Mange støttede formater:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF og mange flere.
* 🔍 **Søk og mapper:** rask mediesøk og administrasjon av inkluderte, ekskluderte og skjulte mapper.
* 🖥️ **Bakgrunn og widget:** sett et bilde som bakgrunn og legg mappewidgeten til på startskjermen.
* 📴 **Ingen tilkobling nødvendig:** appen fungerer helt **offline**.

---

## 📲 **Kompatibilitet**

| | |
|---|---|
| **Android** | 8.0 (Oreo) og senere |
| **Minimumsversjon** | API 26 |
| **Mål-SDK** | API 36 |
| **Kompilerings-SDK** | API 36 |
| **Pakke** | `com.simonecompany.simongalleria` |
| **Versjon** | `1.0.0` (build 28) |

---

## 🔐 **Personvern og sikkerhet**

Personvern er hjertet i appen: ingen konto, ingen innsamlede data og ingen tilkobling til omverdenen. Låsefunksjonene beskytter hele appen eller bare innholdet du velger, mens fjerning av EXIF-metadata forhindrer at du ved uhell deler posisjonen eller opptaksdetaljene dine.

| Tillatelse | Når | Hva den brukes til |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Lese bilder og videoer på enheten |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektiv tilgang til valgte filer |
| `ACCESS_MEDIA_LOCATION` | alltid | Lese posisjon fra EXIF-metadata |
| `SET_WALLPAPER` | på forespørsel | Sette et bilde som bakgrunn |
| `POST_NOTIFICATIONS` | Android 13+ | Appvarsler |
| `WRITE_EXTERNAL_STORAGE` | opp til Android 10 | Lagre og redigere media |
| `MANAGE_EXTERNAL_STORAGE` | valgfritt | Full filadministrasjon |
| `RECEIVE_BOOT_COMPLETED` | alltid | Oppdatere medielisten etter omstart |

Appen **krever ikke** nettverkstillatelse eller kameratilgang.

---

## 🧑‍💻 **Utvikling**

Prosjektet er bygget med **Gradle** og **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug-APK
./gradlew assembleFossRelease   # release-APK
```

---

## 🐛 **Kjente problemer**

* Ingen rapportert på utgivelsestidspunktet.

---

<div align="center">

### ⭐ Hvis du synes appen er nyttig, gi den en stjerne ⭐

</div>
