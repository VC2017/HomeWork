package java0420;

import java.io.*;

public class FileDemo3 {

	public static void main(String[] args) {
		File file = new File("f:\\�������");
		findFile(file);
	}
	public static void findFile(File f){
		if(f.isDirectory()){//�жϴ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
			File [] files = f.listFiles();
			//����һ������·�����飬��Щ·������ʾ�˳���·����ʾĿ¼�е��ļ�
			for(File s:files){
				findFile(s);
			}
		}else if(f.getName().endsWith("java")){
			System.out.println(f.getAbsolutePath());
		}
	}

}
