package java0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
/*多台客户端连接服务器
 * */
public class ServerThread implements Runnable{
	List<Socket> sockets;
	Socket socket = null;
	public ServerThread(Socket socket,List<Socket> sockets){
		this.socket = socket;
		this.sockets = sockets;
	}
	@Override
	public void run() {
		while(true){
				try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xx;
				xx = br.readLine();
				System.out.println("客户端返回内容为："+xx);
				//服务器返回客户端 （打印流）
				String s = "服务器已接收返回客户端"+xx;
				for(Socket socket1:sockets){
					PrintWriter pw = new PrintWriter(socket1.getOutputStream());
					pw.write(s+"\n");
					pw.flush();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
