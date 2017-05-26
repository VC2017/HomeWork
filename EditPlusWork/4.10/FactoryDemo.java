interface ICellPhone{
	void sendMsg();
}
/*HTC�ֻ�*/
class HTC implements ICellPhone{
	public void sendMsg(){
		System.out.println("HTC");
	}
}
/*IPhone�ֻ�*/
class IPhone implements ICellPhone{
	public void sendMsg(){
		System.out.println("Phone");
	}
}
/*�ֻ�����*/
class Factory{
	public static ICellPhone getInstance(String type){
		ICellPhone phone = null;
		if ("htc".equals(type)){
			phone = new HTC();
		}else if ("phone".equals(type)){
			phone = new IPhone();
		}
		return phone;
	}
}
public class FactoryDemo{
	public static void main(String [] args){
		//ICellPhone p = new HTC();
		ICellPhone p = Factory.getInstance("htc");
	}
}