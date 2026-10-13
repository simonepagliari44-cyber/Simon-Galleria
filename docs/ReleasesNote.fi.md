<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria-kuvake" width="120" height="120" />

### *Android-sovellus kuviesi ja videoidesi hallintaan: tehokas, yksityinen ja mainokseton*

---

</div>

## 📌 **Yleiskatsaus**

**Simon-Galleria** on natiivi **Android**-kuva- ja videogalleria, joka on tehty ihmisille, jotka haluavat täyden hallinnan muistoihinsa luopumatta mukavuudesta. Ei mainoksia, ei seurantaa eikä tarpeettomia käyttöoikeuksia: vain nopea ja siisti, sinulle räätälöity kokemus.

Voit katsella, järjestellä ja muokata kuviasi ja videoitasi, piilottaa arkaluontoisimman sisältösi ja palauttaa poistetut kohteet sekunneissa sisäänrakennetun roskakorin ansiosta. Kaikki toimii **suoraan laitteellasi**, täysin yksityisesti.

---

## ✨ **Ominaisuudet**

* 🖼️ **Sisäänrakennettu kuvankäsittely:** rajaa, muuta kokoa, kierrä, käännä, piirrä ja lisää suodattimia suoraan sovelluksessa.
* 🔐 **Yksityisyys ensin:** poista EXIF-metatiedot, kuten GPS-koordinaatit ja kameran tiedot.
* 🔒 **Edistynyt turvallisuus:** lukitse kuvat, videot tai koko sovellus PIN-koodilla, kuviolla tai sormenjäljellä.
* ♻️ **Sisäänrakennettu roskakori:** palauta vahingossa poistetut kuvat ja videot sekunneissa.
* 🎨 **Dynaamiset teemat:** Material Design vaaleilla/tummillä teemoilla, jotka noudattavat järjestelmää, sekä mukautetut teemat.
* 📷 **Monta tuettua muotoa:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF ja paljon muuta.
* 🔍 **Haku ja kansiot:** nopea mediahaku sekä sisällytettyjen, poissuljettujen ja piilotettujen kansioiden hallinta.
* 🖥️ **Taustakuva ja widget:** aseta kuva taustakuvaksi ja lisää kansiowidget aloitusnäyttöösi.
* 📴 **Ei verkkoyhteyttä tarvita:** sovellus toimii täysin **offline-tilassa**.

---

## 📲 **Yhteensopivuus**

| | |
|---|---|
| **Android** | 8.0 (Oreo) ja uudemmat |
| **Vähimmäisversio** | API 26 |
| **Kohde-SDK** | API 36 |
| **Käännös-SDK** | API 36 |
| **Paketti** | `com.simonecompany.simongalleria` |
| **Versio** | `1.0.0` (build 28) |

---

## 🔐 **Yksityisyys ja turvallisuus**

Yksityisyys on sovelluksen sydän: ei tiliä, ei kerättyä dataa eikä yhteyttä ulkomaailmaan. Lukitustoiminnot suojaavat koko sovellusta tai vain valitsemaasi sisältöä, kun taas EXIF-metatietojen poistaminen estää sijaintisi tai kuvausyksityiskohtiesi vahingossa tapahtuvan jakamisen.

| Käyttöoikeus | Milloin | Mihin se on tarkoitettu |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Lue laitteen kuvat ja videot |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Valikoiva pääsy valittuihin tiedostoihin |
| `ACCESS_MEDIA_LOCATION` | aina | Lue sijainti EXIF-metatiedoista |
| `SET_WALLPAPER` | pyydettäessä | Aseta kuva taustakuvaksi |
| `POST_NOTIFICATIONS` | Android 13+ | Sovelluksen ilmoitukset |
| `WRITE_EXTERNAL_STORAGE` | Android 10 asti | Tallenna ja muokkaa mediaa |
| `MANAGE_EXTERNAL_STORAGE` | valinnainen | Täysi tiedostojen hallinta |
| `RECEIVE_BOOT_COMPLETED` | aina | Päivitä mediasisältöluettelo uudelleenkäynnistyksen jälkeen |

Sovellus **ei** vaadi verkkoyhteyden käyttöoikeutta tai kameran käyttöä.

---

## 🧑‍💻 **Kehitys**

Projekti on rakennettu **Gradle**-työkalulla ja **Kotlin**-kielellä:

```bash
./gradlew assembleFossDebug     # debug-APK
./gradlew assembleFossRelease   # release-APK
```

---

## 🐛 **Tunnetut ongelmat**

* Ei raportoituja julkaisuhetkellä.

---

<div align="center">

### ⭐ Jos pidät sovellusta hyödyllisenä, jätä tähti ⭐

</div>
