package java0516;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	private static Connection mc = null;
	static{
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//1.getConnection()����������MySQL���ݿ�
			mc =  DriverManager.getConnection("jdbc:mysql://localhost:3306/java0515?user=root&password=2017");
//			if(!mc.isClosed()){
//				System.out.println("Succeeded connecting to the database");
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public MyConnection(){
		
	}
	public static Connection getIntance(){
		
		return mc;
	}
}