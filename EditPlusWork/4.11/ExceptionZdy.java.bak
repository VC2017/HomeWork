import java.util.*;
public class ExceptionZdy{
	public static void main(String args []) throws MyException{
		ExceptionZdy a = new ExceptionZdy();
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("请输入");
			String b = s.next();
			a.messge(b);
		}catch(Exception e){
			e.printStackTrace();
			throw new MyException("运算错误");
		}
	}
	public void messge(String sc) throws MyException{
		
		if(sc.equals("4")){
			System.out.println("不能输入4");
		}else if(sc.equals("null")){
			System.out.println("输入值不能为空");
		}else if(sc.equals("$")){
			System.out.println("您的输入包含非法字符");
		}else{
			System.out.println(sc);
		}
	}
}
class MyException extends Exception{
	public MyException(){
		super();
	}
	public MyException(String message){
		super(message);
	}
}