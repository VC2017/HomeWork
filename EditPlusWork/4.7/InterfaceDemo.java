public class InterfaceDemo{
	public static void main(String args []){
		zhuBan c = new jianPan();
		c.use();
	}
}
	interface zhuBan{
		void use();
	}
	class flash implements zhuBan{
		public void use(){
			System.out.println("ЪѓБъ");
		}
	}
	class jianPan implements zhuBan{
		public void use(){
			System.out.println("МќХЬ");
		}
	}