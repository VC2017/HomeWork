import java.util.*;
public class Ff{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����");
		int a=sc.nextInt();
		System.out.println("������ڶ�����");
		int b=sc.nextInt();
		System.out.println("�������������");
		int c=sc.nextInt();
		int d=max(a,b,c);
		System.out.println(d);
	}
	public static int max(int a,int b,int c){
		int temp=0;
		System.out.print(a+","+b+","+c+"��������");
		temp=a>b?(a>c?a:c):(b>c?b:c);
		return temp;
	}
}