import java.util.*;
public class ExceptionDemo2{
	public static void main(String args []) /*throws Exception*/{
		ExceptionDemo2 a = new ExceptionDemo2();
		try{
			a.add();
		}catch(Exception c){
			c.printStackTrace();
		}
	}
	public void add() throws Exception{
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("�������һ����");
			int a = sc.nextInt();
			System.out.println("������ڶ�����");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception c){
			throw new Exception("�������");
		}finally{
			System.out.println("����������");
		}
		
	}
}