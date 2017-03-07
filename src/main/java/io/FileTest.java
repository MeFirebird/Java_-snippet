package io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/28.
 */
public class FileTest {
    public static void main(String[] args) throws IOException{

        File file = new File("hello");
        // 获取文件名: hello
        System.out.println(file.getName()  + " " + file.exists());
        // 父路径: null
        System.out.println(file.getParent());
        //绝对路径: E:\05代码\zhangdong.java.demos\hello
        System.out.println(file.getAbsoluteFile());
        //绝对路径的父路径: E:\05代码\zhangdong.java.demos
        System.out.println(file.getAbsoluteFile().getParent());

        // 此处可能会抛IOException  所以方法申明要抛出异常      文件无法创建，中文路径的原因吧！! 遇到过
//        File file1 = File.createTempFile("zhangdong",".txt",file);

        File file2 = new File(System.currentTimeMillis() + "zhangdong");
        System.out.println("文件file2是否已经存在？" + file2.exists());
        // 创建目录
        file2.createNewFile();

        //列出文件目录
        String[] list = file2.list();
        System.out.println(list);
//        for(String filename: list){
//            System.out.println(filename);
//        }

        System.out.println("文件最后修改时间：" + file2.lastModified());
        System.out.println("文件内容的长度：" + file2.length());
    }
}
