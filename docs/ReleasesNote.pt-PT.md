<div align="center">

# 🖼️ **Simon-Galleria** 📸
<img src="../app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ícone do Simon-Galleria" width="120" height="120" />

### *Aplicação Android para gerir as suas fotos e vídeos: poderosa, privada e sem anúncios*

---

</div>

## 📌 **Visão geral**

O **Simon-Galleria** é uma galeria nativa de fotos e vídeos para **Android**, criada para quem quer ter controlo total sobre as suas memórias sem abdicar da comodidade. Sem anúncios, sem rastreamento e sem permissões desnecessárias: apenas uma experiência rápida e arrumada à sua medida.

Pode visualizar, organizar e editar as suas fotos e vídeos, ocultar o conteúdo mais sensível e recuperar itens eliminados em segundos graças ao caixote do lixo integrado. Tudo funciona **diretamente no seu dispositivo**, com total privacidade.

---

## ✨ **Funcionalidades**

* 🖼️ **Editor de fotos integrado:** recorte, redimensione, rode, inverta, desenhe e aplique filtros dentro da própria aplicação.
* 🔐 **Privacidade em primeiro lugar:** remova metadados EXIF como coordenadas GPS e detalhes da câmara.
* 🔒 **Segurança avançada:** bloqueie fotos, vídeos ou a aplicação inteira com PIN, padrão ou impressão digital.
* ♻️ **Caixote do lixo integrado:** recupere fotos e vídeos eliminados acidentalmente em segundos.
* 🎨 **Temas dinâmicos:** Material Design com temas claro/escuro que seguem o sistema, além de temas personalizados.
* 📷 **Muitos formatos suportados:** JPEG, JPEG XL, PNG, MP4, MKV, RAW, SVG, GIF, AVIF e muitos mais.
* 🔍 **Pesquisa e pastas:** pesquisa rápida de multimédia e gestão de pastas incluídas, excluídas e ocultas.
* 🖥️ **Papel de parede e widget:** defina uma foto como papel de parede e adicione o widget de pasta ao ecrã principal.
* 📴 **Sem necessidade de ligação:** a aplicação funciona totalmente **offline**.

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

A privacidade é o coração da aplicação: sem conta, sem dados recolhidos e sem ligação ao mundo exterior. As funcionalidades de bloqueio protegem a aplicação inteira ou apenas o conteúdo que escolher, enquanto a remoção de metadados EXIF evita partilhar acidentalmente a sua localização ou detalhes da captura.

| Permissão | Quando | Para que serve |
|---|---|---|
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` | Android 13+ | Ler fotos e vídeos no dispositivo |
| `READ_MEDIA_VISUAL_USER_SELECTED` | Android 14+ | Acesso seletivo aos ficheiros escolhidos |
| `ACCESS_MEDIA_LOCATION` | sempre | Ler a localização dos metadados EXIF |
| `SET_WALLPAPER` | quando solicitado | Definir uma foto como papel de parede |
| `POST_NOTIFICATIONS` | Android 13+ | Notificações da aplicação |
| `WRITE_EXTERNAL_STORAGE` | até ao Android 10 | Guardar e editar multimédia |
| `MANAGE_EXTERNAL_STORAGE` | opcional | Gestão completa de ficheiros |
| `RECEIVE_BOOT_COMPLETED` | sempre | Atualizar a lista de multimédia após um reinício |

A aplicação **não** requer permissão de rede nem acesso à câmara.

---

## 🧑‍💻 **Desenvolvimento**

O projeto é construído com **Gradle** e **Kotlin**:

```bash
./gradlew assembleFossDebug     # APK de depuração
./gradlew assembleFossRelease   # APK de lançamento
```

---

## 🐛 **Problemas conhecidos**

* Nenhum reportado no momento do lançamento.

---

<div align="center">

### ⭐ Se achar a aplicação útil, deixe uma estrela ⭐

</div>
