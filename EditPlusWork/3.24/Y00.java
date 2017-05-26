public class Y00{
	public static void main(String args[]){
		int he=0,sum=0,s=0,u=0,su=0;
		for(int a=1;a<=25;a++){
			sum=sum+a;
		}
		for(int b=26;b<=50;b++){
			s=s+b;
		}
		for(int c=51;c<=75;c++){
			u=u+c;
		}
		for(int d=76;d<=100;d++){
			su=su+d;
		}
		he=sum+s+u+su;
		System.out.println(he);
	}
}