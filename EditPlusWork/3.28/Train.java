/**
��
���ԣ����� ���� ������ ����

��������ʻ״̬ ͣ�� ��ʼ
*/
public class Train{
	//��������
	String name; //����
	String zhonglei;//����
	int longs;//����
	int load;//����
	//��������
	public void run(){
		System.out.println("�����г�������ʻ��");
	}
	public void stop(){
		System.out.println("�����г���Ҫ�����¸�վ�����³��ĳ˿�����׼��");
	}
	//������
	public /*���ܼ�void*/ Train(String name,String zhonglei,int longs,int load){
		this.name = name;
		this.zhonglei = zhonglei;
		this.longs = longs;
		this.load = load;
	}
	//����г�������Ϣ
	public void say(){
		System.out.println("������Ϊ"+name+"����һ��"+zhonglei+"���ܳ�"+longs+"�ף�"+"����"+load+"�֡�");
	}
}