package java0517;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShiWuThread implements Runnable {
	Connection connection;
	public ShiWuThread(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void run() {
		PreparedStatement ps = null;
		String sql = "insert into ablums(a_id,a_name,a_author)"+"values(?,?,?)";
		try {
			connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setInt(1, 201609);
			ps.setString(2, "我好想你");
			ps.setString(3, "李正利");
			ps.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			MyConnection.freeConnection(connection);
		}
		
	}

}
