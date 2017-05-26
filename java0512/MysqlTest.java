package java0512;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import com.mysql.jdbc.MySQLConnection;

public class MysqlTest {

	public static void main(String[] args) {
		try {
			//������������
			Class.forName("com.mysql.jdbc.Driver");
			//1.getConnection()����������MySQL���ݿ⣡��
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/songdb?user=root&password=2017");
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the database");
			}
			//2.����statement���������ִ��SQL��䣡��
			java.sql.Statement sql=conn.createStatement();
			
	       
			
			//��
//	        PreparedStatement psql;
//	        psql = conn.prepareStatement("insert into ablums(a_name,a_author,a_show_time)"+"values(?,?,?)");
//	        psql.setString(1,"ħ����");
//	        psql.setString(2, "�ܽ���");
//	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	        Date myDate = sdf.parse("2010-03-02");
//	        psql.setDate(3, new java.sql.Date(myDate.getTime()));
//	        psql.executeUpdate();
			
			
			//��
//	        psql = conn.prepareStatement("update ablums set a_author = ? wheref a_id = ?");
//	        psql.setString(1,"��ʿ��");
//	        psql.setInt(2, 201601);
//	        psql.executeUpdate();
//	        psql.close();
			
			
			//ɾ
			PreparedStatement psql;
			psql = conn.prepareStatement("delete from ablums where a_name = ?");
			psql.setString(1, "ħ����");
			
			
			//��
			//3.ResultSet�࣬������Ż�ȡ�Ľ��������
	        java.sql.ResultSet rs=sql.executeQuery("select * from ablums"); 
	        psql.executeUpdate();
	        while(rs.next()){
	        	//��ȡa_name,a_author������
	            System.out.println(rs.getString("a_name")+"\t"+rs.getString("a_author"));
	        }
	        conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		Properties pps = System.getProperties();
//		pps.list(System.out);
	}
	
}
