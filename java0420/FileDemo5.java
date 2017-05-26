/*字节流
 * 
 * 
 * ++
 * 输入		inputstream
 * 
 * 输出		outputstream
 * */
package java0420;

import java.util.*;

import java.io.*;

public class FileDemo5 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		File a = new File("d:\\2.text");
		try {
			/*
			a.createNewFile();
			FileInputStream fi = new FileInputStream("d://2.text");
			byte [] bytes = new byte[10];
			fi.read(bytes);
			//String ss = new String(bytes);
			//System.out.println(ss);
			StringBuffer ss = new StringBuffer();
			int len = 0;
			while((len = fi.read(bytes))!=-1){
				ss.append(new String(bytes,0,len));//匿名类 
			}*/
			FileOutputStream fo = new FileOutputStream("d:\\2.text");
			String s = sc.next();
			//byte [] bytes = s.getBytes(); //将string转化为byte数组
			fo.write(s.getBytes()); //  返回string的byre数组
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
