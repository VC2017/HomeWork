import java.util.*;
public class Zfys{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("请输入第一个数");
		int a =sc.nextInt();
		System.out.println("请输入第二个数");
		int b =sc.nextInt();
		System.out.println("请输入运算符+ - * /");
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
				System.out.println("请输入正确运算符+ - * /");
				}
			}
		}
	}
}