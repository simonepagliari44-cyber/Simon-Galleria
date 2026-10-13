<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria ikoon" width="120" height="120" />

### *Android-rakendus fotode ja videote haldamiseks: võimas, privaatne ja reklaamivaba*

---

</div>

## 📌 **Ülevaade**

**Simon-Galleria** on natiivne **Android**-i foto- ja videogalerii, mis on loodud inimestele, kes soovivad oma mälestuste üle täielikku kontrolli, loobumata samas mugavusest. Ei reklaame, ei jälgimist ja ei tarbetuid lube: lihtsalt kiire ja korras kogemus, mis on loodud just sinule.

Saad vaadata, korrastada ja redigeerida oma fotosid ja videoid, peita oma kõige tundlikumat sisu ning taastada kustutatud üksused sekunditega tänu sisseehitatud prügikastile. Kõik töötab **otse sinu seadmes**, täielikus privaatsuses.

---

## ✨ **Funktsioonid**

* 🖼️ **Sisseehitatud fotoredaktor:** kärbi, muuda suurust, pööra, peegelda, joonista ja lisa filtreid otse rakenduses.
* 🔐 **Privaatsus enne:** eemalda EXIF metaandmed, nagu GPS-koordinaadid ja kaamera üksikasjad.
* 🔒 **Täiustatud turvalisus:** lukusta fotod, videod või kogu rakendus PIN-koodi, mustri või sõrmejäljega.
* ♻️ **Sisseehitatud prügikast:** taasta kogemata kustutatud fotod ja videod sekunditega.
* 🎨 **Dünaamilised teemad:** Material Design koos heledate/tumedate teemadega, mis järgivad süsteemi, pluss kohandatud teemad.
* 📷 **Palju toetatud vorminguid:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF ja palju muud.
* 🔍 **Otsing ja kaustad:** kiire meediumiotsing ning kaasatud, välistatud ja peidetud kaustade haldamine.
* 🖥️ **Taustapilt ja vidin:** määra foto taustapildiks ja lisa kaustavidin oma avakuvale.
* 📴 **Ühendust pole vaja:** rakendus töötab täielikult **võrguühenduseta**.

---

## 📲 **Ühilduvus**

| | |
|---|---|
| **Android** | 8.0 (Oreo) ja uuemad |
| **Minimaalne versioon** | API 26 |
| **Siht-SDK** | API 36 |
| **Kompileerimise SDK** | API 36 |
| **Pakett** | `com.simonecompany.simongalleria` |
| **Versioon** | `1.0.0` (build 28) |

---

## 🔐 **Privaatsus ja turvalisus**

Privaatsus on rakenduse süda: ei kontot, ei kogutud andmeid ega ühendust välismaailmaga. Lukustusfunktsioonid kaitsevad tervet rakendust või ainult sinu valitud sisu, samas kui EXIF metaandmete eemaldamine hoiab ära sinu asukoha või pildistamise üksikasjade juhusliku jagamise.

| Luba | Millal | Milleks see on |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Seadmes olevate fotode ja videote lugemine |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Valikuline juurdepääs valitud failidele |
| `ACCESS_MEDIA_LOCATION` | alati | Asukoha lugemine EXIF metaandmetest |
| `SET_WALLPAPER` | taotlemisel | Foto määramine taustapildiks |
| `POST_NOTIFICATIONS` | Android 13+ | Rakenduse teavitused |
| `WRITE_EXTERNAL_STORAGE` | kuni Android 10 | Meediumi salvestamine ja redigeerimine |
| `MANAGE_EXTERNAL_STORAGE` | valikuline | Täielik failihaldus |
| `RECEIVE_BOOT_COMPLETED` | alati | Meediumiloendi värskendamine pärast taaskäivitust |

Rakendus **ei** vaja võrgu- ega kaamera luba.

---

## 🧑‍💻 **Arendus**

Projekt on ehitatud **Gradle**-i ja **Kotlin**-iga:

```bash
./gradlew assembleFossDebug     # silumis-APK
./gradlew assembleFossRelease   # väljalaske-APK
```

---

## 🐛 **Teadaolevad probleemid**

* Väljalaske ajal ei ole ühtegi teatatud.

---

<div align="center">

### ⭐ Kui rakendus on sulle kasulik, jäta täht ⭐

</div>
