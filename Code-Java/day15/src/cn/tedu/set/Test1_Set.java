package cn.tedu.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Test1_Set {
//测试set接口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建set对象
		Set<String> set = new HashSet<String>();
		//特点1：set集合中的元素都是无序的 
		//特点2：set集合中的元素是不能重复的 
		//特点3：set集合中允许存放null元素 
		
		//常用方法
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);//元素乱序
		set.add("ccc");
		System.out.println(set);//元素不能重复
		set.add(null);
		System.out.println(set);//可以存放null
		//set.clear();//清空集合
		System.out.println(set.contains("ccc"));//判断是否存在指定元素
		System.out.println(set.remove(null));//删除指定元素
		System.out.println(set.equals("ccc"));//判断set是否和ccc相等
		System.out.println(set.hashCode());//获取哈希值
		System.out.println(set.isEmpty());//判断集合是否为空
		System.out.println(set.size());//获取集合大小
		Object[] array = set.toArray();//集合放进数组里
		System.out.println(Arrays.toString(array));
		
		//集合间操作
		Set<String> set2 = new HashSet<String>();
		set2.add("111");
		set2.add("222");
		set2.add("333");
		set2.addAll(set);//添加集合
		System.out.println(set2);
		System.out.println(set2.containsAll(set));//判断set2里是否包含set
		System.out.println(set2.removeAll(set));//移除set集合
		System.out.println(set2.retainAll(set2));//移除set2
		System.out.println(set2);
		
		//	集合的迭代
		Iterator<String> it = set.iterator();//获取一个迭代器
		while (it.hasNext()) {//hasNext()判断有没有下一个元素
			String next = it.next();//next()获取元素
			System.out.println(next);//打印
			
		}
	}

}
