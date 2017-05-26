package java0424;

public class Demo {

	public static void main(String[] args) {
		// 泛型的擦除和转换
		Num<Integer> n = new Num<>(5);
		Integer i = n.getT();
		Num n2 = n;//会丢掉泛型

	}

}
class Num<T extends Number>{
	private T t;
	public Num(T t){
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}