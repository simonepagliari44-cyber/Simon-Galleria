<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria icon" width="120" height="120" />

### *Ứng dụng Android để quản lý ảnh và video của bạn: mạnh mẽ, riêng tư và không quảng cáo*

---

</div>

## 📌 **Tổng quan**

**Simon-Galleria** là thư viện ảnh và video **Android** gốc, được xây dựng cho những người muốn kiểm soát hoàn toàn ký ức của mình mà không từ bỏ sự tiện lợi. Không quảng cáo, không theo dõi và không quyền không cần thiết: chỉ là trải nghiệm nhanh chóng, gọn gàng dành riêng cho bạn.

Bạn có thể xem, sắp xếp và chỉnh sửa ảnh, video của mình, ẩn nội dung nhạy cảm nhất và khôi phục các mục đã xóa trong vài giây nhờ thùng rác tích hợp. Mọi thứ chạy **trực tiếp trên thiết bị của bạn**, hoàn toàn riêng tư.

---

## ✨ **Tính năng**

* 🖼️ **Trình chỉnh sửa ảnh tích hợp:** cắt, thay đổi kích thước, xoay, lật, vẽ và áp dụng bộ lọc ngay trong ứng dụng.
* 🔐 **Quyền riêng tư là trên hết:** loại bỏ siêu dữ liệu EXIF như tọa độ GPS và thông tin máy ảnh.
* 🔒 **Bảo mật nâng cao:** khóa ảnh, video hoặc toàn bộ ứng dụng bằng PIN, hình mẫu hoặc vân tay.
* ♻️ **Thùng rác tích hợp:** khôi phục ảnh và video vô tình bị xóa trong vài giây.
* 🎨 **Chủ đề động:** Material Design với chủ đề sáng/tối theo hệ thống, cùng các chủ đề tùy chỉnh.
* 📷 **Nhiều định dạng được hỗ trợ:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF và nhiều hơn nữa.
* 🔍 **Tìm kiếm và thư mục:** tìm kiếm media nhanh chóng và quản lý các thư mục được bao gồm, loại trừ và ẩn.
* 🖥️ **Hình nền và tiện ích:** đặt ảnh làm hình nền và thêm tiện ích thư mục vào màn hình chính.
* 📴 **Không cần kết nối:** ứng dụng hoạt động hoàn toàn **ngoại tuyến**.

---

## 📲 **Khả năng tương thích**

| | |
|---|---|
| **Android** | 8.0 (Oreo) trở lên |
| **Phiên bản tối thiểu** | API 26 |
| **Target SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Gói** | `com.simonecompany.simongalleria` |
| **Phiên bản** | `1.0.0` (build 28) |

---

## 🔐 **Quyền riêng tư và bảo mật**

Quyền riêng tư là trái tim của ứng dụng: không tài khoản, không thu thập dữ liệu và không kết nối với thế giới bên ngoài. Các tính năng khóa bảo vệ toàn bộ ứng dụng hoặc chỉ nội dung bạn chọn, trong khi việc loại bỏ siêu dữ liệu EXIF ngăn việc vô tình chia sẻ vị trí hoặc thông tin chụp ảnh của bạn.

| Quyền | Khi nào | Dùng để làm gì |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Đọc ảnh và video trên thiết bị |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Truy cập chọn lọc vào các tệp đã chọn |
| `ACCESS_MEDIA_LOCATION` | luôn luôn | Đọc vị trí từ siêu dữ liệu EXIF |
| `SET_WALLPAPER` | khi được yêu cầu | Đặt ảnh làm hình nền |
| `POST_NOTIFICATIONS` | Android 13+ | Thông báo của ứng dụng |
| `WRITE_EXTERNAL_STORAGE` | đến Android 10 | Lưu và chỉnh sửa media |
| `MANAGE_EXTERNAL_STORAGE` | tùy chọn | Quản lý tệp đầy đủ |
| `RECEIVE_BOOT_COMPLETED` | luôn luôn | Làm mới danh sách media sau khi khởi động lại |

Ứng dụng **không** yêu cầu quyền mạng hoặc quyền truy cập máy ảnh.

---

## 🧑‍💻 **Phát triển**

Dự án được xây dựng bằng **Gradle** và **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK gỡ lỗi
./gradlew assembleFossRelease   # APK phát hành
```

---

## 🐛 **Sự cố đã biết**

* Không có sự cố nào được báo cáo tại thời điểm phát hành.

---

<div align="center">

### ⭐ Nếu bạn thấy ứng dụng hữu ích, hãy để lại một ngôi sao ⭐

</div>
