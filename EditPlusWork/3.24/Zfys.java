import java.util.*;
public class Zfys{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("�������һ����");
		int a =sc.nextInt();
		System.out.println("������ڶ�����");
		int b =sc.nextInt();
		System.out.println("�����������+ - * /");
		while(true){
				String flag=sc.next();
				if("+".equals(flag)){
				System.out.println("a+b="+(a+b));
				break;
				}else if("-".equals(flag)){
				System.out.println("a-b="+(a-b));
				break;
				}else if("*".equals(flag)){
				System.out.println("a*b="+(a*b));
				break;
				}else if("/".equals(flag)){
				System.out.println("a/b="+(a/b));
				break;
				}else{
				System.out.println("��������ȷ�����+ - * /");
				}
			}
		}
	}
}