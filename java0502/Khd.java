package java0502;

import java.io.OutputStream;

import java.net.Socket;

public class Khd {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.199.154",5959);
			System.out.println("�Ƿ����ӳɹ�"+socket.isConnected());
			OutputStream osp = socket.getOutputStream();
			osp.write("�������".getBytes());
			osp.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
