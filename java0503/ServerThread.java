package java0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
/*��̨�ͻ������ӷ�����
 * */
public class ServerThread implements Runnable{
	List<Socket> sockets;
	Socket socket = null;
	public ServerThread(Socket socket,List<Socket> sockets){
		this.socket = socket;
		this.sockets = sockets;
	}
	@Override
	public void run() {
		while(true){
				try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xx;
				xx = br.readLine();
				System.out.println("�ͻ��˷�������Ϊ��"+xx);
				//���������ؿͻ��� ����ӡ����
				String s = "�������ѽ��շ��ؿͻ���"+xx;
				for(Socket socket1:sockets){
					PrintWriter pw = new PrintWriter(socket1.getOutputStream());
					pw.write(s+"\n");
					pw.flush();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
