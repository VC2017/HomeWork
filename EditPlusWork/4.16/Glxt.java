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
		System.out.println("*----��ӭ�������й���ϵͳ----*");
		System.out.println("*-----�������ʾ���в���-----*");
		System.out.println("*-------1 �����Ʒ��Ϣ-------*");
		System.out.println("*-------2 ɾ����Ʒ��Ϣ-------*");
		System.out.println("*-------3 �޸���Ʒ��Ϣ-------*");
		System.out.println("*-------4 ��ѯ��Ʒ��Ϣ-------*");
		System.out.println("*-----------5 �˳�-----------*");
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
				System.out.println("������������������");
			gl();
		}
	}
	public static void addsp(){
		System.out.println("��������Ʒ��");
		String name = sc.next();
		System.out.println("�����������");
		int jh = sc.nextInt();
		System.out.println("�����������");
		int ch = sc.nextInt();
		Supermarker sp1 = new Supermarker(name,jh,ch);
		sp[i]=sp1;
		i++;
		System.out.println("�����ɣ��Ƿ������ӣ�");
		boolean flag = true;
		while(flag=true){
			System.out.println("1 ������� 2 ������ҳ��");
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
		System.out.println("��ѡ��ɾ����ʽ");
		System.out.println("1 ָ��ɾ�� 2 ɾ��ȫ�� 3 �������˵�");
		String z = sc.next();
		if(z.equals("1")){
			System.out.println("������Ҫɾ������Ʒ����");
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
		System.out.println("ɾ����ɣ��Ƿ����ɾ����");
		boolean flag = true;
		while(flag){
			System.out.println("1 ����ɾ�� 2 �������˵�");
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
		System.out.println("������Ҫ���µ�������");
		String z = sc.next();
		for(int i = 0;i<sp.length;i++){
			if(sp[i] != null && sp[i].name.equals(z)){
				System.out.println("��������º���Ʒ����");
				sp[i].name = sc.next();
				System.out.println("��������º������");
				sp[i].jh = sc.nextInt();
				System.out.println("��������º������");
				sp[i].ch = sc.nextInt();
			}
		}
		System.out.println("������ɣ��Ƿ�������£�");
		boolean flag=true;
		while(true){
			System.out.println("1 �������� 2 �������˵�");
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
		System.out.println("��ѡ���ѯ��ʽ");
		System.out.println("1 ��ȷ��ѯ 2 ȫ����ѯ 3 �������˵�");
		String z = sc.next();
		if(z.equals("1")){
			System.out.println("�������ѯ��Ʒ����");
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
		System.out.println("��ѯ��ɣ��Ƿ������ѯ��");
		boolean flag = true;
		while(flag){
			System.out.println("1 ������ѯ 2 �������˵�");
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