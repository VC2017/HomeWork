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
	//存货
	public synchronized void push(int number){
		if(getSize()+number<=Maxsize){
			setSize(getSize()+number);
			System.out.println("生产了"+number+"个，"+"当前库存"+getSize());
		}else{
			System.out.println("库存已满，暂停生产");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//让想获取该对象锁的线程处于等待状态
		}
		notifyAll();//通知消费者消费
	}
	//取货
	public synchronized void pop(int number){
		if(getSize()-number<0){
			System.out.println("库存不足，等待生产者生产");
			try {
				this.wait();//线程的阻塞
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("消费成功"+number+"个，当前库存"+getSize()+"个");
		}
		notifyAll();//通知消费者消费 线程的唤醒
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
