/**
超市
商品名称 进货量 出货量 库存量
*/
public class Supermarker{
	//声明属性
	String name;
	int jh;
	int ch;
	//声明动作
	public void xs(){
		System.out.println("正在销售");
	}
	public void close(){
		System.out.println("晚六点关门");
	}
	//构造器
	public Supermarker(String name,int jh,int ch){
		this.name = name;
		this.jh = jh;
		this.ch = ch;
	}
	//输出商品基本信息
	public void say(){
		System.out.println(name+"："+"进货量："+jh+"，"+"出货量："+ch+"，"+"库存："+(jh-ch)+"。");
	}
}