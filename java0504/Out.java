package java0504;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
//�ͻ��˷���������
public class Out implements Runnable {
	Socket socket;
	public Out(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(true){
			PrintWriter pw = null;
			try {
				pw = new PrintWriter(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������");
			String s = sc.next();
			pw.write(s+"\n");
			pw.flush();
		}
	}
	

}
