package java0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Sever {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		try {
			server = new ServerSocket(9998);
			System.out.println("�����ɹ����ȴ��ͻ�������");
			//��̨�ͻ�������
			while(true){
			//�����˿�
			socket = server.accept(); 
			list.add(socket);
			new Thread(new ServerThread(socket, list)).start();
			}
			/*
			 * ѭ���շ�
			while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String xx;
			xx = br.readLine();
			System.out.println("�ͻ��˷�������Ϊ��"+xx);
			//���������ؿͻ��� ����ӡ����
			String s = "�������ѽ��շ��ؿͻ���"+xx;
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.write(s+"\n");
			pw.flush();
			}
			 * */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
