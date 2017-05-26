class Outer{
	private String name ="waibu";
	private static int age = 17;
	static class StaticInner{
		private String s = "inner";
		private static int num = 13;
		public void show(){
			//System.out.println(name);//���ʲ���
			System.out.println(age);//���Է���
			System.out.println(new Outer().name);
		}
	}
	public void test(){
		//System.out.println(s);//���ʲ���
		//System.out.println(num);//���ʲ���
		System.out.println(new StaticInner().s);//���Է���
		System.out.println(new StaticInner().num);//���Է���
	}
}
public class StaticInnerClassDemo2{
	public static void main(String [] args){
		new Outer().test();//�����ڲ�����󲢵��÷���test
		new Outer.StaticInner().show();//�����ⲿ����󲢵��÷���show
	}
}