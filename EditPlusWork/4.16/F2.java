import java.util.*;
public class F2{
	public static void main(String args[]) {
		System.out.println("«Î ‰»Î");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sum(a);
		System.out.println(b);
	}
	public static int sum(int b){
		int temp=0;
		for(int i=0;i<=b;i++){
			temp=temp+i;
		}
		return temp;
	}
}
