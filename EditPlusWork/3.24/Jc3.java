public class Jc3{
	public static void main(String args[]){
		int sum=0;
		for(int a=1,b=1;a<10;a++){
			b=a*b;
			sum+=b;
		}
		System.out.println(sum);
	}
}
