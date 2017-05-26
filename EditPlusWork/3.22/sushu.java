public class sushu{
	public static void main(String args[]){
        	int a,i,flat;
	for(i=2; i<=1000; i++) {
		for(a=2,flat=1; a<i; a++) {
			if(i%a==0) {
				flat=0;
			}
		}
	if(flat==1){
		System.out.print(i+"\t");
			}
		}
	}
}