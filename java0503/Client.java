package java0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			//Scanner sc = new Scanner(System.in);
			socket = new Socket("192.168.199.237",9998);
			/*
			while(true){
			//�ͻ��˷���������
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			System.out.println("������");
			String js = sc.nextLine();
			pw.write(js+"\n");
			pw.flush();
			//���������տͻ���
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String fanhui = br.readLine();
			System.out.println(fanhui);
			}
			*/
			//Ⱥ��Ҫʵ���շ�����
			//��
			new Thread(new Out(socket)).start();
			//��
			new Thread(new Int(socket)).start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
