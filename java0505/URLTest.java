package java0505;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) {
		/*String url = "http://www.baidu.com";
		try {
			//创建URL对象
			URL url1 = new URL(url);
			//打开URL
			URLConnection uc = url1.openConnection();
			//发起请求连接
			uc.connect();
			//获取发送内容
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			//StringBuffer sb = new StringBuffer();
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		/*
		//下载储存
		String url = "http://t1.27270.com/uploads/150609/7-1506091506401R.jpg";
		try {
			URL url1 = new URL(url);
			URLConnection uc = url1.openConnection();
			uc.connect();
			InputStream is = uc.getInputStream();
			byte [] bytes = new byte [1024];
			File file = new File("d://1.jpg");
			FileOutputStream fi = new FileOutputStream(file);
			int len = 0;
			while((len =is.read(bytes)) != -1){
				fi.write(bytes,0,len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		http://www.tuling123.com/openapi/api?key=ddd09981d30846919786fd3d028bffcb&info=你好
		*/
		//获取源文件 机器人
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("你想说啥");
			String s = sc.next();
			String url = "http://www.tuling123.com/openapi/api?key=ddd09981d30846919786fd3d028bffcb&info="+s;
			try {
				URL url1 = new URL(url);
				URLConnection uc = url1.openConnection();
				uc.connect();
				BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
				System.out.println(br.readLine());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
