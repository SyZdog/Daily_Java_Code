package cn.tedu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//这个类用来测试map
public class Test1_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建map对象
		Map<Integer, String> map = new HashMap<Integer, String>();
		//常用方法
		map.put(9527, "唐伯虎");
		map.put(9528, "如花");
		map.put(9529, "秋香姐");
		//特点：1.map是一个无序集合，2.key不可以重复的，如果重复，value会被覆盖
		System.out.println(map);
		map.put(9529, "马冬梅");
		System.out.println(map);
		map.put(9530, "马冬梅");
		System.out.println(map);
		//map.clear();//清空map集合
		System.out.println(map.containsKey(9527));//判断是否包含指定的value
		System.out.println(map.containsValue("马冬梅"));//判断是否包含指定的value
		System.out.println(map.equals("如花"));//判断是否和指定元素相等
		System.out.println(map.get(9527));//获取到的是key对应的value
		System.out.println(map.hashCode());
		System.out.println(map.remove(9530));//删除key对应的value
		System.out.println(map.size());//获取集合长度
		Collection<String> values = map.values();//把map中的所有value值收集起来放入collection中
		System.out.println(values);
		//遍历map集合元素
		//遍历方式1
		Set<Integer> set = map.keySet();//通过keyset()返回一个set集合
		Iterator<Integer> it = set.iterator();//通过iterator()获取一个迭代器
		while (it.hasNext()) {//hasNext()判断是否有下一个key
			Integer key = it.next();//next()获取key
			String value = map.get(key);//map.get(key)获取value
			System.out.println(key+":"+value);
			
		}
		
		//遍历方式2
		Set<Entry<Integer, String>> set2 = map.entrySet();//通过entrySet()将map->set，在set集合中存放的是entry对象
		Iterator<Entry<Integer, String>> it2 = set2.iterator();//通过iterator()获取一个迭代器
		while (it2.hasNext()) {//hasNext()判断是否有下一个entry对象
			Entry<Integer, String> entry = it2.next();//next()获取entry对象
			Integer key = entry.getKey();//通过entry.getKey()获取key
			String value = entry.getValue();//通过entry.getValue获取value
			System.out.println(key+"-"+value);
			
		}
	}

}
