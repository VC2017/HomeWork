/**
��ʦ��
���ԣ����� �Ա� ���� ���ڿ�Ŀ
���������� �¿� ��Ϣ
*/
public class Teacher{
	//�������� �ֶ�
	String name;//����
	int age;//����
	char sex;//�Ա�
	String cla;//���ڿ�Ŀ
	//�������� ����
	public void sk(){
		System.out.println("�����ϿΣ��벻Ҫ����");
	}
	public void xk(){
		System.out.println("���˿�ͬѧ��");
	}
	public void xx(){
		System.out.println("����ʦ��Ϣһ�°ɣ�zzz");
	}
	//������
	public Teacher(String name,int age,char sex,String cla){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.cla = cla;
	}
	//�����ʦ������Ϣ
	public void say(){
		System.out.println(name+","+age+"��,"+sex+"��"+"����"+cla+".");
	}
}