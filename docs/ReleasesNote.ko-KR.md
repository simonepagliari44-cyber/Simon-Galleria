<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Simon-Galleria 아이콘" width="120" height="120" />

### *사진과 동영상을 관리하는 Android 앱: 강력하고, 사적이며, 광고 없는*

---

</div>

## 📌 **개요**

**Simon-Galleria**는 편의성을 포기하지 않고 추억을 완전히 통제하고 싶은 사람들을 위해 만들어진 네이티브 **Android** 사진 및 동영상 갤러리입니다. 광고 없음, 추적 없음, 불필요한 권한 없음: 오직 당신에게 맞춘 빠르고 깔끔한 경험만 있습니다.

사진과 동영상을 보고, 정리하고, 편집할 수 있으며, 가장 민감한 콘텐츠를 숨기고 내장 휴지통 덕분에 삭제된 항목을 몇 초 만에 복구할 수 있습니다. 모든 것이 **기기에서 직접** 실행되며 완전한 프라이버시가 보장됩니다.

---

## ✨ **기능**

* 🖼️ **내장 사진 편집기:** 앱 안에서 바로 자르기, 크기 조정, 회전, 뒤집기, 그리기, 필터 적용이 가능합니다.
* 🔐 **프라이버시 우선:** GPS 좌표와 카메라 정보 같은 EXIF 메타데이터를 제거합니다.
* 🔒 **고급 보안:** PIN, 패턴 또는 지문으로 사진, 동영상 또는 앱 전체를 잠급니다.
* ♻️ **내장 휴지통:** 실수로 삭제한 사진과 동영상을 몇 초 만에 복구합니다.
* 🎨 **다이내믹 테마:** 시스템을 따르는 밝은/어두운 테마와 사용자 지정 테마를 갖춘 Material Design.
* 📷 **다양한 지원 형식:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF 등 다양합니다.
* 🔍 **검색 및 폴더:** 빠른 미디어 검색과 포함, 제외, 숨김 폴더 관리.
* 🖥️ **배경화면 및 위젯:** 사진을 배경화면으로 설정하고 홈 화면에 폴더 위젯을 추가합니다.
* 📴 **연결 불필요:** 앱은 완전히 **오프라인**으로 작동합니다.

---

## 📲 **호환성**

| | |
|---|---|
| **Android** | 8.0 (Oreo) 이상 |
| **최소 버전** | API 26 |
| **Target SDK** | API 36 |
| **Compile SDK** | API 36 |
| **Package** | `com.simonecompany.simongalleria` |
| **버전** | `1.0.0` (build 28) |

---

## 🔐 **프라이버시 및 보안**

프라이버시는 앱의 핵심입니다: 계정 없음, 수집되는 데이터 없음, 외부 세계와의 연결 없음. 잠금 기능은 앱 전체 또는 선택한 콘텐츠만 보호하며, EXIF 메타데이터를 제거하면 실수로 위치나 촬영 정보를 공유하는 것을 방지합니다.

| 권한 | 시기 | 용도 |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | 기기의 사진과 동영상 읽기 |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | 선택한 파일에 대한 선택적 접근 |
| `ACCESS_MEDIA_LOCATION` | 항상 | EXIF 메타데이터에서 위치 읽기 |
| `SET_WALLPAPER` | 요청 시 | 사진을 배경화면으로 설정 |
| `POST_NOTIFICATIONS` | Android 13+ | 앱 알림 |
| `WRITE_EXTERNAL_STORAGE` | Android 10까지 | 미디어 저장 및 편집 |
| `MANAGE_EXTERNAL_STORAGE` | 선택 사항 | 전체 파일 관리 |
| `RECEIVE_BOOT_COMPLETED` | 항상 | 재부팅 후 미디어 목록 새로 고침 |

앱은 네트워크 권한이나 카메라 접근을 **필요로 하지 않습니다**.

---

## 🧑‍💻 **개발**

프로젝트는 **Gradle**과 **Kotlin**으로 빌드됩니다:

```bash
./gradlew assembleFossDebug     # 디버그 APK
./gradlew assembleFossRelease   # 릴리스 APK
```

---

## 🐛 **알려진 문제**

* 릴리스 시점에 보고된 문제가 없습니다.

---

<div align="center">

### ⭐ 앱이 유용하다면 별을 남겨 주세요 ⭐

</div>
