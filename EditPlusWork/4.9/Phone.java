public class Phone{
	public Card card;
	public Phone(Card card){
		this.card = card;
	}
	public void call(){
		System.out.println("�ֻ�����Ϊ"+card.number);
		System.out.println("�������ݣ�"+card.dx);
	}
}