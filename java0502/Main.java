package java0502;

public class Main {

	public static void main(String[] args) {
		Mythread mt1 = new Mythread(1);
		//Mythread mt2 = new Mythread(2);
		//Mythread mt3 = new Mythread(3);
		new Thread(mt1).start();
		//new Thread(mt2).start();
		//new Thread(mt3).start();
	}

}
