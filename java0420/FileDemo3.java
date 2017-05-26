package java0420;

import java.io.*;

public class FileDemo3 {

	public static void main(String[] args) {
		File file = new File("f:\\软件开发");
		findFile(file);
	}
	public static void findFile(File f){
		if(f.isDirectory()){//判断此抽象路径名表示的文件是否是一个目录
			File [] files = f.listFiles();
			//返回一个抽象路径数组，这些路径名表示此抽象路径表示目录中的文件
			for(File s:files){
				findFile(s);
			}
		}else if(f.getName().endsWith("java")){
			System.out.println(f.getAbsolutePath());
		}
	}

}
