import java.util.*;
public class ExceptionDemo3{
	public static void main(String args []){
		System.out.println("�������������");
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
				//System.out.println("�������"+(i+1)+"����");
				a[i] = sc.nextInt();
				if(i<a.length){
					System.out.println("�����������������");
				}
				//break;
			}
			for(int i = 0;i<a.length;i++){
				System.out.print(a[i]+"\t");
			}
			System.out.print("\n");
		}catch (Exception c){
			throw new Exception("����������");
		}
	}
}

