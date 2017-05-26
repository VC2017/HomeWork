package java0420;

import java.io.*;

import java.util.*;

public class FileDemo6 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("d://3.text");
		try {
			FileWriter fw = new FileWriter(file , true);
			System.out.println("«Î ‰»Î");
			String s = sc.next();
			fw.write(s,0,s.length());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
