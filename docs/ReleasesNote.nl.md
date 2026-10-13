<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria-pictogram" width="120" height="120" />

### *Android-app om je foto's en video's te beheren: krachtig, privé en zonder advertenties*

---

</div>

## 📌 **Overzicht**

**Simon-Galleria** is een native **Android**-galerij voor foto's en video's, gebouwd voor mensen die volledige controle willen over hun herinneringen zonder in te leveren op gemak. Geen advertenties, geen tracking en geen onnodige machtigingen: alleen een snelle, overzichtelijke ervaring op maat voor jou.

Je kunt je foto's en video's bekijken, ordenen en bewerken, je meest gevoelige inhoud verbergen en verwijderde items binnen enkele seconden herstellen dankzij de ingebouwde prullenbak. Alles draait **rechtstreeks op je apparaat**, in volledige privacy.

---

## ✨ **Functies**

* 🖼️ **Ingebouwde fotobewerker:** bijsnijden, formaat wijzigen, roteren, spiegelen, tekenen en filters toepassen direct in de app.
* 🔐 **Privacy voorop:** verwijder EXIF-metadata zoals GPS-coördinaten en cameradetails.
* 🔒 **Geavanceerde beveiliging:** vergrendel foto's, video's of de hele app met een pincode, patroon of vingerafdruk.
* ♻️ **Ingebouwde prullenbak:** herstel per ongeluk verwijderde foto's en video's binnen enkele seconden.
* 🎨 **Dynamische thema's:** Material Design met lichte/donkere thema's die het systeem volgen, plus aangepaste thema's.
* 📷 **Veel ondersteunde formaten:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF en nog veel meer.
* 🔍 **Zoeken en mappen:** snel media zoeken en beheer van opgenomen, uitgesloten en verborgen mappen.
* 🖥️ **Achtergrond en widget:** stel een foto in als achtergrond en voeg de mapwidget toe aan je startscherm.
* 📴 **Geen verbinding nodig:** de app werkt volledig **offline**.

---

## 📲 **Compatibiliteit**

| | |
|---|---|
| **Android** | 8.0 (Oreo) en hoger |
| **Minimale versie** | API 26 |
| **Doel-SDK** | API 36 |
| **Compile-SDK** | API 36 |
| **Pakket** | `com.simonecompany.simongalleria` |
| **Versie** | `1.0.0` (build 28) |

---

## 🔐 **Privacy en beveiliging**

Privacy is het hart van de app: geen account, geen verzamelde gegevens en geen verbinding met de buitenwereld. De vergrendelingsfuncties beschermen de hele app of alleen de inhoud die je kiest, terwijl het verwijderen van EXIF-metadata voorkomt dat je per ongeluk je locatie of opnamedetails deelt.

| Machtiging | Wanneer | Waarvoor het dient |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Foto's en video's op het apparaat lezen |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selectieve toegang tot gekozen bestanden |
| `ACCESS_MEDIA_LOCATION` | altijd | Locatie uit EXIF-metadata lezen |
| `SET_WALLPAPER` | op verzoek | Een foto als achtergrond instellen |
| `POST_NOTIFICATIONS` | Android 13+ | Appmeldingen |
| `WRITE_EXTERNAL_STORAGE` | tot Android 10 | Media opslaan en bewerken |
| `MANAGE_EXTERNAL_STORAGE` | optioneel | Volledig bestandsbeheer |
| `RECEIVE_BOOT_COMPLETED` | altijd | De medialijst vernieuwen na een herstart |

De app **vereist geen** netwerkmachtiging of cameratoegang.

---

## 🧑‍💻 **Ontwikkeling**

Het project is gebouwd met **Gradle** en **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug-APK
./gradlew assembleFossRelease   # release-APK
```

---

## 🐛 **Bekende problemen**

* Geen gemeld op het moment van release.

---

<div align="center">

### ⭐ Als je de app nuttig vindt, laat een ster achter ⭐

</div>
