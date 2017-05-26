package java0502;

import java.io.*;

public class Mythread implements Runnable {
	private int number;
	public Mythread(int number){
		this.number = number;
	}
	public void run() {
		File file = new File("d://¶·ÆÆ²Ôñ·.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file,"r");
			raf.seek(100000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		StringBuffer stb = new StringBuffer();
//		int len = 0;
//		byte [] bytes = new byte[1024];
//		FileInputStream fi = null;
//		try {
//			fi = new FileInputStream(file);
//			while((len = fi.read(bytes))!=-1){
//				stb.append(new String(bytes,0,len));
//			}
//			System.out.println(stb);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			if(fi !=null){
//				try {
//					fi.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
	}
	
}
