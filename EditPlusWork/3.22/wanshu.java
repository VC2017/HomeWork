public class wanshu{
	public static void main(String args[]){
	int i,j,sum;
		for(i=2;i<=1000;i++){
		for(j=1,sum=0;j<i;j++){
			if(i%j==0){
				sum=sum+j;
			}
		}
		if(i==sum){
			System.out.print(sum+"\t");
			}
		}
	}
}