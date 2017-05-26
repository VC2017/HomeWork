/**
学校类
属性/字段/成员变量 学校名 学校位置 学校人数 学校面积
动作/方法 上课 放学 放假
*/
public class School{
	//声明属性
	String name;
	int sum;
	String wz;
	int s;
	//声明动作
	public void sk (){
		System.out.println("上课时间到了");
	}
	public void fx(){
		System.out.println("放学了同学们");
	}
	public void fj(){
		System.out.println("放假了同学们");
	}
	//构造器
	public School(String name,int sum,String wz,int s){
		this.name = name;
		this.sum = sum;
		this.wz = wz;
		this.s = s;
	}
	//输出学校基本信息
	public void say(){
		System.out.println(name+"，"+"共有"+sum+"人，"+"位于"+wz+"占地"+s+"公顷。");
	}
}