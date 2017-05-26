package java0417;
import java.util.*;
public class Jbc {

	public static void main(String[] args) {
		System.out.println("请输入 1 剪子 2 包袱 3 锤");
		Scanner vc = new Scanner(System.in);
		int a = vc.nextInt();
		int b = (int)(Math.random()*3+1);
		System.out.println(b);
		if(a == b){
			System.out.println("平");
		}
		if(a == 1 && b == 2){
			System.out.println("玩家赢");
		}
		if(a == 1 && b == 3){
			System.out.println("电脑赢");
		}
		if(a == 2 && b ==1){
			System.out.println("电脑赢");
		}
		if(a == 2 && b ==3){
			System.out.println("玩家赢");
		}
		if(a == 3 && b ==1){
			System.out.println("玩家赢");
		}
		if(a == 3 && b ==2){
			System.out.println("电脑赢");
		}
	}

}
