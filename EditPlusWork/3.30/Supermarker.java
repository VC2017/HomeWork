/**
����
��Ʒ���� ������ ������ �����
*/
public class Supermarker{
	//��������
	String name;
	int jh;
	int ch;
	//��������
	public void xs(){
		System.out.println("��������");
	}
	public void close(){
		System.out.println("���������");
	}
	//������
	public Supermarker(String name,int jh,int ch){
		this.name = name;
		this.jh = jh;
		this.ch = ch;
	}
	//�����Ʒ������Ϣ
	public void say(){
		System.out.println(name+"��"+"��������"+jh+"��"+"��������"+ch+"��"+"��棺"+(jh-ch)+"��");
	}
}