package java0417;

import java.util.Scanner;

public class Cp {
	static int sum =0;
	public static void main(String[] args) {
		System.out.println("请输入您的彩票号码共七位");
		Scanner sc = new Scanner(System.in);
		int a [] = new int [7];
		int c [] = new int [16];
		for(int i = 0;i<7;i++){
			a[i] = sc.nextInt();
		}
		for(int i =0;i<c.length;i++){
			c[i] = (int)(Math.random()*35+1);
			for(int j = 0;j<c.length;j++){
				if(c[i] == c[j]){
					c[i] = (int)(Math.random()*35+1);
				}
			}
		}
		System.out.println("中奖号码为");
		for(int i =0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<c.length;j++){
				if(a[i] == c[j]){
					sum += 1;
					break;
				}
			}
		}
		System.out.println();
		if(sum == 7){
			System.out.println("恭喜你获得一等奖十个亿");
		}
		if(sum == 6){
			System.out.println("恭喜你获得二等奖一个亿");
		}
		if(sum == 5){
			System.out.println("恭喜你获得三等奖温馨礼品一份");
		}
		if(sum < 5){
			System.out.println("很遗憾 下次幸运女神会眷顾您的");
		}
	}
}
