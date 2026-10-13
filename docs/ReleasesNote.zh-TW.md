<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *用於管理您的相片和影片的 Android 應用程式：強大、私密且無廣告*

---

</div>

## 📌 **概覽**

**Simon-Galleria** 是一款原生 **Android** 相片和影片相簿，專為想在不犧牲便利性的前提下完全掌控自己回憶的人而打造。沒有廣告，沒有追蹤，也沒有不必要的權限：只有為您量身打造的快速、整潔體驗。

您可以檢視、整理和編輯相片與影片，隱藏最敏感的內容，並藉由內建回收筒在幾秒內復原已刪除的項目。一切都**直接在您的裝置上**執行，完全私密。

---

## ✨ **功能**

* 🖼️ **內建相片編輯器：** 直接在應用程式內裁剪、調整大小、旋轉、翻轉、繪製並套用濾鏡。
* 🔐 **隱私至上：** 清除 GPS 座標與相機詳情等 EXIF 中繼資料。
* 🔒 **進階安全：** 使用 PIN、圖形鎖或指紋鎖定相片、影片或整個應用程式。
* ♻️ **內建回收筒：** 在幾秒內復原意外刪除的相片和影片。
* 🎨 **動態主題：** 支援跟隨系統的淺色/深色主題的 Material Design，以及自訂主題。
* 📷 **支援多種格式：** JPEG、JPEG XL、PNG、MP4、MKV、RAW、SVG、GIF、AVIF 等等。
* 🔍 **搜尋與資料夾：** 快速搜尋媒體，並管理已包含、已排除與隱藏的資料夾。
* 🖥️ **桌布與小工具：** 將相片設為桌布，並將資料夾小工具加入主畫面。
* 📴 **無須連線：** 應用程式完全**離線**運作。

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

## 🔐 **隱私與安全**

隱私是應用程式的核心：沒有帳戶、不收集資料，也不與外界連線。鎖定功能可保護整個應用程式或您選擇的內容，而移除 EXIF 中繼資料則可防止意外洩露您的位置或拍攝詳情。

| 權限 | 時機 | 用途 |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | 讀取裝置上的相片和影片 |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | 對所選檔案選擇性存取 |
| `ACCESS_MEDIA_LOCATION` | 永遠 | 從 EXIF 中繼資料讀取位置 |
| `SET_WALLPAPER` | 依要求 | 將相片設為桌布 |
| `POST_NOTIFICATIONS` | Android 13+ | 應用程式通知 |
| `WRITE_EXTERNAL_STORAGE` | 最高至 Android 10 | 儲存與編輯媒體 |
| `MANAGE_EXTERNAL_STORAGE` | 選用 | 完整的檔案管理 |
| `RECEIVE_BOOT_COMPLETED` | 永遠 | 重新啟動後重新整理媒體清單 |

此應用程式**不**需要網路權限或相機存取權。

---

## 🧑‍💻 **開發**

本專案使用 **Gradle** 與 **Kotlin** 建置：

```bash
./gradlew assembleFossDebug     # 偵錯版 APK
./gradlew assembleFossRelease   # 發行版 APK
```

---

## 🐛 **已知問題**

* 發行時未回報任何問題。

---

<div align="center">

### ⭐ 如果您覺得這個應用程式實用，請給個星 ⭐

</div>
