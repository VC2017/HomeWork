import java.util.*;
public class ExceptionDemo{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args []){
		try{
			System.out.println("�������һ����");
			int a = sc.nextInt();
			System.out.println("������ڶ�����");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception c){
			System.out.println("��ѧ�������");
			//c.printStackTrace();//��ӡ����ջ��������Ϣ
			//c.getMessage();//��ȡ�쳣��Ϣ
			System.out.println(c.toString());//�����쳣���ͺ���Ϣ
		}finally{
			System.out.println("������������������");
		}
		
	}
}