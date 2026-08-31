package com.JASEN1418.IOStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.nio.charset.StandardCharsets;

public class ZipStreamDemo {




    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zis=new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while((entry=zis.getNextEntry())!=null){
            if(entry.isDirectory()){
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else{
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zis.read())!=-1){
                    fos.write(b);
                }
                fos.close();

                zis.closeEntry();
            }
        }

        zis.close();
    }

    public static void zip(File srcDir, File destZip) throws IOException {
        // 1. 参数校验：源必须是目录
        if (!srcDir.exists() || !srcDir.isDirectory()) {
            throw new IllegalArgumentException("源路径必须是存在的目录: " + srcDir.getAbsolutePath());
        }

        // 2. 确保目标zip的父目录存在
        File parentDir = destZip.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        byte[] buffer = new byte[8192];

        // 3. try-with-resources 自动关流；指定 UTF-8 解决中文文件名乱码
        try (ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream(destZip), StandardCharsets.UTF_8)) {

            // 4. 递归压缩目录下的所有文件
            // 第二个参数传空字符串，表示zip包内的相对路径起点
            addFileToZip(zos, srcDir, "", buffer);
        }
    }

    /**
     * 递归方法：把文件/目录添加到zip流中
     * @param zos       zip输出流
     * @param currentFile 当前要处理的文件或目录
     * @param relativePath 该文件在zip包内的相对路径
     * @param buffer    读写缓冲区
     */
    private static void addFileToZip(ZipOutputStream zos, File currentFile,
                                     String relativePath, byte[] buffer) throws IOException {

        if (currentFile.isDirectory()) {
            // 处理目录：zip里目录entry要以 "/" 结尾
            String dirPath = relativePath + currentFile.getName() + "/";
            zos.putNextEntry(new ZipEntry(dirPath));
            zos.closeEntry();

            // 递归处理目录下的所有子文件/子目录
            File[] files = currentFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    addFileToZip(zos, file, dirPath, buffer);
                }
            }
        } else {
            // 处理文件
            String entryPath = relativePath + currentFile.getName();
            zos.putNextEntry(new ZipEntry(entryPath));

            try (FileInputStream fis = new FileInputStream(currentFile)) {
                int len;
                while ((len = fis.read(buffer)) != -1) {
                    zos.write(buffer, 0, len);
                }
            }

            zos.closeEntry();
        }
    }
}
