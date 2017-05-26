package java0517;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class TestShiWu {

	public static void main(String[] args) {
		Connection mc = MyConnection.getIntance();
		Connection mc2 = MyConnection.getIntance();
		new Thread(new ShiWuThread(mc)).start();
		new Thread(new ShiWuThread2(mc2)).start();
	}

}
