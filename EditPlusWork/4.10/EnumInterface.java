public class EnumInterface{
	public static void main(String args []){
		color.red.show();
	}
}
interface Isay{
	void show();
}
enum color implements Isay{
	red{
		public void show(){
			System.out.println("��ɫ");
		}
	},
	blue{
		public void show(){
			System.out.println("��ɫ");
		}
	},
	green{
		public void show(){
			System.out.println("��ɫ");
		}
	};
}