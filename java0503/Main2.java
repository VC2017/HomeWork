package java0503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main2 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("�������ӷ�����");
			socket = new Socket("192.168.199.237",8999);
			String s = "hello";
			//���������������
			System.out.println("���ڷ���");
			OutputStream os = socket.getOutputStream();
			os.write(s.getBytes());
			os.flush();
			socket.shutdownOutput();
			//��ȡ���������͵�����
			System.out.println("���ڽ��շ�������������");
			InputStream is = socket.getInputStream();
			int len = 0;
			byte [] bytes = new byte[1024];
			StringBuffer sb = new StringBuffer();
			while((len = is.read(bytes)) != -1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println(sb);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
