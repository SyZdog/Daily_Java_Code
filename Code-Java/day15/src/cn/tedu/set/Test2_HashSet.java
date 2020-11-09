package cn.tedu.set;

import java.util.HashSet;
import java.util.Iterator;

public class Test2_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建hashset对象
		HashSet<Integer> set = new HashSet<Integer>();//默认初始容量是16加载因子0.75
		//常用方法
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);//set集合可以去重
		System.out.println(set.remove(200));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		//迭代集合
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
			
		}
	}

}
