package cn.tedu.jdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;





//这个类用来测试foreach循环
//前提：
//1.可以使用的场景的有：数组，集合（List Set）
//2.Map集合可以用foreach吗？-真的不能用吗？--直接用肯定是不行，间接用。Map可以转成Set就可以用foreach！！
public class Test3_Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//普通迭代方法
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer in = it.next();
			System.out.print(in);
		}
		System.out.println();
		//简化迭代器的语法，提供foreach
		for (Integer in : list) {
			System.out.print(in);
		}
		System.out.println();
		//set的foreach方法
		Set<String> set = new HashSet<>();
		set.add("jack");
		set.add("rose");
		for (String str : set) {
			System.out.print(str);
			System.out.println(" ");
		}
		
		//试试foreach能迭代Map集合吗？--直接是不行，可以间接把Map转成Set
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "jack");
		map.put(2, "rose");
		//Map转成Set？--keySet()  --entrySet()
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.print(key + "_" + value);
			System.out.println();
		}
	
		//遍历数组
		int[] arr = {1,2,3,4,5};
		for (int i : arr) {
			System.out.print(i);
		}
	}

}
