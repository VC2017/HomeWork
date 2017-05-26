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
			System.out.println("创建成功");
			while(true){
			Socket soc = ss.accept();
			System.out.println("正在监听端口");
			String add = new String(soc.getInetAddress().getHostAddress());
			System.out.println("有人访问地址为"+add);
			InputStream is = soc.getInputStream();
			byte [] bytes = new byte[1024];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = is.read(bytes)) != -1){
				sb.append(new String(bytes,0,len));
			}
			System.out.println("服务器:");
			System.out.println("客户端："+ sb);
			is.close();
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       /* try {

            // 1.创建Server服务器端的连接,并指定监听端口号

            ServerSocket server = new ServerSocket(8008);

            // 2.建立accept（）连接

            System.out.println("服务器即将连接，等待客户端");

            Socket socket = server.accept();

            // 获取客户端输入流

            InputStream is = socket.getInputStream();

            // 转换成字符流

            InputStreamReader isr = new InputStreamReader(is);

            // 添加缓冲流

            BufferedReader br = new BufferedReader(isr);

         

            String data = null;

            while ((data = br.readLine()) != null) {

                // 循环读取

                System.out.println("我是服务器端，客户端说:" + data);

            }
              socket.shutdownInput();//关闭输入流

            //注意，此时应先关闭输入流之后才能获取输出流

            // 获取服务器端的输出流,响应客户端

            OutputStream os = socket.getOutputStream();

            PrintWriter pw = new PrintWriter(os); // 包装流

            pw.write("fads看了");

            pw.flush();
            // 关闭可关闭的资源

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


