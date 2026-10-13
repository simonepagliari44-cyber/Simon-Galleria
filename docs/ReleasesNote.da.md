<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria-ikon" width="120" height="120" />

### *Android-app til at administrere dine fotos og videoer: kraftfuld, privat og annoncefri*

---

</div>

## 📌 **Oversigt**

**Simon-Galleria** er et native **Android**-foto- og videogalleri bygget til folk, der vil have fuld kontrol over deres minder uden at give afkald på bekvemmelighed. Ingen annoncer, ingen sporing og ingen unødvendige tilladelser: bare en hurtig og ryddelig oplevelse skræddersyet til dig.

Du kan se, organisere og redigere dine fotos og videoer, skjule dit mest følsomme indhold og gendanne slettede elementer på få sekunder takket være den indbyggede papirkurv. Alt kører **direkte på din enhed**, i fuld privatliv.

---

## ✨ **Funktioner**

* 🖼️ **Indbygget fotoredigering:** beskær, tilpas størrelse, roter, vend, tegn og anvend filtre direkte i appen.
* 🔐 **Privatliv først:** fjern EXIF-metadata som GPS-koordinater og kameraoplysninger.
* 🔒 **Avanceret sikkerhed:** lås fotos, videoer eller hele appen med PIN, mønster eller fingeraftryk.
* ♻️ **Indbygget papirkurv:** gendan utilsigtet slettede fotos og videoer på få sekunder.
* 🎨 **Dynamiske temaer:** Material Design med lyse/mørke temaer, der følger systemet, plus brugerdefinerede temaer.
* 📷 **Mange understøttede formater:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF og mange flere.
* 🔍 **Søgning og mapper:** hurtig mediesøgning og håndtering af inkluderede, ekskluderede og skjulte mapper.
* 🖥️ **Baggrund og widget:** indstil et foto som baggrund, og føj mappewidgetten til din startskærm.
* 📴 **Ingen forbindelse påkrævet:** appen fungerer helt **offline**.

---

## 📲 **Kompatibilitet**

| | |
|---|---|
| **Android** | 8.0 (Oreo) og nyere |
| **Minimumsversion** | API 26 |
| **Mål-SDK** | API 36 |
| **Kompilerings-SDK** | API 36 |
| **Pakke** | `com.simonecompany.simongalleria` |
| **Version** | `1.0.0` (build 28) |

---

## 🔐 **Privatliv og sikkerhed**

Privatliv er appens hjerte: ingen konto, ingen indsamlede data og ingen forbindelse til omverdenen. Låsefunktionerne beskytter hele appen eller kun det indhold, du vælger, mens fjernelse af EXIF-metadata forhindrer utilsigtet deling af din placering eller optagelsesoplysninger.

| Tilladelse | Hvornår | Hvad den er til |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Læs fotos og videoer på enheden |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektiv adgang til valgte filer |
| `ACCESS_MEDIA_LOCATION` | altid | Læs placering fra EXIF-metadata |
| `SET_WALLPAPER` | efter anmodning | Indstil et foto som baggrund |
| `POST_NOTIFICATIONS` | Android 13+ | Appens notifikationer |
| `WRITE_EXTERNAL_STORAGE` | op til Android 10 | Gem og rediger medier |
| `MANAGE_EXTERNAL_STORAGE` | valgfrit | Fuld filhåndtering |
| `RECEIVE_BOOT_COMPLETED` | altid | Opdater medielisten efter en genstart |

Appen **kræver ikke** netværkstilladelse eller kameraadgang.

---

## 🧑‍💻 **Udvikling**

Projektet bygges med **Gradle** og **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug-APK
./gradlew assembleFossRelease   # release-APK
```

---

## 🐛 **Kendte problemer**

* Ingen rapporteret på udgivelsestidspunktet.

---

<div align="center">

### ⭐ Hvis du finder appen nyttig, giv den en stjerne ⭐

</div>
