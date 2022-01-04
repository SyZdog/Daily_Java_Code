package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Test2_List {
//测试List集合中的方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		//测试继承自Collection接口的方法
//		list.clear();//清空集合
		list.add("jack");
		list.add("rose");
		System.out.println(list.contains("jack"));
		System.out.println(  list.equals("jack") );
		System.out.println(  list.hashCode() );
		System.out.println(  list.isEmpty() );
		System.out.println(  list.remove("hanmeimei") );
		System.out.println(  list.size() );
		System.out.println(  list.toArray() );//变成数组
		
		//测试List接口的特有方法
		list.add(1,"马冬梅");//在指定的索引中添加元素
		System.out.println(list);
		System.out.println(list.get(1));//获取指定下标的元素
		System.out.println(list.indexOf("jack"));//获取指定元素第一次出现的下标
		System.out.println(list.lastIndexOf("jack"));//获取指定元素最后出现的下标
		list.remove(1);//按照下标删除指定元素
		System.out.println(list);
		list.set(1, "tony");//置换元素
		System.out.println(list);
		List<String> subList = list.subList(0, 1);//截取List（含头不含尾）
		System.out.println(subList);
		
		//集合间的操作
		List<String> list2 = new ArrayList<String>();
		list.add("111");
		list.add("222");
		System.out.println(list2.addAll(list));//把list集合添加到list2集合
		System.out.println(list2.addAll(1,list));//在指定的位置添加集合
		System.out.println(list.containsAll(list));//判断List2集合中是否包含list集合
		list2.removeAll(list);//删除list
		System.out.println(list2.retainAll(list));//删除List2集合
		
		//iterator() listIterator() for() for_each
		//方法1:通过list下标，所以可以根据下标遍历数据//i < list.size()下标最大值是集合长度-1
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);//list.get(i)下标获取元素
			System.out.println(s);
		}
		//方法2:foreach提高，好处：语法简洁、效率高。坏处：不能按照下标获取元素
		//	for(1:2:3){}--3是要遍历的数据   1是遍历得到的数据的类型   2是变量名
		for (String str : list) {
			System.out.println(str);
		}
		//方式3：iterator() 是继承自父接口Collection的
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
				
		}
		//方式4：listIterator() 是List接口的特有方法
		//Iterator<E> iterator()  --父接口 --hasNext()  --next() --remove()
	    //ListIterator<E> listIterator() --子接口，拥有父接口的方法，也有自己的特有方法(逆向迭代)
	    //public interface ListIterator<E>  extends Iterator<E>
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			String s = it2.next();
			System.out.println(s);
		}
	}
	  //总结：方式3和方式4有什么区别？-- 3是父接口Iterator，4是子接口ListIterator
    //子接口拥有父接口的所有方法也有自己的特有方法，子接口的特有方法就是向前/逆向遍历
}
