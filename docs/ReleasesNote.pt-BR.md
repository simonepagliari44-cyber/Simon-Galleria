<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ícone do Simon-Galleria" width="120" height="120" />

### *Aplicativo Android para gerenciar suas fotos e vídeos: poderoso, privado e sem anúncios*

---

</div>

## 📌 **Visão geral**

**Simon-Galleria** é uma galeria nativa de fotos e vídeos para **Android** criada para quem deseja controle total sobre suas memórias sem abrir mão da praticidade. Sem anúncios, sem rastreamento e sem permissões desnecessárias: apenas uma experiência rápida e organizada feita para você.

Você pode visualizar, organizar e editar suas fotos e vídeos, ocultar seu conteúdo mais sensível e recuperar itens excluídos em segundos graças à lixeira integrada. Tudo funciona **diretamente no seu dispositivo**, com total privacidade.

---

## ✨ **Recursos**

* 🖼️ **Editor de fotos integrado:** recorte, redimensione, gire, espelhe, desenhe e aplique filtros dentro do próprio aplicativo.
* 🔐 **Privacidade em primeiro lugar:** remova metadados EXIF como coordenadas GPS e detalhes da câmera.
* 🔒 **Segurança avançada:** bloqueie fotos, vídeos ou o aplicativo inteiro com PIN, padrão ou impressão digital.
* ♻️ **Lixeira integrada:** recupere fotos e vídeos excluídos acidentalmente em segundos.
* 🎨 **Temas dinâmicos:** Material Design com temas claro/escuro que seguem o sistema, além de temas personalizados.
* 📷 **Muitos formatos suportados:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF e muitos outros.
* 🔍 **Busca e pastas:** busca rápida de mídia e gerenciamento de pastas incluídas, excluídas e ocultas.
* 🖥️ **Papel de parede e widget:** defina uma foto como papel de parede e adicione o widget de pasta à tela inicial.
* 📴 **Sem necessidade de conexão:** o aplicativo funciona totalmente **offline**.

---

## 📲 **Compatibilidade**

| | |
|---|---|
| **Android** | 8.0 (Oreo) e posteriores |
| **Versão mínima** | API 26 |
| **SDK de destino** | API 36 |
| **SDK de compilação** | API 36 |
| **Pacote** | `com.simonecompany.simongalleria` |
| **Versão** | `1.0.0` (build 28) |

---

## 🔐 **Privacidade e segurança**

A privacidade é o coração do aplicativo: sem conta, sem coleta de dados e sem conexão com o mundo exterior. Os recursos de bloqueio protegem o aplicativo inteiro ou apenas o conteúdo que você escolher, enquanto a remoção de metadados EXIF evita compartilhar acidentalmente sua localização ou detalhes da captura.

| Permissão | Quando | Para que serve |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Ler fotos e vídeos no dispositivo |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Acesso seletivo aos arquivos escolhidos |
| `ACCESS_MEDIA_LOCATION` | sempre | Ler a localização dos metadados EXIF |
| `SET_WALLPAPER` | quando solicitado | Definir uma foto como papel de parede |
| `POST_NOTIFICATIONS` | Android 13+ | Notificações do aplicativo |
| `WRITE_EXTERNAL_STORAGE` | até o Android 10 | Salvar e editar mídia |
| `MANAGE_EXTERNAL_STORAGE` | opcional | Gerenciamento completo de arquivos |
| `RECEIVE_BOOT_COMPLETED` | sempre | Atualizar a lista de mídia após reiniciar |

O aplicativo **não** requer permissão de rede nem acesso à câmera.

---

## 🧑‍💻 **Desenvolvimento**

O projeto é construído com **Gradle** e **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK de depuração
./gradlew assembleFossRelease   # APK de lançamento
```

---

## 🐛 **Problemas conhecidos**

* Nenhum relatado no momento do lançamento.

---

<div align="center">

### ⭐ Se você achar o aplicativo útil, deixe uma estrela ⭐

</div>
