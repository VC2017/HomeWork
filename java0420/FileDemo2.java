package java0420;

import java.io.*;

public class FileDemo2 {

	public static void main(String[] args) {
		File file = new File("F:\\Èí¼þ¿ª·¢\\Java\\Test.txt");
		try {
			InputStream in = new FileInputStream(file);
			char [] c =new char[10];
			int len = 0;
			String s = new String();
			while((len = c.length)!=-1){
				s += new String(c,0,len);
			}
			in.close();
			for(char a:c){
				System.out.println(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
