public class yhsj
{
	public static void main(String[] args){
		int[][] a=new int[10][10];
		int i,j;
		for(i=0;i<10;i++){
			for(j=0;j<i;j++){
				if(j==0||j==i){
					a[i][j]=1;
				}else{
				a[i][j]=a[i-1][j]+a[i-1][j-1];
				}
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
	}
}