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
			System.out.println("请输入第一个数");
			int a = sc.nextInt();
			System.out.println("请输入第二个数");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception c){
			throw new Exception("运算错误");
		}finally{
			System.out.println("请重新输入");
		}
		
	}
}