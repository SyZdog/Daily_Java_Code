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
//		set.clear();
		System.out.println(set.contains(200));//判断是否包含
		System.out.println(set.isEmpty());//判断是否为空
		System.out.println(set.remove(100));//删除元素
		System.out.println(set.size());//获取长度
		
		//迭代集合
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {//判断有没有下一个元素
			Integer next = it.next();//获取遍历到的元素
			System.out.println(next);//打印
			
		}
	}

}
