/**
�ֻ���
����/�ֶ� ��Ա�������ֻ�Ʒ�� ��ɫ ��Ļ�ߴ� ��Ǯ 
����/��Ա���������� ������ ����Ϸ �ػ�
*/
public class Cellphone{
	//��������
	String name;//�ֻ�Ʒ��
	String color;//��ɫ
	double size;//��Ļ�ߴ�
	double price;//��Ǯ
	//��������
	public void open(){
		System.out.println("���ڿ���...");
	}
	public void music(){
		System.out.println("hello �ṷ");
	}
	public void games(){
		System.out.println("�Ӵ˿̿�ʼ��ս������һ�����ס�");
	}
	public void close(){
		System.out.println("���ڹػ�...");
	}
	//������
	public Cellphone(String name,String color,double size,double price){
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	//����ֻ�������Ϣ
	public void say(){
		System.out.println(name+"��"+color+"��"+size+"Ӣ�磬v"+price+"Ԫ");
	}
}