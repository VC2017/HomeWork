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
		System.out.println("*----��ӭʹ�����й���ϵͳ----*");
		System.out.println("*---------��Ǯ�밴1----------*");
		System.out.println("*---------ȡǮ�밴2----------*");
		System.out.println("*---------��ѯ�밴3----------*");
		System.out.println("*---------�˳��밴4----------*");
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
				System.out.println("������������������");
		}
	}
	public static void cq(){
		System.out.println("������Ҫ����Ľ��");
		int cq = sc.nextInt();
		Yh yh[i] = cq;
		System.out.println("������ɣ��Ƿ��������");
		System.out.println("1 �������� 2 ���ز˵�");
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