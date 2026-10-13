<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *Aplicació Android per gestionar les teves fotos i vídeos: potent, privada i sense anuncis*

---

</div>

## 📌 **Visió general**

**Simon-Galleria** és una galeria de fotos i vídeos **Android** nativa creada per a persones que volen tenir control total sobre els seus records sense renunciar a la comoditat. Sense anuncis, sense seguiment i sense permisos innecessaris: només una experiència ràpida i ordenada feta per a tu.

Pots veure, organitzar i editar les teves fotos i vídeos, amagar el contingut més sensible i recuperar els elements esborrats en segons gràcies a la paperera integrada. Tot funciona **directament al teu dispositiu**, amb total privacitat.

---

## ✨ **Funcions**

* 🖼️ **Editor de fotos integrat:** retalla, redimensiona, gira, volteja, dibuixa i aplica filtres dins de l'aplicació.
* 🔐 **Privacitat primer:** elimina les metadades EXIF com les coordenades GPS i els detalls de la càmera.
* 🔒 **Seguretat avançada:** bloqueja fotos, vídeos o tota l'aplicació amb un PIN, un patró o una empremta digital.
* ♻️ **Paperera integrada:** recupera fotos i vídeos esborrats accidentalment en segons.
* 🎨 **Temes dinàmics:** Material Design amb temes clars/foscs que segueixen el sistema, a més de temes personalitzats.
* 📷 **Molts formats admesos:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF i molts més.
* 🔍 **Cerca i carpetes:** cerca ràpida de mitjans i gestió de carpetes incloses, excloses i ocultes.
* 🖥️ **Fons de pantalla i giny:** estableix una foto com a fons de pantalla i afegeix el giny de carpeta a la pantalla d'inici.
* 📴 **No cal connexió:** l'aplicació funciona completament **sense connexió**.

---

## 📲 **Compatibilitat**

| | |
|---|---|
| **Android** | 8.0 (Oreo) i posteriors |
| **Versió mínima** | API 26 |
| **Target SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Paquet** | `com.simonecompany.simongalleria` |
| **Versió** | `1.0.0` (build 28) |

---

## 🔐 **Privacitat i seguretat**

La privacitat és el cor de l'aplicació: sense compte, sense dades recollides i sense connexió amb el món exterior. Les funcions de bloqueig protegeixen tota l'aplicació o només el contingut que triïs, mentre que eliminar les metadades EXIF evita compartir accidentalment la teva ubicació o els detalls de la captura.

| Permís | Quan | Per a què serveix |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Llegir fotos i vídeos del dispositiu |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Accés selectiu als fitxers triats |
| `ACCESS_MEDIA_LOCATION` | sempre | Llegir la ubicació de les metadades EXIF |
| `SET_WALLPAPER` | quan es demana | Establir una foto com a fons de pantalla |
| `POST_NOTIFICATIONS` | Android 13+ | Notificacions de l'aplicació |
| `WRITE_EXTERNAL_STORAGE` | fins a Android 10 | Desar i editar mitjans |
| `MANAGE_EXTERNAL_STORAGE` | opcional | Gestió completa de fitxers |
| `RECEIVE_BOOT_COMPLETED` | sempre | Actualitzar la llista de mitjans després d'un reinici |

L'aplicació **no** requereix permís de xarxa ni accés a la càmera.

---

## 🧑‍💻 **Desenvolupament**

El projecte es construeix amb **Gradle** i **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug APK
./gradlew assembleFossRelease   # release APK
```

---

## 🐛 **Problemes coneguts**

* Cap reportat en el moment del llançament.

---

<div align="center">

### ⭐ Si trobes l'aplicació útil, deixa una estrella ⭐

</div>
