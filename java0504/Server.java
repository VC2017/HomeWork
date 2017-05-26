package java0504;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String[] args) {
		ServerSocket severSocket = null;
		Socket socket = null;
		List list = new ArrayList();
		try {
			severSocket = new ServerSocket(10000);
			System.out.println("创建成功，等待客户端连接");
			while(true){
				socket = severSocket.accept();
				list.add(socket);
				new Thread(new SeverThread(socket, list)).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
