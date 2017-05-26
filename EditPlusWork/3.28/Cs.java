import java.util.Scanner;
import java.util.Arrays;
public class Cs{
	public static void main(String args []){
		/**Scanner sc = new Scanner(System.in);
		System.out.print("请输入十个数，回车键结束");
		int [] a = new int [10];
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);//升序排序
		for(int i=0;i<a.length;i++){ //a.length 数组的长度
			System.out.print(a[i]+",");
		}
-------------------------------------------------------------------------------------------------------
		int [] a = {1,5,6,3,2,0,5};
		Arrays.sort(a);
		int [] b = {1,5,6,3,0,2,5};
		Arrays.sort(b);
		System.out.println(Arrays.equals(a,b)); //数组值的比较 a[1]和b[1] 相比 以此类推 顺序是关键
		System.out.println(a==b); //比较的是地址 不是数组中的值
-------------------------------------------------------------------------------------------------------
		int [] a = {2,5,8,7};
		Arrays.sort(a);//在排序的条件之下
		System.out.print(Arrays.binarySearch(a,7)); //二分查询 a数组中的7 如数组中没有该值会以负数显示
-------------------------------------------------------------------------------------------------------
		int [] a ={5,6,9,8,5};
		int [] b = Arrays.copyOf(a,a.length);//复制数组a的值到数组b中
		for(int i=0;i<b.length;i++){ //a.length 数组的长度
			System.out.print(b[i]+",");
		}
-------------------------------------------------------------------------------------------------------
		int [] a = {1,5,6,8,9};
		Arrays.fill(a,56);
		for(int i=0;i<a.length;i++){ //a.length 数组的长度
			System.out.print(a[i]+",");//将指定的 int 值分配给指定 int 型数组的每个元素
		}
-------------------------------------------------------------------------------------------------------*/
		String a="fls csf";
		String b="FLSSCF";
		System.out.println(a.charAt(5));//取字符串中指定位置的字符 从0开始计算

		System.out.println(a.equals(b));//比较两个字符串 相同返回true 不相同返回false

		System.out.println(a.indexOf("s"));//找出字符第一次出现的位置 从零开始

		System.out.println(a.lastIndexOf("s"));//找出字符最后一次出现的位置

		System.out.println(a.length());//返回字符串长度
		
		String [] c=a.split(" ");
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);//从字符中分隔开
		}

		System.out.println(b.toLowerCase());//转化为小写
		System.out.println(a.toUpperCase());//转化为大写
/*-------------------------------------------------------------------------------------------------------*/

	}
}