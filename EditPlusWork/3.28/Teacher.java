/**
教师类
属性：名字 性别 年龄 所授科目
动作：讲课 下课 休息
*/
public class Teacher{
	//声明属性 字段
	String name;//姓名
	int age;//年龄
	char sex;//性别
	String cla;//所授科目
	//声明动作 方法
	public void sk(){
		System.out.println("正在上课，请不要捣乱");
	}
	public void xk(){
		System.out.println("下了课同学们");
	}
	public void xx(){
		System.out.println("让老师休息一下吧，zzz");
	}
	//构造器
	public Teacher(String name,int age,char sex,String cla){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.cla = cla;
	}
	//输出教师基本信息
	public void say(){
		System.out.println(name+","+age+"岁,"+sex+"岁"+"教授"+cla+".");
	}
}