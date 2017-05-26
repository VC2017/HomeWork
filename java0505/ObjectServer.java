package java0505;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(11111);
			System.out.println("ÒÑÆô¶¯");
			socket = serverSocket.accept();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Student s = (Student)ois.readObject();
			System.out.println(s);
			//socket.shutdownInput();
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(s);
			//socket.shutdownOutput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
