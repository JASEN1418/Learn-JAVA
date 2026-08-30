package com.JASEN1418.IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        //如果不存在会创建但要保证父级路径存在
        //path或者File都可以
        //文件已经存在会清空文件
        //后面加true打开续写开关  不会清空前面的内容
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\temp\\a.txt",true);

        //ASCII表
        fileOutputStream.write(97);

        byte[] arr={97,98,99,100,101};
        fileOutputStream.write(arr,0,5);//数组名 起点 长度 后面不写默认整个数组

        String a="牛逼\n";
        byte[] s=a.getBytes();
        fileOutputStream.write(s);

        //取消对文件的占用
        fileOutputStream.close();
    }
}
