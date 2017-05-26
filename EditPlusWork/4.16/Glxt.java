import java.util.Scanner;
public class Glxt{
	static Scanner sc = new Scanner(System.in);
	static Supermarker [] sp = new Supermarker[100];
	static int i = 0;
	public static void main(String args []){
		gl();
	}
	public static void gl(){
		System.out.println("==============================");
		System.out.println("*----欢迎进出超市管理系统----*");
		System.out.println("*-----请根据提示进行操作-----*");
		System.out.println("*-------1 添加商品信息-------*");
		System.out.println("*-------2 删除商品信息-------*");
		System.out.println("*-------3 修改商品信息-------*");
		System.out.println("*-------4 查询商品信息-------*");
		System.out.println("*-----------5 退出-----------*");
		System.out.println("==============================");
		String i = sc.next();
		switch(i){
			case "1":
				addsp();
			break;
			case "2":
				delsp();
			break;
			case "3":
				updsp();
			break;
			case "4":
				selsp();
			break;
			case "5":
				System.exit(0);
			break;
			default:
				System.out.println("输入有误，请重新输入");
			gl();
		}
	}
	public static void addsp(){
		System.out.println("请输入商品名");
		String name = sc.next();
		System.out.println("请输入进货量");
		int jh = sc.nextInt();
		System.out.println("请输入出货量");
		int ch = sc.nextInt();
		Supermarker sp1 = new Supermarker(name,jh,ch);
		sp[i]=sp1;
		i++;
		System.out.println("添加完成，是否继续添加？");
		boolean flag = true;
		while(flag=true){
			System.out.println("1 继续添加 2 返回主页面");
			String z = sc.next();
			if(z.equals("1") && sp[i] == null){
				flag = false;
				addsp();
			}else if(z.equals("2")){
				flag = false;
				gl();
			}else{
				flag = true;
			}
		}
	}
	public static void delsp(){
		System.out.println("请选择删除方式");
		System.out.println("1 指定删除 2 删除全部 3 返回主菜单");
		String z = sc.next();
		if(z.equals("1")){
			System.out.println("请输入要删除的商品名称");
			String h = sc.next();
			for(int i = 0;i<sp.length;i++){
				if(sp[i] != null && sp[i].name.equals(h)){
					sp[i] = null;
				}
			}
		}else if (z.equals("2")){
			for(int i = 0;i<sp.length;i++){
				if(sp[i] != null){
					sp[i] = null;
				}
			}
		}else if (z.equals("3")){
			gl();
		}else{
			delsp();
		}
		System.out.println("删除完成，是否继续删除？");
		boolean flag = true;
		while(flag){
			System.out.println("1 继续删除 2 返回主菜单");
			String v = sc.next();
			if(v.equals("1")){
				flag = false;
				delsp();
			}else if(v.equals("2")){
				flag = false;
				gl();
			}else{
				flag = true;
			}
		}
	}
	public static void updsp(){
		System.out.println("请输入要更新的数据名");
		String z = sc.next();
		for(int i = 0;i<sp.length;i++){
			if(sp[i] != null && sp[i].name.equals(z)){
				System.out.println("请输入跟新后商品名称");
				sp[i].name = sc.next();
				System.out.println("请输入更新后进货量");
				sp[i].jh = sc.nextInt();
				System.out.println("请输入更新后出货量");
				sp[i].ch = sc.nextInt();
			}
		}
		System.out.println("更新完成，是否继续更新？");
		boolean flag=true;
		while(true){
			System.out.println("1 继续更新 2 返回主菜单");
			String c = sc.next();
			if(c.equals("1")){
				flag = false;
				updsp();
			}else if(c.equals("2")){
				flag = false;
				gl();
			}else{
				flag = true;
			}
		}
	}
	public static void selsp(){
		System.out.println("请选择查询方式");
		System.out.println("1 精确查询 2 全部查询 3 返回主菜单");
		String z = sc.next();
		if(z.equals("1")){
			System.out.println("请输入查询商品名称");
			String vc = sc.next();
			for(Supermarker c : sp){
				if(c != null && c.name.equals(vc)){
					c.say();
				}
			}
		}else if(z.equals("2")){
			for(Supermarker s : sp){
				if(s!=null){
					s.say();
				}
			}
		}else if(z.equals("3")){
			gl();
		} else{
			selsp();
		}
		System.out.println("查询完成，是否继续查询？");
		boolean flag = true;
		while(flag){
			System.out.println("1 继续查询 2 返回主菜单");
			String v = sc.next();
			if(v.equals("1")){
				flag = false;
				selsp();
			}else if(v.equals("2")){
				flag = false;
				gl();
			}else{
				flag = true;
			}
		}
	}
}