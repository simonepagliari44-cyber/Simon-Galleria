<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria ikon" width="120" height="120" />

### *Android-alkalmazás a fotóid és videóid kezeléséhez: erős, privát és reklámmentes*

---

</div>

## 📌 **Áttekintés**

A **Simon-Galleria** egy natív **Android** fotó- és videógaléria azoknak, akik a kényelem feladása nélkül szeretnének teljes irányítást az emlékeik felett. Nincsenek hirdetések, nincs nyomkövetés és nincsenek felesleges engedélyek: csak egy gyors, rendezett élmény, rád szabva.

Megtekintheted, rendszerezheted és szerkesztheted a fotóidat és videóidat, elrejtheted a legérzékenyebb tartalmaidat, és másodpercek alatt helyreállíthatsz törölt elemeket a beépített lomtárnak köszönhetően. Minden **közvetlenül az eszközödön** fut, teljes magánéletben.

---

## ✨ **Funkciók**

* 🖼️ **Beépített fotószerkesztő:** vágás, átméretezés, forgatás, tükrözés, rajzolás és szűrők alkalmazása közvetlenül az alkalmazásban.
* 🔐 **Első helyen a magánélet:** távolítsd el az EXIF metaadatokat, például a GPS-koordinátákat és a fényképezőgép adatait.
* 🔒 **Fejlett biztonság:** zárd le a fotókat, videókat vagy az egész alkalmazást PIN-kóddal, mintázattal vagy ujjlenyomattal.
* ♻️ **Beépített lomtár:** állítsd helyre a véletlenül törölt fotókat és videókat másodpercek alatt.
* 🎨 **Dinamikus témák:** Material Design a rendszert követő világos/sötét témákkal, valamint egyéni témákkal.
* 📷 **Számos támogatott formátum:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF és még sok más.
* 🔍 **Keresés és mappák:** gyors médiakeresés és a bevont, kizárt és rejtett mappák kezelése.
* 🖥️ **Háttérkép és widget:** állíts be egy fotót háttérképként, és add hozzá a mappawidgetet a kezdőképernyődhöz.
* 📴 **Nincs szükség kapcsolatra:** az alkalmazás teljesen **offline** működik.

---

## 📲 **Kompatibilitás**

| | |
|---|---|
| **Android** | 8.0 (Oreo) és újabb |
| **Minimális verzió** | API 26 |
| **Cél SDK** | API 36 |
| **Fordító SDK** | API 36 |
| **Csomag** | `com.simonecompany.simongalleria` |
| **Verzió** | `1.0.0` (build 28) |

---

## 🔐 **Adatvédelem és biztonság**

A magánélet az alkalmazás szíve: nincs fiók, nincs adatgyűjtés és nincs kapcsolat a külvilággal. A zárolási funkciók az egész alkalmazást vagy csak az általad választott tartalmat védik, míg az EXIF metaadatok eltávolítása megakadályozza a helyzeted vagy a felvétel részleteinek véletlen megosztását.

| Engedély | Mikor | Mire szolgál |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Fotók és videók olvasása az eszközön |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Szelektív hozzáférés a kiválasztott fájlokhoz |
| `ACCESS_MEDIA_LOCATION` | mindig | Helyszín olvasása az EXIF metaadatokból |
| `SET_WALLPAPER` | kérésre | Fotó beállítása háttérképként |
| `POST_NOTIFICATIONS` | Android 13+ | Alkalmazásértesítések |
| `WRITE_EXTERNAL_STORAGE` | Android 10-ig | Média mentése és szerkesztése |
| `MANAGE_EXTERNAL_STORAGE` | opcionális | Teljes fájlkezelés |
| `RECEIVE_BOOT_COMPLETED` | mindig | A médialista frissítése újraindítás után |

Az alkalmazás **nem** igényel hálózati engedélyt vagy kamerahozzáférést.

---

## 🧑‍💻 **Fejlesztés**

A projekt **Gradle** és **Kotlin** segítségével készül:

```bash
./gradlew assembleFossDebug     # hibakeresési APK
./gradlew assembleFossRelease   # kiadási APK
```

---

## 🐛 **Ismert problémák**

* A kiadás idején egy sem érkezett bejelentés.

---

<div align="center">

### ⭐ Ha hasznosnak találod az alkalmazást, hagyj egy csillagot ⭐

</div>
