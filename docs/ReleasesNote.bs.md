<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *Android aplikacija za upravljanje vašim fotografijama i videozapisima: moćna, privatna i bez reklama*

---

</div>

## 📌 **Pregled**

**Simon-Galleria** je nativna **Android** galerija fotografija i videozapisa stvorena za ljude koji žele potpunu kontrolu nad svojim uspomenama bez odricanja od praktičnosti. Bez reklama, bez praćenja i bez nepotrebnih dozvola: samo brzo, uredno iskustvo prilagođeno vama.

Možete pregledati, organizovati i uređivati svoje fotografije i videozapise, sakriti svoj najosjetljiviji sadržaj i vratiti izbrisane stavke u sekundama zahvaljujući ugrađenoj korpi za smeće. Sve radi **direktno na vašem uređaju**, u potpunoj privatnosti.

---

## ✨ **Značajke**

* 🖼️ **Ugrađeni uređivač fotografija:** obrežite, promijenite veličinu, rotirajte, preokrenite, crtajte i primijenite filtere unutar aplikacije.
* 🔐 **Privatnost na prvom mjestu:** uklonite EXIF metapodatke poput GPS koordinata i detalja kamere.
* 🔒 **Napredna sigurnost:** zaključajte fotografije, videozapise ili cijelu aplikaciju PIN-om, uzorkom ili otiskom prsta.
* ♻️ **Ugrađena korpa za smeće:** vratite slučajno izbrisane fotografije i videozapise u sekundama.
* 🎨 **Dinamičke teme:** Material Design sa svijetlim/tamnim temama koje prate sistem, plus prilagođene teme.
* 📷 **Mnogi podržani formati:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF i mnogi drugi.
* 🔍 **Pretraga i mape:** brza pretraga medija i upravljanje uključenim, isključenim i skrivenim mapama.
* 🖥️ **Pozadina i widget:** postavite fotografiju kao pozadinu i dodajte widget mape na početni ekran.
* 📴 **Veza nije potrebna:** aplikacija radi potpuno **offline**.

---

## 📲 **Kompatibilnost**

| | |
|---|---|
| **Android** | 8.0 (Oreo) i noviji |
| **Minimalna verzija** | API 26 |
| **Target SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Paket** | `com.simonecompany.simongalleria` |
| **Verzija** | `1.0.0` (build 28) |

---

## 🔐 **Privatnost i sigurnost**

Privatnost je srce aplikacije: bez računa, bez prikupljanja podataka i bez veze sa vanjskim svijetom. Funkcije zaključavanja štite cijelu aplikaciju ili samo sadržaj koji odaberete, dok uklanjanje EXIF metapodataka sprječava slučajno dijeljenje vaše lokacije ili detalja snimanja.

| Dozvola | Kada | Čemu služi |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Čitanje fotografija i videozapisa na uređaju |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektivni pristup odabranim datotekama |
| `ACCESS_MEDIA_LOCATION` | uvijek | Čitanje lokacije iz EXIF metapodataka |
| `SET_WALLPAPER` | na zahtjev | Postavljanje fotografije kao pozadine |
| `POST_NOTIFICATIONS` | Android 13+ | Obavještenja aplikacije |
| `WRITE_EXTERNAL_STORAGE` | do Android 10 | Čuvanje i uređivanje medija |
| `MANAGE_EXTERNAL_STORAGE` | opcionalno | Potpuno upravljanje datotekama |
| `RECEIVE_BOOT_COMPLETED` | uvijek | Osvježavanje liste medija nakon ponovnog pokretanja |

Aplikacija **ne** zahtijeva dozvolu za mrežu ni pristup kameri.

---

## 🧑‍💻 **Razvoj**

Projekat se gradi pomoću **Gradle** i **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug APK
./gradlew assembleFossRelease   # release APK
```

---

## 🐛 **Poznati problemi**

* Nijedan prijavljen u vrijeme izdavanja.

---

<div align="center">

### ⭐ Ako vam je aplikacija korisna, ostavite zvjezdicu ⭐

</div>
