import java.util.Scanner;
import java.util.Arrays;
public class Cs{
	public static void main(String args []){
		/**Scanner sc = new Scanner(System.in);
		System.out.print("������ʮ�������س�������");
		int [] a = new int [10];
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);//��������
		for(int i=0;i<a.length;i++){ //a.length ����ĳ���
			System.out.print(a[i]+",");
		}
-------------------------------------------------------------------------------------------------------
		int [] a = {1,5,6,3,2,0,5};
		Arrays.sort(a);
		int [] b = {1,5,6,3,0,2,5};
		Arrays.sort(b);
		System.out.println(Arrays.equals(a,b)); //����ֵ�ıȽ� a[1]��b[1] ��� �Դ����� ˳���ǹؼ�
		System.out.println(a==b); //�Ƚϵ��ǵ�ַ ���������е�ֵ
-------------------------------------------------------------------------------------------------------
		int [] a = {2,5,8,7};
		Arrays.sort(a);//�����������֮��
		System.out.print(Arrays.binarySearch(a,7)); //���ֲ�ѯ a�����е�7 ��������û�и�ֵ���Ը�����ʾ
-------------------------------------------------------------------------------------------------------
		int [] a ={5,6,9,8,5};
		int [] b = Arrays.copyOf(a,a.length);//��������a��ֵ������b��
		for(int i=0;i<b.length;i++){ //a.length ����ĳ���
			System.out.print(b[i]+",");
		}
-------------------------------------------------------------------------------------------------------
		int [] a = {1,5,6,8,9};
		Arrays.fill(a,56);
		for(int i=0;i<a.length;i++){ //a.length ����ĳ���
			System.out.print(a[i]+",");//��ָ���� int ֵ�����ָ�� int �������ÿ��Ԫ��
		}
-------------------------------------------------------------------------------------------------------*/
		String a="fls csf";
		String b="FLSSCF";
		System.out.println(a.charAt(5));//ȡ�ַ�����ָ��λ�õ��ַ� ��0��ʼ����

		System.out.println(a.equals(b));//�Ƚ������ַ��� ��ͬ����true ����ͬ����false

		System.out.println(a.indexOf("s"));//�ҳ��ַ���һ�γ��ֵ�λ�� ���㿪ʼ

		System.out.println(a.lastIndexOf("s"));//�ҳ��ַ����һ�γ��ֵ�λ��

		System.out.println(a.length());//�����ַ�������
		
		String [] c=a.split(" ");
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);//���ַ��зָ���
		}

		System.out.println(b.toLowerCase());//ת��ΪСд
		System.out.println(a.toUpperCase());//ת��Ϊ��д
/*-------------------------------------------------------------------------------------------------------*/

	}
}