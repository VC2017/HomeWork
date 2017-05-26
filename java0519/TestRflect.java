package java0519;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;

import java0519.TestRflect;

public class TestRflect implements Collection {

	public static void main(String[] args) throws Exception {
		//获取包名类名
		TestRflect tr = new TestRflect();
		System.out.println(tr.getClass().getName());
		//实例化Class类对象
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		class1 = Class.forName("java0519.TestRflect");
		class2 = new TestRflect().getClass();
		class3 = TestRflect.class;
		//System.out.println(class1.getName());
		System.out.println(class2.getName());
		System.out.println(class3.getName());
		//获取父类以及实现的接口
		Class<?> classz = Class.forName("java0519.User");
		Class<?> prentclass = classz.getSuperclass();
		System.out.println(prentclass.getName());
		Class<?> ints [] = classz.getInterfaces();
		for(int i = 0;i<ints.length;i++){
			System.out.println((i+1)+"------->"+ints[i].getName());
		}
		//通过反射机制实例化对象
//		Class<?> c1 = TestRflect.class;
//		try {
//			User user = (User) c1.newInstance();
//			user.setName("刘凡");
//			user.setAge(20);
//			System.out.println(user);
//			Constructor<?> cons = c1.getConstructor();
//		} catch (InstantiationException | IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

}
