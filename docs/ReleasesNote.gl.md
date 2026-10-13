<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Icona de Simon-Galleria" width="120" height="120" />

### *Aplicación Android para xestionar as túas fotos e vídeos: potente, privada e sen anuncios*

---

</div>

## 📌 **Visión xeral**

**Simon-Galleria** é unha galería de fotos e vídeos **Android** nativa creada para persoas que queren un control total sobre os seus recordos sen renunciar á comodidade. Sen anuncios, sen rastrexo e sen permisos innecesarios: só unha experiencia rápida e ordenada adaptada a ti.

Podes ver, organizar e editar as túas fotos e vídeos, ocultar o teu contido máis sensible e recuperar elementos eliminados en segundos grazas á papeleira integrada. Todo se executa **directamente no teu dispositivo**, con total privacidade.

---

## ✨ **Características**

* 🖼️ **Editor de fotos integrado:** recorta, redimensiona, xira, voltea, debuxa e aplica filtros dentro da propia aplicación.
* 🔐 **A privacidade primeiro:** elimina os metadatos EXIF como as coordenadas GPS e os detalles da cámara.
* 🔒 **Seguridade avanzada:** bloquea fotos, vídeos ou toda a aplicación cun PIN, patrón ou pegada dixital.
* ♻️ **Papeleira integrada:** recupera fotos e vídeos eliminados por accidente en segundos.
* 🎨 **Temas dinámicos:** Material Design con temas claro/escuro que seguen o sistema, ademais de temas personalizados.
* 📷 **Moitos formatos compatibles:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF e moitos máis.
* 🔍 **Busca e cartafoles:** busca rápida de contido e xestión de cartafoles incluídos, excluídos e ocultos.
* 🖥️ **Fondo de pantalla e widget:** define unha foto como fondo de pantalla e engade o widget de cartafol á túa pantalla de inicio.
* 📴 **Sen conexión necesaria:** a aplicación funciona completamente **sen conexión**.

---

## 📲 **Compatibilidade**

| | |
|---|---|
| **Android** | 8.0 (Oreo) e posteriores |
| **Versión mínima** | API 26 |
| **SDK de destino** | API 36 |
| **SDK de compilación** | API 36 |
| **Paquete** | `com.simonecompany.simongalleria` |
| **Versión** | `1.0.0` (build 28) |

---

## 🔐 **Privacidade e seguridade**

A privacidade é o corazón da aplicación: sen conta, sen datos recollidos e sen conexión co mundo exterior. As funcións de bloqueo protexen toda a aplicación ou só o contido que elixas, mentres que eliminar os metadatos EXIF evita compartir accidentalmente a túa localización ou os detalles da captura.

| Permiso | Cando | Para que serve |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Ler fotos e vídeos do dispositivo |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Acceso selectivo aos ficheiros escollidos |
| `ACCESS_MEDIA_LOCATION` | sempre | Ler a localización dos metadatos EXIF |
| `SET_WALLPAPER` | a petición | Definir unha foto como fondo de pantalla |
| `POST_NOTIFICATIONS` | Android 13+ | Notificacións da aplicación |
| `WRITE_EXTERNAL_STORAGE` | ata Android 10 | Gardar e editar contido multimedia |
| `MANAGE_EXTERNAL_STORAGE` | opcional | Xestión completa de ficheiros |
| `RECEIVE_BOOT_COMPLETED` | sempre | Actualizar a lista de contido despois dun reinicio |

A aplicación **non** require permiso de rede nin acceso á cámara.

---

## 🧑‍💻 **Desenvolvemento**

O proxecto constrúese con **Gradle** e **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK de depuración
./gradlew assembleFossRelease   # APK de publicación
```

---

## 🐛 **Problemas coñecidos**

* Ningún notificado no momento da publicación.

---

<div align="center">

### ⭐ Se che resulta útil a aplicación, deixa unha estrela ⭐

</div>
