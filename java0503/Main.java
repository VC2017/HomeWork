package java0503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	public static void main(String [] args){
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(8999);
			System.out.println("服务器创建成功，等待客户端连接");
			socket = serverSocket.accept();
			System.out.println("连接成功");
			//接收客户端发来的数据
			InputStream in = socket.getInputStream();
			int len = 0;
			byte [] bytes = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while((len = 0)!=-1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println("客户端："+sb);
			in.close();
			//将数据发给客户端
			String s = "我已收到消息"+sb;
			OutputStream os = socket.getOutputStream();
			os.write(s.getBytes());
			os.flush();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
