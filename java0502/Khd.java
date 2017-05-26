package java0502;

import java.io.OutputStream;

import java.net.Socket;

public class Khd {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.199.154",5959);
			System.out.println("是否连接成功"+socket.isConnected());
			OutputStream osp = socket.getOutputStream();
			osp.write("清风自来".getBytes());
			osp.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
