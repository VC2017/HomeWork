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

            // 1.建立客户端,输入服务器的地址以及端口

            Socket socket = new Socket("192.168.199.237", 6162);

            // 获取输出流，向服务器打印信息

            OutputStream os = socket.getOutputStream();

            // 包装成打印流

            PrintWriter pw = new PrintWriter(os);

            pw.write("用户名：Admin 密码：ck");

            pw.flush();

            socket.shutdownOutput(); //关闭输出流

            //此时应该先关闭输出流然后在开启输入流

            // 获取客户端的输入流

            InputStream is = socket.getInputStream();

            // 转换成字符流

            InputStreamReader isr = new InputStreamReader(is);

            BufferedReader rd = new BufferedReader(isr); // 转换成缓冲流

            String data = null;

            while ((data = rd.readLine()) != null) {

                // 循环读取

                System.out.println("我是客户端，服务器端说:" + data);

            }

            // 关闭可关闭的资源

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
