package java0503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	public static void main(String [] args){
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(8999);
			System.out.println("�����������ɹ����ȴ��ͻ�������");
			socket = serverSocket.accept();
			System.out.println("���ӳɹ�");
			//���տͻ��˷���������
			InputStream in = socket.getInputStream();
			int len = 0;
			byte [] bytes = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while((len = 0)!=-1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println("�ͻ��ˣ�"+sb);
			in.close();
			//�����ݷ����ͻ���
			String s = "�����յ���Ϣ"+sb;
			OutputStream os = socket.getOutputStream();
			os.write(s.getBytes());
			os.flush();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
