package java0503;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Out implements Runnable {
	Socket socket = null;
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
			System.out.println("«Î ‰»Î");
			String js = sc.nextLine();
			pw.write(js+"\n");
			pw.flush();
		}
	}

	

}
