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
			//加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//1.getConnection()方法，连接MySQL数据库！！
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/songdb?user=root&password=2017");
			if(!conn.isClosed()){
				System.out.println("Succeeded connecting to the database");
			}
			//2.创建statement类对象，用来执行SQL语句！！
			java.sql.Statement sql=conn.createStatement();
			
	       
			
			//增
//	        PreparedStatement psql;
//	        psql = conn.prepareStatement("insert into ablums(a_name,a_author,a_show_time)"+"values(?,?,?)");
//	        psql.setString(1,"魔杰座");
//	        psql.setString(2, "周杰伦");
//	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	        Date myDate = sdf.parse("2010-03-02");
//	        psql.setDate(3, new java.sql.Date(myDate.getTime()));
//	        psql.executeUpdate();
			
			
			//改
//	        psql = conn.prepareStatement("update ablums set a_author = ? wheref a_id = ?");
//	        psql.setString(1,"孙士羽");
//	        psql.setInt(2, 201601);
//	        psql.executeUpdate();
//	        psql.close();
			
			
			//删
			PreparedStatement psql;
			psql = conn.prepareStatement("delete from ablums where a_name = ?");
			psql.setString(1, "魔杰座");
			
			
			//查
			//3.ResultSet类，用来存放获取的结果集！！
	        java.sql.ResultSet rs=sql.executeQuery("select * from ablums"); 
	        psql.executeUpdate();
	        while(rs.next()){
	        	//获取a_name,a_author列数据
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
