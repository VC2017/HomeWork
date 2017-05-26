package java0505;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ObjectClient {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.237",11111);
			System.out.println("已连接");
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(new Student("lili",15));
			//socket.shutdownOutput();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Student s = (Student)ois.readObject();
			System.out.println("已接收服务器返回值"+s);
			//socket.shutdownInput();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
