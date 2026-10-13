<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Icon ng Simon-Galleria" width="120" height="120" />

### *Android app para pamahalaan ang iyong mga larawan at video: makapangyarihan, pribado, at walang ad*

---

</div>

## 📌 **Pangkalahatang-tanaw**

Ang **Simon-Galleria** ay isang native na gallery ng larawan at video para sa **Android** na ginawa para sa mga taong nais ng buong kontrol sa kanilang mga alaala nang hindi isinasantabi ang kaginhawahan. Walang mga ad, walang tracking, at walang mga hindi kailangang pahintulot: isang mabilis at maayos na karanasang inihanda para sa iyo.

Maaari mong tingnan, ayusin, at i-edit ang iyong mga larawan at video, itago ang iyong pinakasensitibong nilalaman, at mabawi ang mga tinanggal na item sa ilang segundo salamat sa built-in na recycle bin. Lahat ay tumatakbo **direkta sa iyong device**, sa ganap na privacy.

---

## ✨ **Mga Tampok**

* 🖼️ **Built-in na photo editor:** mag-crop, magpalit ng laki, mag-rotate, mag-flip, gumuhit, at maglapat ng mga filter mismo sa loob ng app.
* 🔐 **Privacy muna:** alisin ang EXIF metadata tulad ng mga GPS coordinate at mga detalye ng camera.
* 🔒 **Advanced na seguridad:** i-lock ang mga larawan, video, o ang buong app gamit ang PIN, pattern, o fingerprint.
* ♻️ **Built-in na recycle bin:** mabawi ang hindi sinasadyang natanggal na mga larawan at video sa ilang segundo.
* 🎨 **Dynamic na mga tema:** Material Design na may maliwanag/madilim na mga tema na sumusunod sa system, at mga custom na tema.
* 📷 **Maraming sinusuportahang format:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF, at marami pang iba.
* 🔍 **Paghahanap at mga folder:** mabilis na paghahanap ng media at pamamahala ng mga kasama, hindi kasama, at nakatagong folder.
* 🖥️ **Wallpaper at widget:** itakda ang isang larawan bilang iyong wallpaper at idagdag ang folder widget sa iyong home screen.
* 📴 **Walang koneksyon na kailangan:** ganap na gumagana ang app na **offline**.

---

## 📲 **Pagkakatugma**

| | |
|---|---|
| **Android** | 8.0 (Oreo) at mas bago |
| **Minimum na bersyon** | API 26 |
| **Target na SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Package** | `com.simonecompany.simongalleria` |
| **Bersyon** | `1.0.0` (build 28) |

---

## 🔐 **Privacy at seguridad**

Ang privacy ang puso ng app: walang account, walang nakolektang data, at walang koneksyon sa labas ng mundo. Pinoprotektahan ng mga lock feature ang buong app o ang nilalamang pinili mo lamang, habang ang pag-alis ng EXIF metadata ay pumipigil sa hindi sinasadyang pagbahagi ng iyong lokasyon o mga detalye ng pagkuha.

| Pahintulot | Kailan | Para saan ito |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Basahin ang mga larawan at video sa device |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Piling access sa mga piniling file |
| `ACCESS_MEDIA_LOCATION` | palagi | Basahin ang lokasyon mula sa EXIF metadata |
| `SET_WALLPAPER` | kapag hiniling | Itakda ang larawan bilang wallpaper |
| `POST_NOTIFICATIONS` | Android 13+ | Mga notification ng app |
| `WRITE_EXTERNAL_STORAGE` | hanggang Android 10 | I-save at i-edit ang media |
| `MANAGE_EXTERNAL_STORAGE` | opsyonal | Buong pamamahala ng file |
| `RECEIVE_BOOT_COMPLETED` | palagi | I-refresh ang listahan ng media pagkatapos ng reboot |

Ang app ay **hindi** nangangailangan ng pahintulot sa network o access sa camera.

---

## 🧑‍💻 **Pag-develop**

Ang proyekto ay binuo gamit ang **Gradle** at **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug APK
./gradlew assembleFossRelease   # release APK
```

---

## 🐛 **Mga kilalang isyu**

* Wala pang naiulat sa oras ng paglabas.

---

<div align="center">

### ⭐ Kung nakita mong kapaki-pakinabang ang app, mag-iwan ng bituin ⭐

</div>
