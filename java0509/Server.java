package java0509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
	    public static void main(String[] args){
	        ServerSocket serverSocket = null;
	        Socket socket = null;
	        List<Socket> list = new ArrayList<Socket>();
	        Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	        try {
	        	//连接
	            serverSocket = new ServerSocket(10001);
	            while (true) {
	                socket = serverSocket.accept();
	                //读取客户端发来的名字
	                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	                String name = bufferedReader.readLine();
	                socketHashMap.put(name,socket);//映射名字和客户端。
	                list.add(socket);
	                //启动服务器读文件线程
	                new Thread(new ServerThread(socket,list,socketHashMap)).start();
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	    }
	

}