/*
�ַ��� 
����		writer
���		reader
*/
package java0420;

import java.io.*;

import java.util.*;

public class FileDemo4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("d://1.text");
		try {
			file.createNewFile();
			FileReader fr = new FileReader(file);
			char [] chars = new char[2];//������
			fr.read(chars);
			//for(char c:chars){
			//	System.out.print(c);
			//}
			String s = "";
			int len = 0;
			while((len =fr.read(chars))!=-1){
				String ss = new String(chars,0,len);//����ȡ�����������ƫ���� �������
				s+=ss;
			}
			System.out.println(s);
			/*File file = new File("d://1.text");
			FileWriter fw = new FileWriter(file);
			System.out.println("������");
			String s = sc.next();
			fw.write(s,0,s.length());
			fw.close();*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
