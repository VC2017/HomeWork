import java.util.*;
public class ExceptionDemo{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args []){
		try{
			System.out.println("请输入第一个数");
			int a = sc.nextInt();
			System.out.println("请输入第二个数");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception c){
			System.out.println("数学运算出错");
			//c.printStackTrace();//打印堆区栈区所有信息
			//c.getMessage();//获取异常信息
			System.out.println(c.toString());//返回异常类型和信息
		}finally{
			System.out.println("输入有误请重新输入");
		}
		
	}
}