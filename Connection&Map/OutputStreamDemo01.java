package com.javac;

import java.io.* ;    
   
public class OutputStreamDemo01{    
    public static void main(String args[]) throws Exception{    // 异常抛出，不处理     
        // 第1步、使用File类找到一个文件     
        File f= new File("d:" + File.separator + "test.txt") ;  // 声明File对象     
        // 第2步、通过子类实例化父类对象     
        OutputStream out = null ;   // 准备好一个输出的对象     
        out = new FileOutputStream(f)  ;    // 通过对象多态性，进行实例化     
        // 第3步、进行写操作     
        String str = "Hello World!!!" ;     // 准备一个字符串     
        byte b[] = str.getBytes() ;         // 只能输出byte数组，所以将字符串变为byte数组     
        out.write(b) ;                      // 将内容输出，保存文件     
        // 第4步、关闭输出流     
        out.close() ;                       // 关闭输出流     
        System.out.println(new String(b));  //输入
    }    
};    

