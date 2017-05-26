interface ICellPhone{
	void sendMsg();
}
/*HTC返字*/
class HTC implements ICellPhone{
	public void sendMsg(){
		System.out.println("HTC");
	}
}
/*IPhone返字*/
class IPhone implements ICellPhone{
	public void sendMsg(){
		System.out.println("Phone");
	}
}
/*返字垢皆*/
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