import java.util.Scanner;
public class Yhxt{
	int i = 0;
	static Scanner sc = new Scanner(System.in);
	static Yh [] yh = new Yh[6];
	public static void main(String args []){
		cd();
	}
	public static void cd(){
		System.out.println("==============================");
		System.out.println("*----欢迎使用银行管理系统----*");
		System.out.println("*---------存钱请按1----------*");
		System.out.println("*---------取钱请按2----------*");
		System.out.println("*---------查询请按3----------*");
		System.out.println("*---------退出请按4----------*");
		System.out.println("==============================");
		String s = sc.next();
		switch(s){
			case "1":
				cq();
			break;
			case "2":
				qq();
			break;
			case "3":
				cx();
			break;
			case "4":
				System.exit(0);
			break;
			default :
				System.out.println("输入有误，请重新输入");
		}
	}
	public static void cq(){
		System.out.println("请输入要存入的金额");
		int cq = sc.nextInt();
		Yh yh[i] = cq;
		System.out.println("存入完成，是否继续存入");
		System.out.println("1 继续存入 2 返回菜单");
		String v = sc.next();
		if(v.equals("1")){
			cq();
		}else if(v.equals("2")){
			cd();
		}
	}
	public static void qq(){
		
	}
	public static void cx(){
		
	}
}