package java0417;
import java.util.*;
public class Jbc {

	public static void main(String[] args) {
		System.out.println("������ 1 ���� 2 ���� 3 ��");
		Scanner vc = new Scanner(System.in);
		int a = vc.nextInt();
		int b = (int)(Math.random()*3+1);
		System.out.println(b);
		if(a == b){
			System.out.println("ƽ");
		}
		if(a == 1 && b == 2){
			System.out.println("���Ӯ");
		}
		if(a == 1 && b == 3){
			System.out.println("����Ӯ");
		}
		if(a == 2 && b ==1){
			System.out.println("����Ӯ");
		}
		if(a == 2 && b ==3){
			System.out.println("���Ӯ");
		}
		if(a == 3 && b ==1){
			System.out.println("���Ӯ");
		}
		if(a == 3 && b ==2){
			System.out.println("����Ӯ");
		}
	}

}
