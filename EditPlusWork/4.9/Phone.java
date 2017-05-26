public class Phone{
	public Card card;
	public Phone(Card card){
		this.card = card;
	}
	public void call(){
		System.out.println("手机号码为"+card.number);
		System.out.println("短信内容："+card.dx);
	}
}