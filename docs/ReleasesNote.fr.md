<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Icône Simon-Galleria" width="120" height="120" />

### *Application Android pour gérer vos photos et vidéos : puissante, privée et sans publicité*

---

</div>

## 📌 **Aperçu**

**Simon-Galleria** est une galerie photo et vidéo native pour **Android**, conçue pour les personnes qui veulent garder un contrôle total sur leurs souvenirs sans renoncer au confort. Pas de publicités, pas de suivi et pas de permissions inutiles : juste une expérience rapide et ordonnée, conçue pour vous.

Vous pouvez consulter, organiser et modifier vos photos et vidéos, masquer votre contenu le plus sensible et récupérer les éléments supprimés en quelques secondes grâce à la corbeille intégrée. Tout fonctionne **directement sur votre appareil**, en toute confidentialité.

---

## ✨ **Fonctionnalités**

* 🖼️ **Éditeur photo intégré :** recadrez, redimensionnez, faites pivoter, retournez, dessinez et appliquez des filtres directement dans l'application.
* 🔐 **La confidentialité d'abord :** supprimez les métadonnées EXIF telles que les coordonnées GPS et les détails de l'appareil photo.
* 🔒 **Sécurité avancée :** verrouillez des photos, des vidéos ou toute l'application avec un PIN, un schéma ou une empreinte digitale.
* ♻️ **Corbeille intégrée :** récupérez en quelques secondes les photos et vidéos supprimées accidentellement.
* 🎨 **Thèmes dynamiques :** Material Design avec des thèmes clairs/sombres qui suivent le système, ainsi que des thèmes personnalisés.
* 📷 **De nombreux formats pris en charge :** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF et bien d'autres.
* 🔍 **Recherche et dossiers :** recherche rapide de médias et gestion des dossiers inclus, exclus et masqués.
* 🖥️ **Fond d'écran et widget :** définissez une photo comme fond d'écran et ajoutez le widget de dossier à votre écran d'accueil.
* 📴 **Aucune connexion requise :** l'application fonctionne entièrement **hors ligne**.

---

## 📲 **Compatibilité**

| | |
|---|---|
| **Android** | 8.0 (Oreo) et versions ultérieures |
| **Version minimale** | API 26 |
| **SDK cible** | API 36 |
| **SDK de compilation** | API 36 |
| **Package** | `com.simonecompany.simongalleria` |
| **Version** | `1.0.0` (build 28) |

---

## 🔐 **Confidentialité et sécurité**

La confidentialité est au cœur de l'application : pas de compte, aucune donnée collectée et aucune connexion avec le monde extérieur. Les fonctions de verrouillage protègent toute l'application ou uniquement le contenu que vous choisissez, tandis que la suppression des métadonnées EXIF évite de partager accidentellement votre position ou les détails de la prise de vue.

| Permission | Quand | À quoi elle sert |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Lire les photos et vidéos de l'appareil |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Accès sélectif aux fichiers choisis |
| `ACCESS_MEDIA_LOCATION` | toujours | Lire la position depuis les métadonnées EXIF |
| `SET_WALLPAPER` | sur demande | Définir une photo comme fond d'écran |
| `POST_NOTIFICATIONS` | Android 13+ | Notifications de l'application |
| `WRITE_EXTERNAL_STORAGE` | jusqu'à Android 10 | Enregistrer et modifier les médias |
| `MANAGE_EXTERNAL_STORAGE` | en option | Gestion complète des fichiers |
| `RECEIVE_BOOT_COMPLETED` | toujours | Actualiser la liste des médias après un redémarrage |

L'application **ne** nécessite **pas** de permission réseau ni d'accès à l'appareil photo.

---

## 🧑‍💻 **Développement**

Le projet est construit avec **Gradle** et **Kotlin** :

```bash
./gradlew assembleFossDebug     # APK de débogage
./gradlew assembleFossRelease   # APK de publication
```

---

## 🐛 **Problèmes connus**

* Aucun signalé au moment de la publication.

---

<div align="center">

### ⭐ Si vous trouvez l'application utile, laissez une étoile ⭐

</div>
