package java0504;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String args [] ){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.237",10000);
			//接收与发送
			new Thread(new Out(socket)).start();
			new Thread(new Int(socket)).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
