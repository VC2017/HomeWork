package java0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Int implements Runnable {
	Socket socket = null;
	public Int(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		while(true){
			BufferedReader br = null;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String fanhui = null;
			try {
				fanhui = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fanhui);
		}
	}

}
