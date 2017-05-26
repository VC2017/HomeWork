package java0424;

import java.io.*;

public class Zhl {

	public static void main(String[] args) {
		// 转换流
		/*try{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("path"));
		osw.write("afdasfas");
		System.out.println(osw.getEncoding());
		osw.close();
		osw = new OutputStreamWriter(new FileOutputStream("path",true),"iso_1");
		osw.write("afwefefg");
		System.out.println(osw.getEncoding());
		}catch(Exception e){
			e.printStackTrace();
		}
		InputStreamReader isr =           
				 new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try {      s = br.readLine();
			while(s!=null){
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				s = br.readLine();
			}      
			br.close(); 
			} catch (Exception e) {
				e.printStackTrace(); 
			}*/
		//打印流
		/*PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"test.txt")));
			out.print(3+"+"+2+"=");
			out.println(2+3);
			out.println("Hello itcast!");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}



