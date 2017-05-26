import java.util.*;
public class Mm{
	public static void main(String args[]){
		int a=0,b=0,c=0,d=0;
		System.out.println("请输入新密码");
		while(d<=5){
		a=0;b=0;c=0;
		Scanner sc = new Scanner(System.in);
		String possword=sc.next();
		char[] p = possword.toCharArray();//new char[possword.length()];
		for(int i=0;i<possword.length();i++){
			//p[i]=possword.charAt(i);
			if(p[i]>='0'&& p[i]<='9'){
				a=1;
			}
			if(p[i]>='A'&& p[i]<='z'){
				b=1;
			}
			if(p[i]>=33 && p[i]<=47 || p[i]>=58 && p[i]<=64){
				c=1;
			}
		 }
		int sum=a+b+c;
			if(sum==3){
				System.out.println("您的密码等级为高");
			}else if(sum==2){
				System.out.println("您的密码等级为中，有待加强");
			}else if((sum==1)){
				System.out.println("您的密码等级过低，请重新输入");
			}
			d++;
		}	
	}
}