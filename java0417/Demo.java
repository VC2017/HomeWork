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
			System.out.println("�������һ����");
			int a = sc.nextInt();
			System.out.println("�������һ����");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			return 0;
		}catch(Exception e){
			throw new Exception("Υ���������");
		}finally{
			System.out.println("����������");
		}
	}

}
