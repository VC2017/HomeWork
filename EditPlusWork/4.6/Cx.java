public class Cx{
	public static void main(String args []){
		Person c = new wq();
		c.show();
	}
}
	abstract class Person {
		abstract void eat();
		abstract void zuo();
		abstract void show();
	}
	class wq extends Person{
		public void eat(){
			System.out.println("һ����");
		}
		public void zuo(){
			System.out.println("����");
		}
		public void show(){
			eat();
			zuo();
		}
	}
	class eq extends Person{
		public void eat(){
			System.out.println("����");
		}
		public void zuo(){
			System.out.println("������");
		}
		public void show(){
			eat();
			zuo();
		}
	}