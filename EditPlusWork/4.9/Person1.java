import java.util.*;
public class Person1{
	public Phone phone;
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ���");
		String number = sc.next();
		System.out.println("�������������");
		String dx = sc.next();
		Card card = new Card(number,dx);
		Phone phone = new Phone(card);
		Person1 person = new Person1(phone);
		person.use();
	}
	public Person1(Phone phone){
		this.phone = phone;
	}
	public void use(){
		phone.call();
	}
}