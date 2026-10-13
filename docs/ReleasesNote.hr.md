<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ikona aplikacije Simon-Galleria" width="120" height="120" />

### *Android aplikacija za upravljanje vašim fotografijama i videozapisima: moćna, privatna i bez oglasa*

---

</div>

## 📌 **Pregled**

**Simon-Galleria** izvorna je **Android** galerija fotografija i videozapisa stvorena za ljude koji žele potpunu kontrolu nad svojim uspomenama bez odricanja od praktičnosti. Bez oglasa, bez praćenja i bez nepotrebnih dopuštenja: samo brzo i uredno iskustvo skrojeno za vas.

Možete pregledavati, organizirati i uređivati svoje fotografije i videozapise, skriti najosjetljiviji sadržaj i oporaviti izbrisane stavke u sekundama zahvaljujući ugrađenoj košari za smeće. Sve se izvodi **izravno na vašem uređaju**, uz potpunu privatnost.

---

## ✨ **Značajke**

* 🖼️ **Ugrađeni uređivač fotografija:** izrežite, promijenite veličinu, zarotirajte, preokrenite, crtajte i primijenite filtre izravno u aplikaciji.
* 🔐 **Privatnost na prvom mjestu:** uklonite EXIF metapodatke poput GPS koordinata i pojedinosti kamere.
* 🔒 **Napredna sigurnost:** zaključajte fotografije, videozapise ili cijelu aplikaciju PIN-om, uzorkom ili otiskom prsta.
* ♻️ **Ugrađena košara za smeće:** oporavite slučajno izbrisane fotografije i videozapise u sekundama.
* 🎨 **Dinamičke teme:** Material Design sa svijetlim/tamnim temama koje prate sustav, plus prilagođene teme.
* 📷 **Mnogi podržani formati:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF i mnogi drugi.
* 🔍 **Pretraga i mape:** brza pretraga medija i upravljanje uključenim, isključenim i skrivenim mapama.
* 🖥️ **Pozadina i widget:** postavite fotografiju kao pozadinu i dodajte widget mape na početni zaslon.
* 📴 **Nije potrebna veza:** aplikacija radi potpuno **izvan mreže**.

---

## 📲 **Kompatibilnost**

| | |
|---|---|
| **Android** | 8.0 (Oreo) i noviji |
| **Najniža verzija** | API 26 |
| **Ciljni SDK** | API 36 |
| **SDK za kompilaciju** | API 36 |
| **Paket** | `com.simonecompany.simongalleria` |
| **Verzija** | `1.0.0` (build 28) |

---

## 🔐 **Privatnost i sigurnost**

Privatnost je srce aplikacije: bez računa, bez prikupljanja podataka i bez veze s vanjskim svijetom. Značajke zaključavanja štite cijelu aplikaciju ili samo sadržaj koji odaberete, dok uklanjanje EXIF metapodataka sprječava slučajno dijeljenje vaše lokacije ili pojedinosti snimanja.

| Dopuštenje | Kada | Čemu služi |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Čitanje fotografija i videozapisa na uređaju |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektivni pristup odabranim datotekama |
| `ACCESS_MEDIA_LOCATION` | uvijek | Čitanje lokacije iz EXIF metapodataka |
| `SET_WALLPAPER` | na zahtjev | Postavljanje fotografije kao pozadine |
| `POST_NOTIFICATIONS` | Android 13+ | Obavijesti aplikacije |
| `WRITE_EXTERNAL_STORAGE` | do Android 10 | Spremanje i uređivanje medija |
| `MANAGE_EXTERNAL_STORAGE` | neobavezno | Potpuno upravljanje datotekama |
| `RECEIVE_BOOT_COMPLETED` | uvijek | Osvježavanje popisa medija nakon ponovnog pokretanja |

Aplikacija **ne** zahtijeva dopuštenje za mrežu ni pristup kameri.

---

## 🧑‍💻 **Razvoj**

Projekt se gradi pomoću **Gradle** i **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug APK
./gradlew assembleFossRelease   # release APK
```

---

## 🐛 **Poznati problemi**

* Nijedan prijavljen u vrijeme izdanja.

---

<div align="center">

### ⭐ Ako vam je aplikacija korisna, ostavite zvjezdicu ⭐

</div>
