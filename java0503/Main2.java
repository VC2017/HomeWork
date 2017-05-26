package java0503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main2 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("正在连接服务器");
			socket = new Socket("192.168.199.237",8999);
			String s = "hello";
			//向服务器发送数据
			System.out.println("正在发送");
			OutputStream os = socket.getOutputStream();
			os.write(s.getBytes());
			os.flush();
			socket.shutdownOutput();
			//读取服务器发送的数据
			System.out.println("正在接收服务器返回数据");
			InputStream is = socket.getInputStream();
			int len = 0;
			byte [] bytes = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while((len = is.read(bytes)) != -1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println(sb);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
