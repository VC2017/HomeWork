package java0424;

import java.io.*;

/*管道流
 *又称为线程通讯流，主要作⽤用是可以进行两个线程之间的通讯：
 * PipedOutputStream：管道输出流 
 * PipedInputStream：管道输入流 
 * PipedOutputStream中有方法: 
 * 		void connect(PipedInputStream pis) throws IOException:用于连接管道
 * PipedInputStream中有方法: 
 * 		void connect(PipedOutputStream pos) throws IOException:用于连接管道
 * */
//发送端
class Send implements Runnable{
	private PipedOutputStream pos = null;
	public Send(){
	pos = new PipedOutputStream();
	}
	public PipedOutputStream getPos(){
		return pos;
	}
	public void run(){
		String s = "asdfasfa";
		try {
			pos.write(s.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//接收端
class Recelve implements Runnable{
	private PipedInputStream pis = null;
	public Recelve(){
		pis = new PipedInputStream();
	}
	public PipedInputStream getPis(){
		return pis;
	}
	public void run(){
		byte [] bys = new byte[1024];
		try {
			int len = pis.read(bys);
			pis.close();
			System.out.println("-->" + new String(bys,0,len));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class PipedDemo {
	public static void main(String[] args) {
		Send send = new Send();
		Recelve rec = new Recelve();
		try {
			send.getPos().connect(rec.getPis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(send).start();
		new Thread(rec).start();
	}

}
