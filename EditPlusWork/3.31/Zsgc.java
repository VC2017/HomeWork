import java.util.Scanner;
import java.util.List;
public class Zsgc{
	static int i = 0;//全局 不是全局随着方法的结束而清0 只会储存最后一个
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
		System.out.println(" 请根据提示操作以下内容 ");
		System.out.println("-------------------------");
		System.out.println("*   1 增加学生信息   *");
		System.out.println("-------------------------");
		System.out.println("*   2 删除学生信息   *");
		System.out.println("-------------------------");
		System.out.println("*   3 更新学生信息   *");
		System.out.println("-------------------------");
		System.out.println("*   4 查询学生信息   *");
		System.out.println("-------------------------");
		System.out.println("*   5 退出           *");
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
				System.out.println("输入有误请重新输入");
				caidan();
		}
	}
	public static void addStu(){
		boolean ic = true;
		while(ic){
			System.out.println("请输入学生姓名");
			String name = sc.next();
			System.out.println("请输入学生年龄");
			int age = sc.nextInt();
			System.out.println("请输入学生性别");
			char sex = sc.next().charAt(0);
			Student s1 = new Student(name,age,sex);
			for(int c=0;c<students.length;c++){
				if(students[c]==null){
					students[i] = s1;
				}
			}
			i++;
			System.out.println("添加成功，是否继续添加");
			while(ic) {
				System.out.println("1 继续添加，2 返回主页面");
				int a = sc.nextInt();
				if(a==1){
					ic= true;
				}else if(a==2){
					ic= false;
					caidan();
				}else{
					System.out.println("输入有误请重新输入");
				}
			}
		}
	}
	public static void delStu(){
		boolean ic = true;
		System.out.println("请选择删除方式：1 删除单个 2 删除全部");
		int v = sc.nextInt();
		if(v==1){
			System.out.println("请输入要删除的学生姓名");
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
			System.out.println("删除成功，是否返回主页面 1 返回 2 继续删除");
			int z = sc.nextInt();
			if(z==1){
				ic=false;
				caidan();
			}else if(z==2){
				ic=false;
				delStu();
			}else{
				System.out.println("输入有误请重新输入");
			}
		}
	
	}
	public static void updStu(){
			System.out.println("请输入要更新的学生姓名");
			String n = sc.next();
			for(int i=0;i<students.length;i++){
				if(students[i]!= null && students[i].name.equals(n)){
					System.out.println("请输入更新后学生姓名");
					students[i].name = sc.next();
					System.out.println("请输入更新后学生年龄");
					students[i].age = sc.nextInt();
					System.out.println("请输入更新后学生性别");
					students[i].sex = sc.next().charAt(0);
				}
			}
			System.out.println("更新完成，是否返回，1 返回 2 继续更新");
			int z = sc.nextInt();
		if(z==1){
			caidan();
		}else if(z==2){
			updStu();
		}
	}
	public static void selStu(){
		System.out.println("请选择查找方式：1 精确查找 2 查找全部");
		int v = sc.nextInt();
		if(v==1){
			System.out.println("请输入要查询的学生姓名");
			String mz = sc.next();
			int i=1,c=0;
			for(Student f:students){
				i++;
				if(f!=null&&f.name.equals(mz)){
					f.say();
					c++;
					//break;
				}else if(i>students.length && c==0){
					System.out.println("抱歉，没有找到学生信息，请查看是否输入有误");
					break;
				}
			}
		}else if(v==2){
			for(Student c:students){
				if(c !=null)
				c.say();
			}
		}
		System.out.println("查询成功，是否返回主页面 1 返回 2 继续查询");
		int z = sc.nextInt();
		if(z==1){
			caidan();
		}else if(z==2){
			selStu();
		}
	}

}