public class Y01{
	public static void main(String args[]){
		int he=0,sum=0,s=0,u=0,su=0;
		for(int a=1;a<=250;a++){
			sum=sum+a;
		}
		for(int b=251;b<=500;b++){
			s=s+b;
		}
		for(int c=501;c<=750;c++){
			u=u+c;
		}
		for(int d=751;d<=1000;d++){
			su=su+d;
		}
		he=sum+s+u+su;
		System.out.println(he);
	}
}