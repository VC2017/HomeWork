/**
火车
属性：车名 载重 火车种类 长度

动作：行驶状态 停车 开始
*/
public class Train{
	//声明属性
	String name; //火车名
	String zhonglei;//种类
	int longs;//长度
	int load;//载重
	//声明动作
	public void run(){
		System.out.println("本次列车正在行驶中");
	}
	public void stop(){
		System.out.println("本次列车将要到达下个站点请下车的乘客做好准备");
	}
	//构造器
	public /*不能加void*/ Train(String name,String zhonglei,int longs,int load){
		this.name = name;
		this.zhonglei = zhonglei;
		this.longs = longs;
		this.load = load;
	}
	//输出列车基本信息
	public void say(){
		System.out.println("本车名为"+name+"，是一列"+zhonglei+"，总长"+longs+"米，"+"载重"+load+"吨。");
	}
}