package java0417;

import java.util.Scanner;

public class Cp {
	static int sum =0;
	public static void main(String[] args) {
		System.out.println("���������Ĳ�Ʊ���빲��λ");
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
		System.out.println("�н�����Ϊ");
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
			System.out.println("��ϲ����һ�Ƚ�ʮ����");
		}
		if(sum == 6){
			System.out.println("��ϲ���ö��Ƚ�һ����");
		}
		if(sum == 5){
			System.out.println("��ϲ�������Ƚ���ܰ��Ʒһ��");
		}
		if(sum < 5){
			System.out.println("���ź� �´�����Ů���������");
		}
	}
}
