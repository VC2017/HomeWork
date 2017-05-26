class Outer{
	static class StaticInner{
		public void show(){
			System.out.println("静态内部类实例方法");
		}
		public static void staticShow(){
			System.out.println("静态内部类静态方法");
		}
	}
}
public class StaticInnerClassDemo3{
	public static void main(String [] args){
		Outer.StaticInner.staticShow();
		new Outer.StaticInner().show();
	}
}