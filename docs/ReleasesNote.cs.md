<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ikona Simon-Galleria" width="120" height="120" />

### *Android aplikace pro správu vašich fotek a videí: výkonná, soukromá a bez reklam*

---

</div>

## 📌 **Přehled**

**Simon-Galleria** je nativní galerie fotek a videí pro **Android** vytvořená pro lidi, kteří chtějí mít plnou kontrolu nad svými vzpomínkami, aniž by se vzdali pohodlí. Žádné reklamy, žádné sledování a žádná zbytečná oprávnění: jen rychlý a uspořádaný zážitek ušitý na míru vám.

Fotky a videa si můžete prohlížet, uspořádávat a upravovat, skrýt svůj nejcitlivější obsah a díky vestavěnému koši obnovit smazané položky během několika sekund. Vše běží **přímo na vašem zařízení**, v naprostém soukromí.

---

## ✨ **Funkce**

* 🖼️ **Vestavěný editor fotek:** ořezávání, změna velikosti, otáčení, převracení, kreslení a použití filtrů přímo v aplikaci.
* 🔐 **Soukromí na prvním místě:** odstraňte metadata EXIF, jako jsou souřadnice GPS a údaje o fotoaparátu.
* 🔒 **Pokročilé zabezpečení:** uzamkněte fotky, videa nebo celou aplikaci pomocí PINu, vzoru nebo otisku prstu.
* ♻️ **Vestavěný koš:** obnovte náhodně smazané fotky a videa během několika sekund.
* 🎨 **Dynamická témata:** Material Design se světlými/tmavými tématy, která sledují systém, plus vlastní témata.
* 📷 **Mnoho podporovaných formátů:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF a mnoho dalších.
* 🔍 **Vyhledávání a složky:** rychlé vyhledávání médií a správa zahrnutých, vyloučených a skrytých složek.
* 🖥️ **Tapeta a widget:** nastavte si fotku jako tapetu a přidejte widget složky na domovskou obrazovku.
* 📴 **Bez připojení:** aplikace funguje zcela **offline**.

---

## 📲 **Kompatibilita**

| | |
|---|---|
| **Android** | 8.0 (Oreo) a novější |
| **Minimální verze** | API 26 |
| **Cílové SDK** | API 36 |
| **Kompilační SDK** | API 36 |
| **Balíček** | `com.simonecompany.simongalleria` |
| **Verze** | `1.0.0` (build 28) |

---

## 🔐 **Soukromí a zabezpečení**

Soukromí je srdcem aplikace: žádný účet, žádná shromažďovaná data a žádné připojení k vnějšímu světu. Funkce zámku chrání celou aplikaci nebo jen obsah, který si zvolíte, zatímco odstranění metadat EXIF zabrání náhodnému sdílení vaší polohy nebo podrobností o snímku.

| Oprávnění | Kdy | K čemu slouží |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Čtení fotek a videí v zařízení |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selektivní přístup k vybraným souborům |
| `ACCESS_MEDIA_LOCATION` | vždy | Čtení polohy z metadat EXIF |
| `SET_WALLPAPER` | na vyžádání | Nastavení fotky jako tapety |
| `POST_NOTIFICATIONS` | Android 13+ | Oznámení aplikace |
| `WRITE_EXTERNAL_STORAGE` | do Androidu 10 | Ukládání a úprava médií |
| `MANAGE_EXTERNAL_STORAGE` | volitelné | Kompletní správa souborů |
| `RECEIVE_BOOT_COMPLETED` | vždy | Obnovení seznamu médií po restartu |

Aplikace **nevyžaduje** oprávnění k síti ani přístup ke kameře.

---

## 🧑‍💻 **Vývoj**

Projekt se sestavuje pomocí **Gradle** a **Kotlin**:

```bash
./gradlew assembleFossDebug     # ladicí APK
./gradlew assembleFossRelease   # vydávací APK
```

---

## 🐛 **Známé problémy**

* V době vydání nebyly hlášeny žádné.

---

<div align="center">

### ⭐ Pokud vám aplikace přijde užitečná, dejte jí hvězdičku ⭐

</div>
