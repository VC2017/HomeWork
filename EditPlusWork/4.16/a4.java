public class a4{
	public static void main(String args []){
		int flag = 1;
		for (int i = 0;i<=100;i++){
			flag = 1;
			if(i ==4){
				flag = 0;
			}
			if(i%10 == 4){
				flag = 0;
			}
			if(i/10 == 4){
				flag =0;
			}
			if(flag == 1){
				System.out.print(i+"\n");
			}
		}
		
	}
}