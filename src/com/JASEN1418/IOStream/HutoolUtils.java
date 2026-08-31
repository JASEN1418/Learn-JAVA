package com.JASEN1418.IOStream;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.*;

/**
 * Hutool 常用方法演示 & 速查类
 * 覆盖：字符串、日期、数字、集合、文件、加密、HTTP、JSON、ID生成、类型转换 十大模块
 * 所有方法均为 public static，可直接当作工具类使用
 */
public class HutoolUtils {

    /* =====================================================
     *  一、字符串工具 StrUtil（最最常用）
     * ===================================================== */

    /**
     * 1. 判断字符串是否为空（null、""、"   " 都算空）
     * 比原生的 == null 加 isEmpty 方便太多
     */
    public static boolean isBlank(String str) {
        return StrUtil.isBlank(str);
    }

    /**
     * 2. 判断字符串是否非空
     */
    public static boolean isNotBlank(String str) {
        return StrUtil.isNotBlank(str);
    }

    /**
     * 3. 字符串格式化（用 {} 占位，比 String.format 好用）
     * 例：format("我是{}，今年{}岁", "张三", 20) → "我是张三，今年20岁"
     */
    public static String format(String template, Object... args) {
        return StrUtil.format(template, args);
    }

    /**
     * 4. 去除字符串前后空白（安全，null 返回 null）
     */
    public static String trim(String str) {
        return StrUtil.trim(str);
    }

    /**
     * 5. 截取字符串，支持负数索引（-1 表示倒数第一个）
     * 原生 substring 越界会报错，这个不会
     */
    public static String sub(String str, int start, int end) {
        return StrUtil.sub(str, start, end);
    }

    /**
     * 6. 判断是否包含某个字符串（忽略大小写）
     */
    public static boolean containsIgnoreCase(String str, String searchStr) {
        return StrUtil.containsIgnoreCase(str, searchStr);
    }

    /**
     * 7. 下划线转驼峰 / 驼峰转下划线
     */
    public static String toCamelCase(String str) {
        return StrUtil.toCamelCase(str); // user_name → userName
    }

    public static String toUnderlineCase(String str) {
        return StrUtil.toUnderlineCase(str); // userName → user_name
    }


    /* =====================================================
     *  二、日期工具 DateUtil
     * ===================================================== */

    /**
     * 8. 获取当前时间字符串（yyyy-MM-dd HH:mm:ss）
     * 一行搞定，不用写 SimpleDateFormat
     */
    public static String now() {
        return DateUtil.now();
    }

    /**
     * 9. 日期转字符串（自定义格式）
     */
    public static String formatDate(Date date, String pattern) {
        return DateUtil.format(date, pattern);
    }

    /**
     * 10. 字符串转日期（自动识别多种格式）
     * 支持 yyyy-MM-dd、yyyy/MM/dd、yyyy-MM-dd HH:mm:ss 等常见格式
     */
    public static Date parseDate(String dateStr) {
        return DateUtil.parse(dateStr);
    }

    /**
     * 11. 计算两个日期相差多少天
     */
    public static long betweenDays(Date date1, Date date2) {
        return DateUtil.betweenDay(date1, date2, true);
    }

    /**
     * 12. 日期偏移（加几天、减几天）
     * offset 正数加，负数减
     */
    public static Date addDays(Date date, int offset) {
        return DateUtil.offsetDay(date, offset);
    }

    /**
     * 13. 获取当天开始/结束时间
     */
    public static Date startOfDay() {
        return DateUtil.beginOfDay(new Date());
    }

    public static Date endOfDay() {
        return DateUtil.endOfDay(new Date());
    }


    /* =====================================================
     *  三、数字工具 NumberUtil
     * ===================================================== */

    /**
     * 14. 判断字符串是否是纯数字
     */
    public static boolean isNumber(String str) {
        return NumberUtil.isNumber(str);
    }

    /**
     * 15. 数值运算（解决浮点数精度丢失问题）
     * 比如 0.1 + 0.2 原生会得到 0.30000000000000004，用这个就不会
     */
    /**
     * 加法（解决浮点数精度丢失问题）
     */
    public static double add(double d1, double d2) {
        return NumberUtil.add(d1, d2);
    }

    /**
     * 减法
     */
    public static double sub(double d1, double d2) {
        return NumberUtil.sub(d1, d2);
    }

    /**
     * 乘法
     */
    public static double mul(double d1, double d2) {
        return NumberUtil.mul(d1, d2);
    }

    /**
     * 除法，scale 表示保留小数位数（四舍五入）
     */
    public static double div(double d1, double d2, int scale) {
        return NumberUtil.div(d1, d2, scale);
    }

    /**
     * 16. 保留几位小数（四舍五入）
     */
    public static double round(double num, int scale) {
        return NumberUtil.round(num, scale).doubleValue();
    }


    /* =====================================================
     *  四、集合工具 CollUtil
     * ===================================================== */

    /**
     * 17. 判断集合是否为空（null 或 size=0 都算空）
     */
    public static <T> boolean isEmpty(List<T> list) {
        return CollUtil.isEmpty(list);
    }

    /**
     * 18. 集合转字符串，用分隔符连接
     * 例：[1,2,3] 用 "," 连接 → "1,2,3"
     */
    public static <T> String join(List<T> list, String delimiter) {
        return CollUtil.join(list, delimiter);
    }

    /**
     * 19. 求两个集合的交集 / 并集 / 差集
     */
    public static <T> Collection<T> intersection(List<T> list1, List<T> list2) {
        return CollUtil.intersection(list1, list2);//交集
    }

    public static <T> Collection<T> union(List<T> list1, List<T> list2) {
        return CollUtil.union(list1, list2);//并集
    }

    public static <T> Collection<T> disjunction(List<T> list1, List<T> list2) {
        return CollUtil.disjunction(list1, list2);//差集
    }


    /* =====================================================
     *  五、文件工具 FileUtil（对应 commons-io 的 FileUtils）
     * ===================================================== */

    /**
     * 20. 读取文件全部内容为字符串（UTF-8）
     */
    public static String readUtf8String(String filePath) {
        return FileUtil.readUtf8String(filePath);
    }

    /**
     * 21. 写字符串到文件（UTF-8，覆盖模式）
     */
    public static void writeUtf8String(String content, String filePath) {
        FileUtil.writeUtf8String(content, filePath);
    }

    /**
     * 22. 复制文件 / 复制目录（递归）
     * 自动创建目标目录，不用自己判断
     */
    public static void copyFile(String srcPath, String destPath) {
        FileUtil.copy(srcPath, destPath, true); // true 表示覆盖已存在的文件
    }

    /**
     * 23. 删除文件/目录（递归删除，目录也能直接删）
     */
    public static void del(String path) {
        FileUtil.del(path);
    }

    /**
     * 24. 获取文件扩展名（不带点）
     */
    public static String extName(String filePath) {
        return FileUtil.extName(filePath);
    }

    /**
     * 25. 判断文件/目录是否存在
     */
    public static boolean exist(String path) {
        return FileUtil.exist(path);
    }

    /**
     * 26. 递归遍历目录下所有文件
     */
    public static List<File> loopFiles(String dirPath) {
        return FileUtil.loopFiles(dirPath);
    }


    /* =====================================================
     *  六、加密工具 SecureUtil
     * ===================================================== */

    /**
     * 27. MD5 加密（32位小写）
     */
    public static String md5(String str) {
        return SecureUtil.md5(str);
    }

    /**
     * 28. 文件 MD5（计算文件的 md5 值，下载文件校验用）
     */
    public static String md5File(String filePath) {
        return SecureUtil.md5(new File(filePath));
    }

    /**
     * 29. SHA1 加密
     */
    public static String sha1(String str) {
        return SecureUtil.sha1(str);
    }

    /**
     * 30. Base64 编码 / 解码
     */
    public static String base64Encode(String str) {
        return cn.hutool.core.codec.Base64.encode(str);
    }

    public static String base64Decode(String base64Str) {
        return cn.hutool.core.codec.Base64.decodeStr(base64Str);
    }


    /* =====================================================
     *  七、HTTP 工具 HttpUtil
     * ===================================================== */

    /**
     * 31. 最简单的 GET 请求
     */
    public static String httpGet(String url) {
        return HttpUtil.get(url);
    }

    /**
     * 32. 最简单的 POST 请求（表单参数）
     */
    public static String httpPost(String url, java.util.HashMap<String, Object> params) {
        return HttpUtil.post(url, params);
    }

    /**
     * 33. 下载文件到本地
     */
    public static long downloadFile(String url, String savePath) {
        return HttpUtil.downloadFile(url, FileUtil.file(savePath));
    }


    /* =====================================================
     *  八、JSON 工具 JSONUtil
     * ===================================================== */

    /**
     * 34. 对象转 JSON 字符串
     */
    public static String toJsonStr(Object obj) {
        return JSONUtil.toJsonStr(obj);
    }

    /**
     * 35. JSON 字符串转对象
     */
    public static <T> T toBean(String jsonStr, Class<T> clazz) {
        return JSONUtil.toBean(jsonStr, clazz);
    }

    /**
     * 36. 从 JSON 字符串里取某个字段的值
     */
    public static String getByPath(String jsonStr, String path) {
        JSONObject json = JSONUtil.parseObj(jsonStr);
        return json.getByPath(path).toString();
    }


    /* =====================================================
     *  九、ID 生成工具 IdUtil
     * ===================================================== */

    /**
     * 37. 生成 UUID（带横杠）
     */
    public static String randomUUID() {
        return IdUtil.randomUUID();
    }

    /**
     * 38. 生成简单 UUID（不带横杠，32位）
     */
    public static String simpleUUID() {
        return IdUtil.simpleUUID();
    }

    /**
     * 39. 生成雪花 ID（分布式唯一 ID，长整型，有序）
     */
    public static long snowflakeId() {
        return IdUtil.getSnowflakeNextId();
    }


    /* =====================================================
     *  十、类型转换 Convert
     * ===================================================== */

    /**
     * 40. 万能类型转换
     * 支持字符串转数字、转日期、转集合等各种常见转换，不会抛异常
     * 转换失败返回默认值（null 或 0）
     */
    public static <T> T convert(Object value, Class<T> clazz) {
        return Convert.convert(clazz, value);
    }

    /**
     * 41. 字符串转 int（转换失败返回 0，不会报 NumberFormatException）
     */
    public static int toInt(String str) {
        return Convert.toInt(str);
    }

    /**
     * 42. 数字转中文大写金额（财务场景常用）
     */
    public static String digitToChinese(double money) {
        return Convert.digitToChinese(money);
    }


    /* =====================================================
     *  测试入口：main 方法，逐个演示常用功能
     * ===================================================== */
    public static void main(String[] args) {
        System.out.println("========== 📌 1. 字符串工具 ==========");
        System.out.println("isBlank(\"   \") = " + isBlank("   "));
        System.out.println("format(\"我是{}，{}岁\", \"小明\", 20) = " + format("我是{}，{}岁", "小明", 20));
        System.out.println("toCamelCase(\"user_name\") = " + toCamelCase("user_name"));
        System.out.println("sub(\"abcdef\", 2, -1) = " + sub("abcdef", 2, -1));

        System.out.println("\n========== 📌 2. 日期工具 ==========");
        System.out.println("当前时间 = " + now());
        System.out.println("3天后的日期 = " + formatDate(addDays(new Date(), 3), "yyyy-MM-dd"));
        System.out.println("今天开始时间 = " + startOfDay());

        System.out.println("\n========== 📌 3. 数字工具 ==========");
        System.out.println("0.1 + 0.2 = " + add(0.1, 0.2)); // 不会有精度问题
        System.out.println("123.456 保留2位小数 = " + round(123.456, 2));
        System.out.println("isNumber(\"12345\") = " + isNumber("12345"));

        System.out.println("\n========== 📌 4. 集合工具 ==========");
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("b", "c", "d");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("交集 = " + intersection(list1, list2));
        System.out.println("用逗号连接 = " + join(list1, ","));

        System.out.println("\n========== 📌 5. 文件工具 ==========");
        String testFile = "hutool_test.txt";
        writeUtf8String("Hello Hutool!\n这是测试文件", testFile);
        System.out.println("读取文件内容 = " + readUtf8String(testFile));
        System.out.println("文件扩展名 = " + extName(testFile));
        System.out.println("文件是否存在 = " + exist(testFile));
        del(testFile); // 用完删掉
        System.out.println("删除后是否存在 = " + exist(testFile));

        System.out.println("\n========== 📌 6. 加密工具 ==========");
        System.out.println("md5(\"123456\") = " + md5("123456"));
        System.out.println("base64(\"你好\") = " + base64Encode("你好"));
        System.out.println("解码 = " + base64Decode(base64Encode("你好")));

        System.out.println("\n========== 📌 7. ID 生成 ==========");
        System.out.println("简单UUID = " + simpleUUID());
        System.out.println("雪花ID = " + snowflakeId());

        System.out.println("\n========== 📌 8. 类型转换 ==========");
        System.out.println("字符串转int = " + toInt("123"));
        System.out.println("转换失败默认值 = " + toInt("不是数字")); // 返回 0
        System.out.println("1234.56 转中文大写 = " + digitToChinese(1234.56));

        System.out.println("\n🎉 所有 Hutool 常用方法演示完毕！");
    }
}

