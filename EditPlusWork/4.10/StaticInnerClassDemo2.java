class Outer{
	private String name ="waibu";
	private static int age = 17;
	static class StaticInner{
		private String s = "inner";
		private static int num = 13;
		public void show(){
			//System.out.println(name);//访问不到
			System.out.println(age);//可以访问
			System.out.println(new Outer().name);
		}
	}
	public void test(){
		//System.out.println(s);//访问不到
		//System.out.println(num);//访问不到
		System.out.println(new StaticInner().s);//可以访问
		System.out.println(new StaticInner().num);//可以访问
	}
}
public class StaticInnerClassDemo2{
	public static void main(String [] args){
		new Outer().test();//创建内部类对象并调用方法test
		new Outer.StaticInner().show();//创建外部类对象并调用方法show
	}
}