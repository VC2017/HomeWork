/**
王者荣耀类
属性/字段 英雄 铭文 技能 模式
动作 攻击 移动
*/
public class Wangzhe{
	//声明属性
	String name;
	String mname;
	String jname;
	String moshi;
	//声明动作
	public void pa(){
		System.out.println("暴击 1288");
	}
	public void mod(){
		System.out.println("当前移速 1024");
	}
	//构造器
	public Wangzhe(String name,String mname,String jname,String moshi){
		this.name = name;
		this.mname = mname;
		this.jname = jname;
		this.moshi = moshi;
	}
	//输出王者荣耀基本信息
	public void say(){
		System.out.println("英雄："+name+"，最适合铭文"+mname+"，核心技能"+jname+"，适合模式"+moshi+"。");
	}
}