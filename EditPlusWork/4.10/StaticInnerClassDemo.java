class Outer{
	class Inner{
		public void show(){
			System.out.println("非静态内部类方法");
		}
	}
}
public class StaticInnerClassDemo{
	public static void main(String [] args){
		Outer out = new Outer();//创建外部类对象
		Outer.Inner in = out.new Inner();//根据外部类对象创建内部类对象
		in.show();
	}
}