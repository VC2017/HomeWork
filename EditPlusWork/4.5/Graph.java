public class Graph{
	abstract public class Gv{
		abstract double getZhouchang();
		abstract double mianji();
	}
}
class Sjx extends Graph{
	public double a = 6;
	public double b = 5.3;
	public double c = 3;
	public double Zhouchang(){
		return a+b+c;
	}
	public double mianji(){
		return a*b/2;
	}
}
class Yx{
	double pi = 3.14;
	public double r = 6;
	public double Zhouchang(){
		return 2*pi*r;
	}
	public double mianji(){
		return pi*r*r;
	}
}