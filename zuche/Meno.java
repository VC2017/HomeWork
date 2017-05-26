package com.java;
import java.util.*;
public class Meno {
	static Scanner sc = new Scanner(System.in);
	static Car car [] = new Car[6];
	static int n = 0,k = 0;
	static float q = 0;
	public static void main(String[] args) throws Exception{
		System.out.println("******欢迎使用living租车系统******");
		System.out.println("***********您确认租车吗**********");
		System.out.println("是 请按1     否 请按2");
		String v = sc.next();
		if(v.equals("1")){
			System.out.println("您可租车的类型以及价目表");
			car[0] = new PersonCar(1, "奥迪", 4, 500);
			car[1] = new HuoCar(2, "松花江", 2, 300);
			car[2] = new PersonHuoCar(3, "皮卡", 4, 10, 600);
			car[3] = new PersonCar(4, "兰博基尼", 2, 1000);
			car[4] = new HuoCar(5, "依维柯", 20, 600);
			car[5] = new PersonCar(6, "金杯", 7, 200);
			System.out.println("序号\t" + "汽车名称\t\t" + "载客量(人)\t"+ "载重量(吨)\t" +"租金(天)\t"  );
			//System.out.println(Arrays.toString(car));
			for (int i = 0; i<car.length; i++){
				System.out.println(car[i].getId() + "\t" + car[i].getName() + "\t\t" + car[i].getZaike() + "\t\t" + car[i].getZaihuo() + "\t\t" + car[i].getPrice());
			}
			System.out.println("******请输入租车数量******");
			int c = sc.nextInt();
			Car a [] = new Car[c];
			for(int j = 0;j<c;j++){
				System.out.println("****请输入第"+ (j+1) + "种车的型号****");
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
			System.out.println("*****请输入您要租的天数****");
			int z = sc.nextInt();
			System.out.println("*******您的账单******");
			System.out.print("已选载人汽车\n");
			for(int i = 0 ; i<c;i++){
				if(a[i].getZaike()!=0){
					System.out.print(a[i].getName()+"\t");
				}
			}
			System.out.print("\n已选载货汽车\n");
			for(int i = 0; i<c; i++){
				if(a[i].getZaihuo()!=0){
					System.out.println(a[i].getName()+"\t");
				}
			}
			System.out.println("载人量\t" + n + "\t(人)");
			System.out.println("载货量\t" + k + "\t(吨)");
			System.out.println("租金共\t" + q*z + "\t(元)");
			System.out.println("********欢迎下次光临*******");
		}else{
			System.exit(0);
		}
	}

}
