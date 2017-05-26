package com.test;

public class Storage {
	private final static int Maxsize = 100;
	private int size;
	public Storage(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	//���
	public synchronized void push(int number){
		if(getSize()+number<=Maxsize){
			setSize(getSize()+number);
			System.out.println("������"+number+"����"+"��ǰ���"+getSize());
		}else{
			System.out.println("�����������ͣ����");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�����ȡ�ö��������̴߳��ڵȴ�״̬
		}
		notifyAll();//֪ͨ����������
	}
	//ȡ��
	public synchronized void pop(int number){
		if(getSize()-number<0){
			System.out.println("��治�㣬�ȴ�����������");
			try {
				this.wait();//�̵߳�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("���ѳɹ�"+number+"������ǰ���"+getSize()+"��");
		}
		notifyAll();//֪ͨ���������� �̵߳Ļ���
	}
}
/*//Set set = hm.entry();
 * Iterator it = hm.entry().iterator;
 * while(it.hasNext()){
 *	Map.Entry me = (Map.Entry).next();
 *	System.out.println(me.getKey()+"---->"me.getValue());
 * }
 * 
 * 
 * */
