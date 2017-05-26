package java0515;

import java.sql.*;


public class SQLDemo {

	public static void main(String[] args) {
		String a = null;
		String b = null;
		String c = null;
		String d = null;
		Integer f = null;
		Connection cnt = MyConnection.getIntance();
		try {
			Statement stm = cnt.createStatement();
			SQLDemo sd = new SQLDemo();
			//sd.add("��ð�","����");
			sd.select();
			//sd.drop("����");
			sd.up("����ؼ�", 201617);
			cnt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//����
	public void add(String a,String b){
		Connection cnt = MyConnection.getIntance();
		PreparedStatement rs  = null;
		try {
			rs  = cnt.prepareStatement("insert into ablums(a_name,a_author) "+"values(?,?)");
			rs.setString(1, a);
			rs.setString(2, b);
			rs.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//ɾ��
	public void drop(String c){
		Connection cnt = MyConnection.getIntance();
		PreparedStatement ps = null;
		try {
			ps = cnt.prepareStatement("delete from ablums where a_author = ?");
			//ps = cnt.prepareStatement("truncate table ablums");//��ձ� �൱��ɾ���ؽ�
			ps.setString(1, c);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�޸�
	public void up(String d,int f){
		Connection cnt = MyConnection.getIntance();
		PreparedStatement ps = null;
		try {
			ps = cnt.prepareStatement("update ablums set a_name = ? where a_id = ?");
			ps.setString(1, d);
			ps.setInt(2, f);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��ѯ
	public void select(){
		Connection cnt = MyConnection.getIntance();
		ResultSet rs = null;
		try {
			rs = cnt.createStatement().executeQuery("select * from ablums");
			while(rs.next()){
				System.out.println(rs.getInt("a_id")+"\t"+rs.getString("a_name")+"\t"+rs.getString("a_author"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
