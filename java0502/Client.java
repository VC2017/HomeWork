package java0502;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;

import java.io.OutputStream;

import java.io.PrintWriter;

import java.net.Socket;
public class Client {
	public static void main(String[] args) {
        try {

            // 1.�����ͻ���,����������ĵ�ַ�Լ��˿�

            Socket socket = new Socket("192.168.199.237", 6162);

            // ��ȡ����������������ӡ��Ϣ

            OutputStream os = socket.getOutputStream();

            // ��װ�ɴ�ӡ��

            PrintWriter pw = new PrintWriter(os);

            pw.write("�û�����Admin ���룺ck");

            pw.flush();

            socket.shutdownOutput(); //�ر������

            //��ʱӦ���ȹر������Ȼ���ڿ���������

            // ��ȡ�ͻ��˵�������

            InputStream is = socket.getInputStream();

            // ת�����ַ���

            InputStreamReader isr = new InputStreamReader(is);

            BufferedReader rd = new BufferedReader(isr); // ת���ɻ�����

            String data = null;

            while ((data = rd.readLine()) != null) {

                // ѭ����ȡ

                System.out.println("���ǿͻ��ˣ���������˵:" + data);

            }

            // �رտɹرյ���Դ

            rd.close();

            is.close();

            isr.close();

            pw.close();

            os.close();

            pw.close();
        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

 

    }
}
