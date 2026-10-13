<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *用于管理您的照片和视频的 Android 应用：强大、私密且无广告*

---

</div>

## 📌 **概述**

**Simon-Galleria** 是一款原生 **Android** 照片和视频相册，专为想要在不牺牲便利性的前提下完全掌控自己回忆的人而打造。没有广告，没有跟踪，也没有不必要的权限：只有为您量身打造的快速、整洁的体验。

您可以查看、整理和编辑照片与视频，隐藏最敏感的内容，并借助内置回收站在几秒内恢复已删除的项目。一切都**直接在您的设备上**运行，完全私密。

---

## ✨ **功能**

* 🖼️ **内置照片编辑器：** 直接在应用内裁剪、调整大小、旋转、翻转、绘制并应用滤镜。
* 🔐 **隐私至上：** 清除 GPS 坐标和相机详情等 EXIF 元数据。
* 🔒 **高级安全：** 使用 PIN、图案或指纹锁定照片、视频或整个应用。
* ♻️ **内置回收站：** 在几秒内恢复意外删除的照片和视频。
* 🎨 **动态主题：** 支持跟随系统的浅色/深色主题的 Material Design，以及自定义主题。
* 📷 **支持多种格式：** JPEG、JPEG XL、PNG、MP4、MKV、RAW、SVG、GIF、AVIF 等等。
* 🔍 **搜索和文件夹：** 快速搜索媒体，并管理已包含、已排除和隐藏的文件夹。
* 🖥️ **壁纸和小组件：** 将照片设为壁纸，并将文件夹小组件添加到主屏幕。
* 📴 **无需连接：** 应用完全**离线**运行。

---

## 📲 **兼容性**

| | |
|---|---|
| **Android** | 8.0 (Oreo) 及更高版本 |
| **最低版本** | API 26 |
| **目标 SDK** | API 36 |
| **编译 SDK** | API 36 |
| **软件包** | `com.simonecompany.simongalleria` |
| **版本** | `1.0.0` (build 28) |

---

## 🔐 **隐私与安全**

隐私是应用的核心：没有账户，不收集数据，也不与外界连接。锁定功能可保护整个应用或您选择的内容，而移除 EXIF 元数据则可防止意外泄露您的位置或拍摄详情。

| 权限 | 时间 | 用途 |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | 读取设备上的照片和视频 |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | 对所选文件的选择性访问 |
| `ACCESS_MEDIA_LOCATION` | 始终 | 从 EXIF 元数据读取位置 |
| `SET_WALLPAPER` | 按需 | 将照片设为壁纸 |
| `POST_NOTIFICATIONS` | Android 13+ | 应用通知 |
| `WRITE_EXTERNAL_STORAGE` | 最高至 Android 10 | 保存和编辑媒体 |
| `MANAGE_EXTERNAL_STORAGE` | 可选 | 完整的文件管理 |
| `RECEIVE_BOOT_COMPLETED` | 始终 | 重启后刷新媒体列表 |

该应用**不**需要网络权限或相机访问权限。

---

## 🧑‍💻 **开发**

该项目使用 **Gradle** 和 **Kotlin** 构建：

```bash
./gradlew assembleFossDebug     # 调试版 APK
./gradlew assembleFossRelease   # 发布版 APK
```

---

## 🐛 **已知问题**

* 发布时未报告任何问题。

---

<div align="center">

### ⭐ 如果您觉得这个应用有用，请点个星 ⭐

</div>
