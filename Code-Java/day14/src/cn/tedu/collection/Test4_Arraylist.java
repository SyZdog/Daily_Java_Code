package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;


public class Test4_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	创建对象
		ArrayList<Integer>  list = new ArrayList<Integer>();
		//	常用方法
		list.add(100);//添加元素
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(300);
		list.add(1, 99);//指定下标处添加元素
		System.out.println(list);
		//list.clear();清空集合
		System.out.println(list.contains(500));//判断是否包含
		System.out.println(list.get(1));//根据下标获取元素
		System.out.println(list.indexOf(300));//获取指定元素第一次出现的下标
		System.out.println(list.lastIndexOf(300));//获取指定元素最后一次出现的下标
		System.out.println(list.set(1, 700));//置换元素
		System.out.println(list.size());//获取集合长度
		System.out.println(list.remove(Integer.valueOf(300)));//直接删除指定元素
		System.out.println(list.remove(1));//删除下标为1的元素
		System.out.println(list);
		Object[] arr = list.toArray();//集合转数组
		System.out.println(Arrays.toString(arr));
		//迭代
		//1.for
		for (int i = 0; i < list.size(); i++) {
			Integer in = list.get(i);
			System.out.println(in);
		}
		//2.for each
		for (Integer it : list) {
			System.out.println(it);
		}
		//3.迭代器
		Iterator<Integer> ite = list.iterator();
		while (ite.hasNext()) {
			Integer in = ite.next();
			System.out.println(in);
		}
		//4.list iterator
		ListIterator<Integer> listIterator =list.listIterator();
		while (listIterator.hasNext()) {
			Integer integer = listIterator.next();
			System.out.println(integer);
		}
	}

}
