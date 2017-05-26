public class Y02{
	public static void main(String args[]){
		int he=0,sum=0,s=0,u=0,su=0;
		for(int a=1;a<=2500;a++){
			sum=sum+a;
		}
		for(int b=2501;b<=5000;b++){
			s=s+b;
		}
		for(int c=5001;c<=7500;c++){
			u=u+c;
		}
		for(int d=7501;d<=10000;d++){
			su=su+d;
		}
		he=sum+s+u+su;
		System.out.println(he);
	}
}