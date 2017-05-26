package java0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class SeverThread implements Runnable {
	Socket socket = null;
	List<Socket> sockets;
	public SeverThread(Socket socket,List<Socket> sockets){
		this.socket = socket;
		this.sockets = sockets;
	}
	@Override
	public void run() {
		while(true){
			try {
				//服务端接收客户端发送的消息
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xx = br.readLine();
				System.out.println("客户端返回内容为"+xx);
				//服务端发给客户端消息
				String s = "已接收客户端消息，消息为"+xx;
				for(Socket socket1:sockets){
					PrintWriter pw = new PrintWriter(socket1.getOutputStream());
					pw.write(s+"\n");
					pw.flush();
				}
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
