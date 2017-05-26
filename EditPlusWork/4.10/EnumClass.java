public class EnumClass{
	public static void main(String [] args){
		EnumDemo ed = EnumDemo.red;
		System.out.println(ed);//输出值
		System.out.println(ed.name());//输出实例名
		System.out.println(ed.ordinal());//输出实例索引值
	}
}
enum EnumDemo{
	red,blue,green;
}
