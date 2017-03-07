package io;

import java.io.File;

/**
 * Created by Administrator on 2017/2/10.
 */
public class MkdirAndMkdirs {

    public static void main(String[] asrgs){
//        File tempDir = new File( "temp ");     //当该为多级目录时，将无法创建。
//        System.out.println(tempDir);
//        //   mkdir（）创建此抽象路径名称指定的目录（及只能创建一级的目录，且需要存在父目录）
//        tempDir.mkdir();
//        System.out.println(tempDir);


        // mkdirs（）创建此抽象路径指定的目录，包括所有必须但不存在的父目录。（及可以创建多级目录，无论是否存在父目录）
        File next  =  new  File( "temp/temp ");    // 创建文件类的实例
        next.mkdirs();                            //  创建此实例的物理实例
        System.out.println(next);
    }

}
