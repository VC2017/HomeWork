import java.util.Scanner;
public class Xzys{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(1>0){
			System.out.println("请选择运算规则 1加法，2减法，3乘法，4除法\t输入exit退出");
			int sum=sc.nextInt();
			switch(sum){
				case 1:
				System.out.println("您选择了加法");
				System.out.println("请输入第一个数");
				int shu1 = sc.nextInt();
				System.out.println("请输入第二个数");
				int shu2 = sc.nextInt();
				System.out.println("加法运算");
				System.out.println(shu1+"+"+shu2+"="+(shu1+shu2));
				break;
				case 2:
				System.out.println("您选择了减法");
				System.out.println("请输入第一个数");
				int shu3 = sc.nextInt();
				System.out.println("请输入第二个数");
				int shu4 = sc.nextInt();
				System.out.println("减法运算");
				System.out.println(shu3+"-"+shu4+"="+(shu3-shu4));
				break;
				case 3:
				System.out.println("您选择了乘法");
				System.out.println("请输入第一个数");
				int shu5 = sc.nextInt();
				System.out.println("请输入第二个数");
				int shu6 = sc.nextInt();
				System.out.println("乘法运算");
				System.out.println(shu5+"*"+shu6+"="+(shu5*shu6));
				break;
				case 4:
				System.out.println("您选择了除法");
				System.out.println("请输入第一个数");
				int shu7 = sc.nextInt();
				System.out.println("请输入第二个数");
				int shu8 = sc.nextInt();
				System.out.println("除法运算");
				System.out.println(shu7+"/"+shu8+"="+(shu7/shu8));
			}
		}
	}
}