package java0502;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;

import java.io.OutputStream;

import java.io.PrintWriter;

import java.net.ServerSocket;

import java.net.Socket;


public class Sever {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6162);
			System.out.println("�����ɹ�");
			while(true){
			Socket soc = ss.accept();
			System.out.println("���ڼ����˿�");
			String add = new String(soc.getInetAddress().getHostAddress());
			System.out.println("���˷��ʵ�ַΪ"+add);
			InputStream is = soc.getInputStream();
			byte [] bytes = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = is.read(bytes)) != -1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println("������:");
			System.out.println("�ͻ��ˣ�"+ sb);
			is.close();
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       /* try {

            // 1.����Server�������˵�����,��ָ�������˿ں�

            ServerSocket server = new ServerSocket(8008);

            // 2.����accept��������

            System.out.println("�������������ӣ��ȴ��ͻ���");

            Socket socket = server.accept();

            // ��ȡ�ͻ���������

            InputStream is = socket.getInputStream();

            // ת�����ַ���

            InputStreamReader isr = new InputStreamReader(is);

            // ��ӻ�����

            BufferedReader br = new BufferedReader(isr);

         

            String data = null;

            while ((data = br.readLine()) != null) {

                // ѭ����ȡ

                System.out.println("���Ƿ������ˣ��ͻ���˵:" + data);

            }
              socket.shutdownInput();//�ر�������

            //ע�⣬��ʱӦ�ȹر�������֮����ܻ�ȡ�����

            // ��ȡ�������˵������,��Ӧ�ͻ���

            OutputStream os = socket.getOutputStream();

            PrintWriter pw = new PrintWriter(os); // ��װ��

            pw.write("fads����");

            pw.flush();
            // �رտɹرյ���Դ

            os.close();
            pw.close();
            is.close();
            isr.close();
            br.close();
            server.close();
        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }*/

    }
}


