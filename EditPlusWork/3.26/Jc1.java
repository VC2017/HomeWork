import java.util.*;
public class Jc1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = jc(a);
		System.out.println(c);
	}
	public static int jc(int b){
		int temp=1;
		int sum=0;
		for(int i=1;i<=b;i++){
			temp=i*temp;
			sum=sum+temp;
		}
		return sum;
	}
}