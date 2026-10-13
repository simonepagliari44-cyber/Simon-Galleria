<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Icono de Simon-Galleria" width="120" height="120" />

### *Aplicación Android para gestionar tus fotos y vídeos: potente, privada y sin anuncios*

---

</div>

## 📌 **Descripción general**

**Simon-Galleria** es una galería nativa de fotos y vídeos para **Android** creada para quienes quieren tener un control total sobre sus recuerdos sin renunciar a la comodidad. Sin anuncios, sin rastreo y sin permisos innecesarios: solo una experiencia rápida y ordenada hecha a tu medida.

Puedes ver, organizar y editar tus fotos y vídeos, ocultar tu contenido más sensible y recuperar los elementos eliminados en segundos gracias a la papelera de reciclaje integrada. Todo se ejecuta **directamente en tu dispositivo**, con total privacidad.

---

## ✨ **Funciones**

* 🖼️ **Editor de fotos integrado:** recorta, cambia el tamaño, gira, voltea, dibuja y aplica filtros directamente en la aplicación.
* 🔐 **Privacidad primero:** elimina los metadatos EXIF como las coordenadas GPS y los detalles de la cámara.
* 🔒 **Seguridad avanzada:** bloquea fotos, vídeos o toda la aplicación con un PIN, un patrón o una huella dactilar.
* ♻️ **Papelera de reciclaje integrada:** recupera en segundos las fotos y vídeos eliminados por accidente.
* 🎨 **Temas dinámicos:** Material Design con temas claros/oscuros que siguen el sistema, además de temas personalizados.
* 📷 **Muchos formatos compatibles:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF y muchos más.
* 🔍 **Búsqueda y carpetas:** búsqueda rápida de contenido y gestión de carpetas incluidas, excluidas y ocultas.
* 🖥️ **Fondo de pantalla y widget:** establece una foto como fondo de pantalla y añade el widget de carpetas a tu pantalla de inicio.
* 📴 **Sin conexión necesaria:** la aplicación funciona completamente **sin conexión**.

---

## 📲 **Compatibilidad**

| | |
|---|---|
| **Android** | 8.0 (Oreo) y posteriores |
| **Versión mínima** | API 26 |
| **SDK de destino** | API 36 |
| **SDK de compilación** | API 36 |
| **Paquete** | `com.simonecompany.simongalleria` |
| **Versión** | `1.0.0` (build 28) |

---

## 🔐 **Privacidad y seguridad**

La privacidad es el corazón de la aplicación: sin cuenta, sin datos recopilados y sin conexión con el mundo exterior. Las funciones de bloqueo protegen toda la aplicación o solo el contenido que elijas, mientras que la eliminación de los metadatos EXIF evita compartir sin querer tu ubicación o los detalles de la captura.

| Permiso | Cuándo | Para qué sirve |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Leer fotos y vídeos del dispositivo |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Acceso selectivo a los archivos elegidos |
| `ACCESS_MEDIA_LOCATION` | siempre | Leer la ubicación de los metadatos EXIF |
| `SET_WALLPAPER` | cuando se solicita | Establecer una foto como fondo de pantalla |
| `POST_NOTIFICATIONS` | Android 13+ | Notificaciones de la aplicación |
| `WRITE_EXTERNAL_STORAGE` | hasta Android 10 | Guardar y editar contenido multimedia |
| `MANAGE_EXTERNAL_STORAGE` | opcional | Gestión completa de archivos |
| `RECEIVE_BOOT_COMPLETED` | siempre | Actualizar la lista de contenido multimedia tras un reinicio |

La aplicación **no** requiere permiso de red ni acceso a la cámara.

---

## 🧑‍💻 **Desarrollo**

El proyecto se compila con **Gradle** y **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK de depuración
./gradlew assembleFossRelease   # APK de publicación
```

---

## 🐛 **Problemas conocidos**

* Ninguno notificado en el momento de la publicación.

---

<div align="center">

### ⭐ Si la aplicación te resulta útil, deja una estrella ⭐

</div>
