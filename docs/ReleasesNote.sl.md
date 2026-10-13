<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ikona Simon-Galleria" width="120" height="120" />

### *Aplikacija za Android za upravljanje vaših fotografij in videoposnetkov: zmogljiva, zasebna in brez oglasov*

---

</div>

## 📌 **Pregled**

**Simon-Galleria** je izvorna galerija fotografij in videoposnetkov za **Android**, ustvarjena za ljudi, ki želijo popoln nadzor nad svojimi spomini, ne da bi se odpovedali udobju. Brez oglasov, brez sledenja in brez nepotrebnih dovoljenj: le hitra in urejena izkušnja, prilagojena vam.

Svoje fotografije in videoposnetke lahko pregledujete, organizirate in urejate, skrijete najbolj občutljivo vsebino in v nekaj sekundah obnovite izbrisane elemente zahvaljujoč vgrajenemu košu za smeti. Vse deluje **neposredno na vaši napravi**, v popolni zasebnosti.

---

## ✨ **Funkcije**

* 🖼️ **Vgrajen urejevalnik fotografij:** obrežite, spremenite velikost, zavrtite, prezrcalite, rišite in uporabite filtre kar v aplikaciji.
* 🔐 **Zasebnost na prvem mestu:** odstranite metapodatke EXIF, kot so koordinate GPS in podrobnosti o kameri.
* 🔒 **Napredna varnost:** zaklenite fotografije, videoposnetke ali celotno aplikacijo s PIN, vzorcem ali prstnim odtisom.
* ♻️ **Vgrajen koš za smeti:** v nekaj sekundah obnovite pomotoma izbrisane fotografije in videoposnetke.
* 🎨 **Dinamične teme:** Material Design s svetlimi/temnimi temami, ki sledijo sistemu, in temami po meri.
* 📷 **Številni podprti formati:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF in mnogi drugi.
* 🔍 **Iskanje in mape:** hitro iskanje predstavnostnih datotek in upravljanje vključenih, izključenih in skritih map.
* 🖥️ **Ozadje in gradnik:** nastavite fotografijo kot ozadje in dodajte gradnik mape na domači zaslon.
* 📴 **Brez potrebe po povezavi:** aplikacija deluje popolnoma **brez povezave**.

---

## 📲 **Združljivost**

| | |
|---|---|
| **Android** | 8.0 (Oreo) in novejši |
| **Najnižja različica** | API 26 |
| **Ciljni SDK** | API 36 |
| **SDK za prevajanje** | API 36 |
| **Paket** | `com.simonecompany.simongalleria` |
| **Različica** | `1.0.0` (build 28) |

---

## 🔐 **Zasebnost in varnost**

Zasebnost je srce aplikacije: brez računa, brez zbranih podatkov in brez povezave z zunanjim svetom. Funkcije zaklepanja zaščitijo celotno aplikacijo ali le vsebino, ki jo izberete, medtem ko odstranitev metapodatkov EXIF prepreči nenamerno deljenje vaše lokacije ali podrobnosti snemanja.

| Dovoljenje | Kdaj | Čemu je namenjeno |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Branje fotografij in videoposnetkov v napravi |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Izbirni dostop do izbranih datotek |
| `ACCESS_MEDIA_LOCATION` | vedno | Branje lokacije iz metapodatkov EXIF |
| `SET_WALLPAPER` | na zahtevo | Nastavitev fotografije kot ozadja |
| `POST_NOTIFICATIONS` | Android 13+ | Obvestila aplikacije |
| `WRITE_EXTERNAL_STORAGE` | do Android 10 | Shranjevanje in urejanje predstavnostnih datotek |
| `MANAGE_EXTERNAL_STORAGE` | neobvezno | Popolno upravljanje datotek |
| `RECEIVE_BOOT_COMPLETED` | vedno | Osvežitev seznama predstavnostnih datotek po ponovnem zagonu |

Aplikacija **ne** potrebuje dovoljenja za omrežje ali dostopa do kamere.

---

## 🧑‍💻 **Razvoj**

Projekt je zgrajen z **Gradle** in **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK za odpravljanje napak
./gradlew assembleFossRelease   # izdajni APK
```

---

## 🐛 **Znane težave**

* V času izdaje ni bilo prijavljenih.

---

<div align="center">

### ⭐ Če se vam aplikacija zdi uporabna, pustite zvezdico ⭐

</div>
