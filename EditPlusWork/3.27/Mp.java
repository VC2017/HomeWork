import java.util.*;
public class Mp{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("������ʮ����");
		int [] a=new int[10];
		int t=0,i,j;
		for(i=0;i<=9;i++){
		a[i]=sc.nextInt();
		}
		for(j=0;j<9;j++){
			for(i=0;i<9-j;i++){
				if(a[i]>a[i+1]){
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
				}
			}
		}
		for(i=0;i<=9;i++){
		System.out.print(a[i]+"\t");
		}
	}
}