package java0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Sever {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		try {
			server = new ServerSocket(9998);
			System.out.println("创建成功，等待客户端连接");
			//多台客户端连接
			while(true){
			//监听端口
			socket = server.accept(); 
			list.add(socket);
			new Thread(new ServerThread(socket, list)).start();
			}
			/*
			 * 循环收发
			while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String xx;
			xx = br.readLine();
			System.out.println("客户端返回内容为："+xx);
			//服务器返回客户端 （打印流）
			String s = "服务器已接收返回客户端"+xx;
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.write(s+"\n");
			pw.flush();
			}
			 * */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
