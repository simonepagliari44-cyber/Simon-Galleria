<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Tákn Simon-Galleria" width="120" height="120" />

### *Android-forrit til að stjórna myndunum þínum og myndböndum: öflugt, persónulegt og auglýsingalaust*

---

</div>

## 📌 **Yfirlit**

**Simon-Galleria** er innfædd **Android** mynda- og myndbandagallerí byggt fyrir fólk sem vill fulla stjórn á minningum sínum án þess að gefa eftir þægindi. Engar auglýsingar, engin rakning og engar ónauðsynlegar heimildir: bara hröð og snyrtileg upplifun sniðin fyrir þig.

Þú getur skoðað, skipulagt og breytt myndunum þínum og myndböndum, falið viðkvæmasta efnið þitt og endurheimt eydda hluti á sekúndum þökk sé innbyggðu ruslatunnunni. Allt keyrir **beint á tækinu þínu**, í fullri persónuvernd.

---

## ✨ **Eiginleikar**

* 🖼️ **Innbyggð myndvinnsla:** klipptu, breyttu stærð, snúðu, flettu, teiknaðu og settu á síur beint í forritinu.
* 🔐 **Persónuvernd í fyrsta sæti:** fjarlægðu EXIF lýsigögn eins og GPS-hnit og upplýsingar um myndavél.
* 🔒 **Ítarlegt öryggi:** læstu myndir, myndbönd eða allt forritið með PIN, mynstri eða fingrafari.
* ♻️ **Innbyggð ruslatappa:** endurheimtu myndir og myndbönd sem eytt var óviljandi á sekúndum.
* 🎨 **Dynamísk þemu:** Material Design með ljósu/dökku þemum sem fylgja kerfinu, auk sérsniðinna þema.
* 📷 **Mörg studd snið:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF og margt fleira.
* 🔍 **Leit og möppur:** hröð leit að efni og stjórnun á inniföldum, undanskildum og földum möppum.
* 🖥️ **Veggfóður og græja:** stilltu mynd sem veggfóður og bættu möppugræjunni við heimaskjáinn þinn.
* 📴 **Engin tenging nauðsynleg:** forritið virkar alveg **án nettengdar**.

---

## 📲 **Samhæfni**

| | |
|---|---|
| **Android** | 8.0 (Oreo) og nýrri |
| **Lágmarksútgáfa** | API 26 |
| **Mark SDK** | API 36 |
| **Þýðingar SDK** | API 36 |
| **Pakki** | `com.simonecompany.simongalleria` |
| **Útgáfa** | `1.0.0` (build 28) |

---

## 🔐 **Persónuvernd og öryggi**

Persónuvernd er hjarta forritsins: enginn reikningur, engum gögnum safnað og engin tenging við umheiminn. Læsingareiginleikarnir vernda allt forritið eða aðeins efnið sem þú velur, en fjarlæging EXIF lýsigagna kemur í veg fyrir að staðsetning þín eða upplýsingar um myndatöku deilist óvart.

| Heimild | Hvenær | Við hvað hún er |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Lesa myndir og myndbönd á tækinu |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Sértækur aðgangur að völdum skrám |
| `ACCESS_MEDIA_LOCATION` | alltaf | Lesa staðsetningu úr EXIF lýsigögnum |
| `SET_WALLPAPER` | við beiðni | Stillir mynd sem veggfóður |
| `POST_NOTIFICATIONS` | Android 13+ | Tilkynningar forritsins |
| `WRITE_EXTERNAL_STORAGE` | upp að Android 10 | Vista og breyta efni |
| `MANAGE_EXTERNAL_STORAGE` | valfrjálst | Full skráastjórnun |
| `RECEIVE_BOOT_COMPLETED` | alltaf | Uppfæra efnisskrána eftir endurræsingu |

Forritið krefst **ekki** nettengingarheimildar eða aðgangs að myndavél.

---

## 🧑‍💻 **Þróun**

Verkefnið er byggt með **Gradle** og **Kotlin**:

```bash
./gradlew assembleFossDebug     # villuleitar-APK
./gradlew assembleFossRelease   # útgáfu-APK
```

---

## 🐛 **Þekkt vandamál**

* Ekkert tilkynnt þegar útgáfan kom út.

---

<div align="center">

### ⭐ Ef þú finnur forritið gagnlegt, skildu eftir stjörnu ⭐

</div>
