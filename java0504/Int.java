package java0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//服务器返回客户端
public class Int implements Runnable {
	Socket socket;
	public Int(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		BufferedReader br = null;
		while(true){
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String fanhui = null;
			try {
				fanhui = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("服务器返回"+fanhui);
		}
	}
	

}
