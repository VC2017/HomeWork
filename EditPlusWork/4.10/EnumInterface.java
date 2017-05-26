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
			System.out.println("ºìÉ«");
		}
	},
	blue{
		public void show(){
			System.out.println("À¶É«");
		}
	},
	green{
		public void show(){
			System.out.println("ÂÌÉ«");
		}
	};
}