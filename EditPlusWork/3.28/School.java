/**
ѧУ��
����/�ֶ�/��Ա���� ѧУ�� ѧУλ�� ѧУ���� ѧУ���
����/���� �Ͽ� ��ѧ �ż�
*/
public class School{
	//��������
	String name;
	int sum;
	String wz;
	int s;
	//��������
	public void sk (){
		System.out.println("�Ͽ�ʱ�䵽��");
	}
	public void fx(){
		System.out.println("��ѧ��ͬѧ��");
	}
	public void fj(){
		System.out.println("�ż���ͬѧ��");
	}
	//������
	public School(String name,int sum,String wz,int s){
		this.name = name;
		this.sum = sum;
		this.wz = wz;
		this.s = s;
	}
	//���ѧУ������Ϣ
	public void say(){
		System.out.println(name+"��"+"����"+sum+"�ˣ�"+"λ��"+wz+"ռ��"+s+"���ꡣ");
	}
}