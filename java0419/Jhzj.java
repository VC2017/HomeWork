package java0419;

import java.util.*;

public class Jhzj {

	public static void main(String[] args) {
		/*//Collection Set接口
		Collection zj = new HashSet();
		Collection zj1 = new HashSet();
		zj.add("a");//增加
		zj.add("b");
		zj.add("c");
		zj.add("d");
		zj.remove("a");//删除
		zj.iterator();//遍历集合里的元素
		zj.clear();//清空zj集合
		zj.removeAll(zj1);//从集合中删除集合zj1里包含的所有元素
		zj.size();//返回集合里元素个数
		zj.toArray();//将集合转化为数组
		//Iterator接口遍历集合
		Iterator it = zj.iterator();
		while(it.hasNext()){
			//String s = (String)it.next();
			System.out.println(it.next());
		}
		/*特性
		 * Set判断两个对象是否相等⽤用equals,⽽而不不是使用==。
		 * Set⽆无法记住添加的顺序，不不允许包含重复的元素。*/
		//hashCode继承Set类方法
		
		//TreeSet
		
		/*TreeSet ts = new TreeSet();
		ts.add("a");
		ts.add("f");
		ts.add("s");
		ts.add("b");
		ts.add("v");
		ts.remove("");
		ts.first();//返回第一个元素
		Iterator is = ts.iterator();
		while(is.hasNext()){
			System.out.println(is.next());
		}*/
		/*特性
		 * 1 继承了Set不可重复
		 * 2 自动排序
		 * 			自然排序		实现comparable接口 覆写comparableTo方法
		 * 			定制排序		实现comparator将自己写的Comparator传入主函数 
		 * */
		
		/*List接口
		 * add(6,"a")//将a插入到索引为6处
		 * get(int index) //返回集合在index处元素
		 * remove(index)//删除并返回index索引处的元素
		 * set(6,"c")//将索引为6的元素替换为c
		 * 迭代listIterator 继承了Iterator接口
		 * hasPervios()//向上迭代
		 * 特性
		 * 定长
		 * 有序集合 
		 * 可以重复元素 
		 * 可以通过索引访问
		 * */
		/*ArrayList：线程不安全，增删速度快。 
		 *LinkedList：链表结构，查询速度快
		 * **/
		/*
		 * Map
		 * HashMap hm = new HashMap();
		hm.put("z1", 1);
		hm.put("z2", 1);
		hm.put("z3", 2);
		System.out.println(hm);//输出集合
		System.out.println(hm.get("z1"));//查看指定key值得value值
		System.out.println(hm.containsKey("c"));//查看是否含有该key
		System.out.println(hm.containsValue(2));//查看是否含有该value
		System.out.println(hm.size());//查看集合中有多少元素
		HashMap hm2 = new HashMap();
		hm2.putAll(hm);//将集合hm复制到集合hm2中
		System.out.println(hm2);//输出集合
		hm2.remove("z3");//指定删除
		System.out.println(hm2);//输出集合
		hm2.clear();//清空集合
		System.out.println(hm2);//输出集合
		System.out.println(hm2.isEmpty());//查询集合是否为空 是返回true 否返回false
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry mt = (Map.Entry) it.next();
			System.out.print(mt.getKey()+"\t"+mt.getValue() );
			//System.out.println(mt.getValue() );
		}
		hm.replace("z1", 6666);
		System.out.println(hm.entrySet());
		 */
		/*
		 * 面试题
		 * 1 try中存在return，finally还会输出吗
		 * 				会 无影响
		 * 2 ArryList与LinkedList的区别
		 * 				ArrayList：线程不安全，查询速度快 
		 * 				LinkedList：链表结构，增删速度快。
		 * 3 Hashtable与HashMap的区别
		 * 				Hashtable 线程不安全 允许有null的键和值 效率高一点
		 * 				hashMap 线程安全 不允许有null的键和值 效率稍低
		 * */
   	}

}
