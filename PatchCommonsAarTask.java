import org.objectweb.asm.*;
import java.io.*;
import java.util.zip.*;

public class PatchCommonsAarTask {
    public static void main(String[] args) throws Exception {
        File aarFile = new File(args[0]);
        File outJar = new File(args[1]);
        
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(aarFile));
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outJar))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (entry.getName().endsWith(".class") && 
                    entry.getName().contains("ActivityExtensionsKt")) {
                    ClassReader cr = new ClassReader(zis.readAllBytes());
                    ClassWriter cw = new ClassWriter(0);
                    ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                        @Override
                        public MethodVisitor visitMethod(int access, String name, String desc, 
                                                        String sig, String[] exceptions) {
                            if (name.equals("fakeVersionCheck")) {
                                return null;
                            }
                            return super.visitMethod(access, name, desc, sig, exceptions);
                        }
                        @Override
                    public FieldVisitor visitField(int access, String name, String desc, 
                                                   String sig, Object value) {
                        if (name.equals("FAKE_VERSION_APP_LABEL")) {
                            return null;
                        }
                        return super.visitField(access, name, desc, sig, value);
                        }
                    };
                    cr.accept(cv, 0);
                    byte[] patched = cw.toByteArray();
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    zos.write(patched);
                    zos.closeEntry();
                } else {
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    byte[] buf = new byte[4096];
                    int len;
                    while ((len = zis.read(buf)) > 0) zos.write(buf, 0, len);
                    zos.closeEntry();
                }
            }
        }
        System.out.println("Patched: " + outJar.getAbsolutePath());
    }
}
