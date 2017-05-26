package java0516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ServerThread implements Runnable {
    Socket socket = null;
    List<Socket> sockets;
    Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
    public ServerThread(Socket socket,List<Socket> sockets,Map<String,Socket> socketHashMap){
        this.socket = socket;
        this.sockets = sockets;
        this.socketHashMap = socketHashMap;

    }

    @Override
    public void run() {
        while (true) {
            try {
            	//��ȡ�ͻ��˷�������Ϣ
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String xiaoxi = null;
                xiaoxi = bufferedReader.readLine();

                //������˭���͵�
                Set<String> keys = socketHashMap.keySet();
                String name = "";
                for(String s:keys){
                    Socket so = socketHashMap.get(s);
                    if(socket==so){
                        name = s;
                    }
                }
                //���������ؿͻ���
                String s = name+"��" + xiaoxi;
                //�������ݿ� ������Ϣ
                Connection cnt = MyConnection.getIntance();
        		PreparedStatement rs  = null;
        		try {
        			rs  = cnt.prepareStatement("insert into Talkout(nr) "+"values(?)");
        			rs.setString(1, s);
        			rs.executeUpdate();
        		} catch (SQLException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        		//�������� ���ؿͻ���
                for(Socket socket1:sockets) {
                    PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
                    printWriter.write(s + "\n");
                    printWriter.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


