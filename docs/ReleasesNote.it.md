<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Icona Simon-Galleria" width="120" height="120" />

### *App Android per gestire foto e video: potente, privata e senza pubblicità*

---

</div>

## 📌 **Panoramica**

**Simon-Galleria** è una galleria foto e video nativa per **Android**, pensata per chi vuole il massimo controllo sui propri ricordi senza rinunciare alla comodità. Niente pubblicità, niente tracciamento e nessun permesso inutile: solo un'esperienza veloce, ordinata e su misura per te.

Puoi visualizzare, organizzare e modificare le tue foto e i tuoi video, nascondere i contenuti più riservati e recuperare in un attimo gli elementi eliminati grazie al cestino integrato. Tutto funziona **direttamente sul dispositivo**, in totale privacy.

---

## ✨ **Caratteristiche**

* 🖼️ **Editor foto integrato:** ritaglia, ridimensiona, ruota, capovolgi, disegna e applica filtri direttamente dall'app.
* 🔐 **Privacy prima di tutto:** rimuovi i metadati EXIF come coordinate GPS e dettagli della fotocamera.
* 🔒 **Sicurezza avanzata:** blocca foto, video o l'intera app con PIN, sequenza o impronta digitale.
* ♻️ **Cestino integrato:** recupera in pochi secondi foto e video eliminati per errore.
* 🎨 **Temi dinamici:** Material Design con temi chiari/scuri che seguono il sistema, più temi personalizzati.
* 📷 **Tanti formati supportati:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF e molti altri.
* 🔍 **Ricerca e cartelle:** ricerca rapida dei media e gestione di cartelle incluse, escluse e nascoste.
* 🖥️ **Sfondo e widget:** imposta una foto come sfondo e aggiungi il widget cartella alla home.
* 📴 **Nessuna connessione richiesta:** l'app funziona completamente **offline**.

---

## 📲 **Compatibilità**

| | |
|---|---|
| **Android** | 8.0 (Oreo) e successivi |
| **Versione minima** | API 26 |
| **Target SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Package** | `com.simonecompany.simongalleria` |
| **Versione** | `1.0.0` (build 28) |

---

## 🔐 **Privacy e sicurezza**

La privacy è il cuore dell'app: nessun account, nessun dato raccolto e nessuna connessione verso l'esterno. Le funzioni di blocco proteggono l'intera app o solo i contenuti scelti, mentre la rimozione dei metadati EXIF evita di condividere per sbaglio la posizione o i dettagli dello scatto.

| Permesso | Quando | A cosa serve |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Leggere foto e video del dispositivo |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Accesso selettivo ai file scelti |
| `ACCESS_MEDIA_LOCATION` | sempre | Leggere la posizione nei metadati EXIF |
| `SET_WALLPAPER` | su richiesta | Impostare una foto come sfondo |
| `POST_NOTIFICATIONS` | Android 13+ | Notifiche dell'app |
| `WRITE_EXTERNAL_STORAGE` | fino ad Android 10 | Salvare e modificare i media |
| `MANAGE_EXTERNAL_STORAGE` | opzionale | Gestione completa dei file |
| `RECEIVE_BOOT_COMPLETED` | sempre | Aggiornare l'elenco media dopo il riavvio |

L'app **non** richiede il permesso di rete né l'accesso alla fotocamera.

---

## 🧑‍💻 **Sviluppo**

Il progetto si compila con **Gradle** e **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK di debug
./gradlew assembleFossRelease   # APK di release
```

---

## 🐛 **Bug noti**

* Nessuno segnalato al momento della pubblicazione.

---

<div align="center">

### ⭐ Se l'app ti è utile, lascia una stella ⭐

</div>
