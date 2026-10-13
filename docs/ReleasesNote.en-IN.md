<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *Android app to manage your photos and videos: powerful, private and ad-free*

---

</div>

## 📌 **Overview**

**Simon-Galleria** is a native **Android** photo and video gallery built for people who want full control over their memories without giving up convenience. No ads, no tracking and no unnecessary permissions: just a fast, tidy experience tailored to you.

You can view, organize and edit your photos and videos, hide your most sensitive content and recover deleted items in seconds thanks to the built-in recycle bin. Everything runs **directly on your device**, in complete privacy.

---

## ✨ **Features**

* 🖼️ **Built-in photo editor:** crop, resize, rotate, flip, draw and apply filters right inside the app.
* 🔐 **Privacy first:** strip EXIF metadata such as GPS coordinates and camera details.
* 🔒 **Advanced security:** lock photos, videos or the whole app with a pin, pattern or fingerprint.
* ♻️ **Built-in recycle bin:** recover accidentally deleted photos and videos in seconds.
* 🎨 **Dynamic themes:** Material Design with light/dark themes that follow the system, plus custom themes.
* 📷 **Many supported formats:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF and many more.
* 🔍 **Search and folders:** quick media search and management of included, excluded and hidden folders.
* 🖥️ **Wallpaper and widget:** set a photo as your wallpaper and add the folder widget to your home screen.
* 📴 **No connection required:** the app works completely **offline**.

---

## 📲 **Compatibility**

| | |
|---|---|
| **Android** | 8.0 (Oreo) and later |
| **Minimum version** | API 26 |
| **Target SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Package** | `com.simonecompany.simongalleria` |
| **Version** | `1.0.0` (build 28) |

---

## 🔐 **Privacy and security**

Privacy is the heart of the app: no account, no data collected and no connection to the outside world. The lock features protect the whole app or only the content you choose, while removing EXIF metadata prevents accidentally sharing your location or shooting details.

| Permission | When | What it is for |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Read photos and videos on the device |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Selective access to chosen files |
| `ACCESS_MEDIA_LOCATION` | always | Read location from EXIF metadata |
| `SET_WALLPAPER` | on request | Set a photo as wallpaper |
| `POST_NOTIFICATIONS` | Android 13+ | App notifications |
| `WRITE_EXTERNAL_STORAGE` | up to Android 10 | Save and edit media |
| `MANAGE_EXTERNAL_STORAGE` | optional | Full file management |
| `RECEIVE_BOOT_COMPLETED` | always | Refresh the media list after a reboot |

The app **does not** require network permission or camera access.

---

## 🧑‍💻 **Development**

The project is built with **Gradle** and **Kotlin**:

```bash
./gradlew assembleFossDebug     # debug APK
./gradlew assembleFossRelease   # release APK
```

---

## 🐛 **Known issues**

* None reported at the time of release.

---

<div align="center">

### ⭐ If you find the app useful, leave a star ⭐

</div>
