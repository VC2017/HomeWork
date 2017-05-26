import java.util.*;
public class ExceptionDemo3{
	public static void main(String args []){
		System.out.println("请输入五个整数");
		ExceptionDemo3 a = new ExceptionDemo3();
		try{
			a.vc();	
		}catch(Exception c){
				System.out.println(c.toString());
		}
	}
	public void vc() throws Exception{
		try{
			Scanner sc = new Scanner(System.in);
			int a [] = new int[5];
			for(int i = 0;i<a.length;i++){
				//System.out.println("请输入第"+(i+1)+"个数");
				a[i] = sc.nextInt();
				if(i<a.length){
					System.out.println("请至少输入五个整数");
				}
				//break;
			}
			for(int i = 0;i<a.length;i++){
				System.out.print(a[i]+"\t");
			}
			System.out.print("\n");
		}catch (Exception c){
			throw new Exception("请输入整数");
		}
	}
}

