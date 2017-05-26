package java0417;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		try{
			test();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static int test() throws Exception{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("请输入第一个数");
			int a = sc.nextInt();
			System.out.println("请输入第一个数");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			return 0;
		}catch(Exception e){
			throw new Exception("违背运算规则");
		}finally{
			System.out.println("请重新输入");
		}
	}

}
