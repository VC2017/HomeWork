public class Jc{
	public static void main(String args[]){
		int a=1,b=1,sum=0;
		while(a<=10){
			b=a*b;
			sum=sum+b;
			a++;
		}
		System.out.println(sum);
	}
}