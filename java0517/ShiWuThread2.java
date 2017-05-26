package java0517;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShiWuThread2 implements Runnable {
	
	Connection connection;
	
	public ShiWuThread2(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void run() {
		PreparedStatement ps = null;
		String sql = "update ablums set a_author = ? where a_id = ?";
		try {
			connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setString(1, "ÍõÎÄÉ½");
			ps.setInt(2, 201603);
			ps.executeUpdate();
			Thread.sleep(3000);
			connection.commit();
		} catch (Exception e) {
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
