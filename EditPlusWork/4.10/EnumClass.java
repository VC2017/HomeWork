public class EnumClass{
	public static void main(String [] args){
		EnumDemo ed = EnumDemo.red;
		System.out.println(ed);//���ֵ
		System.out.println(ed.name());//���ʵ����
		System.out.println(ed.ordinal());//���ʵ������ֵ
	}
}
enum EnumDemo{
	red,blue,green;
}
