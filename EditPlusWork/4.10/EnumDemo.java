enum color{
	red,bule,green;
	public String toString(){
		String ret = super.toString();
		switch (this){
			case red:
				ret = "红色";
			break;
			case bule:
				ret = "蓝色";
			break;
			case green:
				ret = "绿色";
			break;
			default :
				ret = "没有";
		}
		return ret;
	}
}
public class EnumDemo{
	public static void main(String [] args){
		color [] cs = color.values();
		for(color c:cs){
			System.out.print(c+"\t");
		}
		System.out.println(); 
	}
}
