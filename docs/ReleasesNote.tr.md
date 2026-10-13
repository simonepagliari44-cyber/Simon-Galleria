<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *Fotoğraf ve videolarınızı yönetmek için Android uygulaması: güçlü, gizli ve reklamsız*

---

</div>

## 📌 **Genel Bakış**

**Simon-Galleria**, kolaylıktan ödün vermeden anıları üzerinde tam kontrol isteyen kişiler için geliştirilmiş yerel bir **Android** fotoğraf ve video galerisidir. Reklam yok, izleme yok ve gereksiz izin yok: sadece size özel, hızlı ve düzenli bir deneyim.

Fotoğraf ve videolarınızı görüntüleyebilir, organize edebilir ve düzenleyebilir, en hassas içeriğinizi gizleyebilir ve dahili geri dönüşüm kutusu sayesinde silinen öğeleri saniyeler içinde kurtarabilirsiniz. Her şey **doğrudan cihazınızda**, tam bir gizlilikle çalışır.

---

## ✨ **Özellikler**

* 🖼️ **Dahili fotoğraf düzenleyici:** uygulama içinde kırpın, yeniden boyutlandırın, döndürün, çevirin, çizin ve filtre uygulayın.
* 🔐 **Önce gizlilik:** GPS koordinatları ve kamera ayrıntıları gibi EXIF meta verilerini kaldırın.
* 🔒 **Gelişmiş güvenlik:** fotoğrafları, videoları veya tüm uygulamayı PIN, desen ya da parmak iziyle kilitleyin.
* ♻️ **Dahili geri dönüşüm kutusu:** yanlışlıkla silinen fotoğraf ve videoları saniyeler içinde kurtarın.
* 🎨 **Dinamik temalar:** sistemi takip eden açık/koyu temalı Material Design ve ayrıca özel temalar.
* 📷 **Birçok desteklenen biçim:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF ve çok daha fazlası.
* 🔍 **Arama ve klasörler:** hızlı medya araması ile dahil edilen, hariç tutulan ve gizli klasörlerin yönetimi.
* 🖥️ **Duvar kağıdı ve widget:** bir fotoğrafı duvar kağıdı olarak ayarlayın ve klasör widget'ını ana ekranınıza ekleyin.
* 📴 **Bağlantı gerekmez:** uygulama tamamen **çevrimdışı** çalışır.

---

## 📲 **Uyumluluk**

| | |
|---|---|
| **Android** | 8.0 (Oreo) ve sonrası |
| **Minimum sürüm** | API 26 |
| **Hedef SDK** | API 36 |
| **Derleme SDK** | API 36 |
| **Paket** | `com.simonecompany.simongalleria` |
| **Sürüm** | `1.0.0` (build 28) |

---

## 🔐 **Gizlilik ve güvenlik**

Gizlilik uygulamanın kalbidir: hesap yok, veri toplanmaz ve dış dünyayla bağlantı yok. Kilit özellikleri tüm uygulamayı veya yalnızca seçtiğiniz içeriği korur; EXIF meta verilerini kaldırmak ise konumunuzu veya çekim ayrıntılarınızı yanlışlıkla paylaşmanızı önler.

| İzin | Ne zaman | Ne için |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Cihazdaki fotoğraf ve videoları okuma |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Seçilen dosyalara seçmeli erişim |
| `ACCESS_MEDIA_LOCATION` | her zaman | EXIF meta verilerinden konumu okuma |
| `SET_WALLPAPER` | istendiğinde | Bir fotoğrafı duvar kağıdı olarak ayarlama |
| `POST_NOTIFICATIONS` | Android 13+ | Uygulama bildirimleri |
| `WRITE_EXTERNAL_STORAGE` | Android 10'a kadar | Medyayı kaydetme ve düzenleme |
| `MANAGE_EXTERNAL_STORAGE` | isteğe bağlı | Tam dosya yönetimi |
| `RECEIVE_BOOT_COMPLETED` | her zaman | Yeniden başlatmadan sonra medya listesini yenileme |

Uygulama ağ izni veya kamera erişimi **gerektirmez**.

---

## 🧑‍💻 **Geliştirme**

Proje **Gradle** ve **Kotlin** ile oluşturulmuştur:

```bash
./gradlew assembleFossDebug     # hata ayıklama APK'sı
./gradlew assembleFossRelease   # sürüm APK'sı
```

---

## 🐛 **Bilinen sorunlar**

* Sürüm sırasında bildirilen bir sorun yok.

---

<div align="center">

### ⭐ Uygulamayı faydalı bulursanız bir yıldız bırakın ⭐

</div>
