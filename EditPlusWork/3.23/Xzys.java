import java.util.Scanner;
public class Xzys{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(1>0){
			System.out.println("��ѡ��������� 1�ӷ���2������3�˷���4����\t����exit�˳�");
			int sum=sc.nextInt();
			switch(sum){
				case 1:
				System.out.println("��ѡ���˼ӷ�");
				System.out.println("�������һ����");
				int shu1 = sc.nextInt();
				System.out.println("������ڶ�����");
				int shu2 = sc.nextInt();
				System.out.println("�ӷ�����");
				System.out.println(shu1+"+"+shu2+"="+(shu1+shu2));
				break;
				case 2:
				System.out.println("��ѡ���˼���");
				System.out.println("�������һ����");
				int shu3 = sc.nextInt();
				System.out.println("������ڶ�����");
				int shu4 = sc.nextInt();
				System.out.println("��������");
				System.out.println(shu3+"-"+shu4+"="+(shu3-shu4));
				break;
				case 3:
				System.out.println("��ѡ���˳˷�");
				System.out.println("�������һ����");
				int shu5 = sc.nextInt();
				System.out.println("������ڶ�����");
				int shu6 = sc.nextInt();
				System.out.println("�˷�����");
				System.out.println(shu5+"*"+shu6+"="+(shu5*shu6));
				break;
				case 4:
				System.out.println("��ѡ���˳���");
				System.out.println("�������һ����");
				int shu7 = sc.nextInt();
				System.out.println("������ڶ�����");
				int shu8 = sc.nextInt();
				System.out.println("��������");
				System.out.println(shu7+"/"+shu8+"="+(shu7/shu8));
			}
		}
	}
}