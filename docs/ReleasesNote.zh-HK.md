<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *用嚟管理你嘅相片同影片嘅 Android 應用程式：強大、私密又冇廣告*

---

</div>

## 📌 **概覽**

**Simon-Galleria** 係一款原生 **Android** 相片同影片相簿，專為想喺唔犧牲方便嘅情況下完全掌控自己回憶嘅人而設。冇廣告、冇追蹤，亦冇不必要嘅權限：只有為你度身訂造嘅快速、整潔體驗。

你可以睇、整理同編輯你嘅相片同影片、隱藏最敏感嘅內容，並透過內置回收站喺幾秒內復原已刪除嘅項目。一切都**直接喺你嘅裝置上**運行，完全私密。

---

## ✨ **功能**

* 🖼️ **內置相片編輯器：** 直接喺應用程式內裁剪、調整大小、旋轉、翻轉、繪畫並套用濾鏡。
* 🔐 **私隱至上：** 清除 GPS 座標同相機詳情等 EXIF 中繼資料。
* 🔒 **高階安全：** 用 PIN、圖案或指紋鎖定相片、影片或整個應用程式。
* ♻️ **內置回收站：** 喺幾秒內復原意外刪除嘅相片同影片。
* 🎨 **動態主題：** 支援跟隨系統嘅淺色/深色主題嘅 Material Design，以及自訂主題。
* 📷 **支援多種格式：** JPEG、JPEG XL、PNG、MP4、MKV、RAW、SVG、GIF、AVIF 等等。
* 🔍 **搜尋同資料夾：** 快速搜尋媒體，並管理已包含、已排除同隱藏嘅資料夾。
* 🖥️ **桌布同小工具：** 將相片設為桌布，並將資料夾小工具加到主畫面。
* 📴 **毋須連線：** 應用程式完全**離線**運作。

---

## 📲 **相容性**

| | |
|---|---|
| **Android** | 8.0 (Oreo) 及更新版本 |
| **最低版本** | API 26 |
| **目標 SDK** | API 36 |
| **編譯 SDK** | API 36 |
| **套件** | `com.simonecompany.simongalleria` |
| **版本** | `1.0.0` (build 28) |

---

## 🔐 **私隱同安全**

私隱係應用程式嘅核心：冇帳戶、唔會收集資料，亦唔會同外界連線。鎖定功能可保護整個應用程式或你選擇嘅內容，而移除 EXIF 中繼資料則可防止意外洩露你嘅位置或拍攝詳情。

| 權限 | 幾時 | 用途 |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | 讀取裝置上嘅相片同影片 |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | 對所選檔案嘅選擇性存取 |
| `ACCESS_MEDIA_LOCATION` | 永遠 | 從 EXIF 中繼資料讀取位置 |
| `SET_WALLPAPER` | 按要求 | 將相片設為桌布 |
| `POST_NOTIFICATIONS` | Android 13+ | 應用程式通知 |
| `WRITE_EXTERNAL_STORAGE` | 最高至 Android 10 | 儲存同編輯媒體 |
| `MANAGE_EXTERNAL_STORAGE` | 可選 | 完整嘅檔案管理 |
| `RECEIVE_BOOT_COMPLETED` | 永遠 | 重新啟動後重新整理媒體清單 |

呢個應用程式**唔**需要網絡權限或相機存取權。

---

## 🧑‍💻 **開發**

呢個專案係用 **Gradle** 同 **Kotlin** 建立嘅：

```bash
./gradlew assembleFossDebug     # 除錯版 APK
./gradlew assembleFossRelease   # 發行版 APK
```

---

## 🐛 **已知問題**

* 發行時未有報告任何問題。

---

<div align="center">

### ⭐ 如果你覺得呢個應用程式有用，請俾個星 ⭐

</div>
