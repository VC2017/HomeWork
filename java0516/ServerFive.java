package java0516;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFive {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			for (int a = 0;a<3;a++){
			serversocket = new ServerSocket(9999);
			socket = serversocket.accept(); 
			//���ն���
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Point point = (Point) ois.readObject();
			//���ض���
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(point);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
