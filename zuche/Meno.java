package com.java;
import java.util.*;
public class Meno {
	static Scanner sc = new Scanner(System.in);
	static Car car [] = new Car[6];
	static int n = 0,k = 0;
	static float q = 0;
	public static void main(String[] args) throws Exception{
		System.out.println("******��ӭʹ��living�⳵ϵͳ******");
		System.out.println("***********��ȷ���⳵��**********");
		System.out.println("�� �밴1     �� �밴2");
		String v = sc.next();
		if(v.equals("1")){
			System.out.println("�����⳵�������Լ���Ŀ��");
			car[0] = new PersonCar(1, "�µ�", 4, 500);
			car[1] = new HuoCar(2, "�ɻ���", 2, 300);
			car[2] = new PersonHuoCar(3, "Ƥ��", 4, 10, 600);
			car[3] = new PersonCar(4, "��������", 2, 1000);
			car[4] = new HuoCar(5, "��ά��", 20, 600);
			car[5] = new PersonCar(6, "��", 7, 200);
			System.out.println("���\t" + "��������\t\t" + "�ؿ���(��)\t"+ "������(��)\t" +"���(��)\t"  );
			//System.out.println(Arrays.toString(car));
			for (int i = 0; i<car.length; i++){
				System.out.println(car[i].getId() + "\t" + car[i].getName() + "\t\t" + car[i].getZaike() + "\t\t" + car[i].getZaihuo() + "\t\t" + car[i].getPrice());
			}
			System.out.println("******�������⳵����******");
			int c = sc.nextInt();
			Car a [] = new Car[c];
			for(int j = 0;j<c;j++){
				System.out.println("****�������"+ (j+1) + "�ֳ����ͺ�****");
				int e = sc.nextInt();
				a[j] = car[e-1];
				for(int i = 0;i<6;i++){
					if(e == car[i].getId()){
						n = n + car[i].getZaike();
						k = k + car[i].getZaihuo();
						q = q + car[i].getPrice();
					}
				}
			}
			System.out.println("*****��������Ҫ�������****");
			int z = sc.nextInt();
			System.out.println("*******�����˵�******");
			System.out.print("��ѡ��������\n");
			for(int i = 0 ; i<c;i++){
				if(a[i].getZaike()!=0){
					System.out.print(a[i].getName()+"\t");
				}
			}
			System.out.print("\n��ѡ�ػ�����\n");
			for(int i = 0; i<c; i++){
				if(a[i].getZaihuo()!=0){
					System.out.println(a[i].getName()+"\t");
				}
			}
			System.out.println("������\t" + n + "\t(��)");
			System.out.println("�ػ���\t" + k + "\t(��)");
			System.out.println("���\t" + q*z + "\t(Ԫ)");
			System.out.println("********��ӭ�´ι���*******");
		}else{
			System.exit(0);
		}
	}

}
