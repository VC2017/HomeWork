import java.util.Scanner;
import java.util.List;
public class Zsgc{
	static int i = 0;//ȫ�� ����ȫ�����ŷ����Ľ�������0 ֻ�ᴢ�����һ��
	static Scanner sc = new Scanner(System.in);
	static Student [] students = new Student[5];
	static String name;
	static int age;
	static char sex;
	public static void main(String [] args){
		caidan();
	}
	public static void caidan(){
		System.out.println("=========================");
		System.out.println(" �������ʾ������������ ");
		System.out.println("-------------------------");
		System.out.println("*   1 ����ѧ����Ϣ   *");
		System.out.println("-------------------------");
		System.out.println("*   2 ɾ��ѧ����Ϣ   *");
		System.out.println("-------------------------");
		System.out.println("*   3 ����ѧ����Ϣ   *");
		System.out.println("-------------------------");
		System.out.println("*   4 ��ѯѧ����Ϣ   *");
		System.out.println("-------------------------");
		System.out.println("*   5 �˳�           *");
		System.out.println("=========================");
		String js = sc.next();
		switch(js){
			case "1":
				addStu();
				break;
			case "2":
				delStu();
				break;
			case "3":
				updStu();
				break;
			case "4":
				selStu();
				break;
			case "5":
				System.exit(0);
			default :
				System.out.println("������������������");
				caidan();
		}
	}
	public static void addStu(){
		boolean ic = true;
		while(ic){
			System.out.println("������ѧ������");
			String name = sc.next();
			System.out.println("������ѧ������");
			int age = sc.nextInt();
			System.out.println("������ѧ���Ա�");
			char sex = sc.next().charAt(0);
			Student s1 = new Student(name,age,sex);
			for(int c=0;c<students.length;c++){
				if(students[c]==null){
					students[i] = s1;
				}
			}
			i++;
			System.out.println("��ӳɹ����Ƿ�������");
			while(ic) {
				System.out.println("1 ������ӣ�2 ������ҳ��");
				int a = sc.nextInt();
				if(a==1){
					ic= true;
				}else if(a==2){
					ic= false;
					caidan();
				}else{
					System.out.println("������������������");
				}
			}
		}
	}
	public static void delStu(){
		boolean ic = true;
		System.out.println("��ѡ��ɾ����ʽ��1 ɾ������ 2 ɾ��ȫ��");
		int v = sc.nextInt();
		if(v==1){
			System.out.println("������Ҫɾ����ѧ������");
			String n = sc.next();
			for(int i=0;i<students.length;i++){
				if(students[i]!= null && students[i].name.equals(n)){
					students[i] = null;
				}
			}

		}else if(v==2){
			for(int i=0;i<students.length;i++){
				if(students[i]!=null){
					students[i] = null;
				}
			}
		}
		while(true){
			System.out.println("ɾ���ɹ����Ƿ񷵻���ҳ�� 1 ���� 2 ����ɾ��");
			int z = sc.nextInt();
			if(z==1){
				ic=false;
				caidan();
			}else if(z==2){
				ic=false;
				delStu();
			}else{
				System.out.println("������������������");
			}
		}
	
	}
	public static void updStu(){
			System.out.println("������Ҫ���µ�ѧ������");
			String n = sc.next();
			for(int i=0;i<students.length;i++){
				if(students[i]!= null && students[i].name.equals(n)){
					System.out.println("��������º�ѧ������");
					students[i].name = sc.next();
					System.out.println("��������º�ѧ������");
					students[i].age = sc.nextInt();
					System.out.println("��������º�ѧ���Ա�");
					students[i].sex = sc.next().charAt(0);
				}
			}
			System.out.println("������ɣ��Ƿ񷵻أ�1 ���� 2 ��������");
			int z = sc.nextInt();
		if(z==1){
			caidan();
		}else if(z==2){
			updStu();
		}
	}
	public static void selStu(){
		System.out.println("��ѡ����ҷ�ʽ��1 ��ȷ���� 2 ����ȫ��");
		int v = sc.nextInt();
		if(v==1){
			System.out.println("������Ҫ��ѯ��ѧ������");
			String mz = sc.next();
			int i=1,c=0;
			for(Student f:students){
				i++;
				if(f!=null&&f.name.equals(mz)){
					f.say();
					c++;
					//break;
				}else if(i>students.length && c==0){
					System.out.println("��Ǹ��û���ҵ�ѧ����Ϣ����鿴�Ƿ���������");
					break;
				}
			}
		}else if(v==2){
			for(Student c:students){
				if(c !=null)
				c.say();
			}
		}
		System.out.println("��ѯ�ɹ����Ƿ񷵻���ҳ�� 1 ���� 2 ������ѯ");
		int z = sc.nextInt();
		if(z==1){
			caidan();
		}else if(z==2){
			selStu();
		}
	}

}