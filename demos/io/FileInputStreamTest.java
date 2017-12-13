package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/28.
 */
public class FileInputStreamTest{

    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileInputStream fileInputStream = new FileInputStream("FileInputStreamTest.java");
        byte[] bytes = new byte[1024];
        // 保存实际读取的字节数
        int hasRead = 0;
        while ((hasRead = fileInputStream.read(bytes)) > 0){
            System.out.println(new String(bytes,0,hasRead));
        }
        fileInputStream.close();

    }
}
