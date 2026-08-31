package com.JASEN1418.IOStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;

/**
 * commons-io 常用方法封装演示类
 * 涵盖三大工具类：FileUtils、IOUtils、FilenameUtils
 * 所有方法均已处理编码为 UTF-8
 */
public class Commons_IO {

    /* =====================================================
     *  第一部分：FileUtils —— 文件 & 目录操作（最常用）
     * ===================================================== */

    /**
     * 1. 读取文本文件全部内容为字符串
     * 替代原生的 BufferedReader 一大坨代码
     */
    public static String readFileToString(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    /**
     * 2. 读取文本文件所有行，返回 List<String>
     */
    public static List<String> readFileToLines(File file) throws IOException {
        return FileUtils.readLines(file, StandardCharsets.UTF_8);
    }

    /**
     * 3. 把字符串写入文件（覆盖模式）
     */
    public static void writeStringToFile(File file, String content) throws IOException {
        FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8, false);
    }

    /**
     * 4. 向文件追加内容（追加模式）
     */
    public static void appendStringToFile(File file, String content) throws IOException {
        FileUtils.writeStringToFile(file, content, StandardCharsets.UTF_8, true);
    }

    /**
     * 5. 复制单个文件
     * 比原生 Files.copy 更省心，自动处理目标目录不存在的情况
     */
    public static void copyFile(File srcFile, File destFile) throws IOException {
        FileUtils.copyFile(srcFile, destFile);
    }

    /**
     * 6. 复制整个目录（递归复制所有子文件、子目录）
     * 原生要自己写递归，这里一行搞定
     */
    public static void copyDirectory(File srcDir, File destDir) throws IOException {
        FileUtils.copyDirectory(srcDir, destDir);
    }

    /**
     * 7. 删除目录（递归删除，包括里面所有文件和子目录）
     * 原生 File.delete() 只能删空目录/单个文件，这个最常用
     */
    public static void deleteDirectory(File dir) throws IOException {
        FileUtils.deleteDirectory(dir);
    }

    /**
     * 8. 清空目录（保留目录本身，删掉里面所有内容）
     */
    public static void cleanDirectory(File dir) throws IOException {
        FileUtils.cleanDirectory(dir);
    }

    /**
     * 9. 获取文件/目录大小（字节数）
     * 目录会递归统计所有子文件大小
     */
    public static long sizeOf(File file) {
        return FileUtils.sizeOf(file);
    }

    /**
     * 10. 遍历目录下所有文件（递归）
     * 返回所有文件的集合，不包含目录
     */
    public static Collection<File> listAllFiles(File dir) {
        // 第二个参数：文件过滤器，TrueFileFilter.INSTANCE 表示不过滤，全要
        // 第三个参数：目录过滤器，TrueFileFilter.INSTANCE 表示进入所有子目录
        return FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
    }

    /**
     * 11. 按扩展名过滤查找文件
     * 比如找出目录下所有 .java 文件
     */
    public static Collection<File> listFilesByExtension(File dir, String extension) {
        // 通配符过滤：*.后缀名
        WildcardFileFilter fileFilter = new WildcardFileFilter("*." + extension);
        return FileUtils.listFiles(dir, fileFilter, TrueFileFilter.INSTANCE);
    }

    /**
     * 12. 移动文件/目录（支持跨分区移动）
     */
    public static void moveFile(File src, File dest) throws IOException {
        FileUtils.moveFile(src, dest);
    }

    /**
     * 13. 判断两个文件内容是否完全相同
     * 比自己读字节对比方便，内部做了性能优化
     */
    public static boolean contentEquals(File file1, File file2) throws IOException {
        return FileUtils.contentEquals(file1, file2);
    }

    /**
     * 14. 把 byte[] 字节数组直接写入文件
     */
    public static void writeByteArrayToFile(File file, byte[] data) throws IOException {
        FileUtils.writeByteArrayToFile(file, data);
    }

    /**
     * 15. 把整个文件读成 byte[] 字节数组
     */
    public static byte[] readFileToByteArray(File file) throws IOException {
        return FileUtils.readFileToByteArray(file);
    }


    /* =====================================================
     *  第二部分：IOUtils —— 输入输出流操作
     * ===================================================== */

    /**
     * 16. 把输入流全部内容读成字符串
     * 注意：此方法不会关闭流，需要调用者自己关（或用try-with-resources）
     */
    public static String toString(InputStream input) throws IOException {
        return IOUtils.toString(input, StandardCharsets.UTF_8);
    }

    /**
     * 17. 把输入流读成 byte 数组
     */
    public static byte[] toByteArray(InputStream input) throws IOException {
        return IOUtils.toByteArray(input);
    }

    /**
     * 18. 复制输入流到输出流
     * 这是 IOUtils 最经典的方法，底层用缓冲区高效拷贝
     */
    public static long copy(InputStream input, OutputStream output) throws IOException {
        return IOUtils.copy(input, output);
    }

    /**
     * 19. 安静关闭流（不用写 try-catch，也不用判空）
     * 老项目里非常常用，Java 7+ 推荐用 try-with-resources 替代
     */
    public static void closeQuietly(Closeable closeable) {
        IOUtils.closeQuietly(closeable);
    }

    /**
     * 20. 比较两个输入流内容是否相同
     */
    public static boolean contentEquals(InputStream input1, InputStream input2) throws IOException {
        return IOUtils.contentEquals(input1, input2);
    }


    /* =====================================================
     *  第三部分：FilenameUtils —— 文件名/路径处理
     * ===================================================== */

    /**
     * 21. 获取文件扩展名（不带点）
     * 例如：a/b/c.txt → txt
     */
    public static String getExtension(String fileName) {
        return FilenameUtils.getExtension(fileName);
    }

    /**
     * 22. 获取文件名（不含路径）
     * 例如：a/b/c.txt → c.txt
     */
    public static String getName(String fileName) {
        return FilenameUtils.getName(fileName);
    }

    /**
     * 23. 获取文件名（不含扩展名和路径）
     * 例如：a/b/c.txt → c
     */
    public static String getBaseName(String fileName) {
        return FilenameUtils.getBaseName(fileName);
    }

    /**
     * 24. 获取文件所在目录路径
     * 例如：a/b/c.txt → a/b/
     */
    public static String getFullPath(String fileName) {
        return FilenameUtils.getFullPath(fileName);
    }

    /**
     * 25. 规范化路径（去掉 ../ ./ 等冗余符号）
     */
    public static String normalize(String fileName) {
        return FilenameUtils.normalize(fileName);
    }

    /**
     * 26. 判断文件扩展名是否是指定的某一个
     */
    public static boolean isExtension(String fileName, String extension) {
        return FilenameUtils.isExtension(fileName, extension);
    }


    /* =====================================================
     *  测试入口：main 方法，挨个演示常用功能
     * ===================================================== */
    public static void main(String[] args) {
        try {
            File testFile = new File("test_commons.txt");
            File testDir = new File("test_dir");

            // 1. 写文件
            writeStringToFile(testFile, "Hello Commons IO!\n第二行内容");
            System.out.println("✅ 写入文件成功");

            // 2. 读文件
            String content = readFileToString(testFile);
            System.out.println("✅ 读取文件内容：\n" + content);

            // 3. 追加内容
            appendStringToFile(testFile, "\n这是追加的一行");
            System.out.println("✅ 追加后行数：" + readFileToLines(testFile).size());

            // 4. 文件大小
            System.out.println("✅ 文件大小：" + sizeOf(testFile) + " 字节");

            // 5. 文件名处理
            String path = "D:/project/src/Main.java";
            System.out.println("✅ 文件名：" + getName(path));
            System.out.println("✅ 扩展名：" + getExtension(path));
            System.out.println("✅ 主文件名：" + getBaseName(path));
            System.out.println("✅ 所在目录：" + getFullPath(path));

            // 6. 复制文件
            File copyFile = new File("test_copy.txt");
            copyFile(testFile, copyFile);
            System.out.println("✅ 复制文件后内容相等：" + contentEquals(testFile, copyFile));

            // 7. 遍历目录（当前目录下所有 java 文件）
            Collection<File> javaFiles = listFilesByExtension(new File("."), "java");
            System.out.println("✅ 当前目录下 .java 文件数量：" + javaFiles.size());

            // 8. 流操作演示
            try (FileInputStream fis = new FileInputStream(testFile)) {
                String streamContent = toString(fis);
                System.out.println("✅ 用流读取的内容长度：" + streamContent.length());
            }

            // 清理测试文件（用完就删，方便你反复测试）
            testFile.delete();
            copyFile.delete();
            System.out.println("\n🎉 所有方法演示完毕！");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

