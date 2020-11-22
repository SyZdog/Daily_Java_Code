package cn.tedu.totallString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1_BLString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//接收用户输入的一串字符串
		@SuppressWarnings("resource")
		String input = new Scanner(System.in).nextLine();
		//创建map

		Map<Character, Integer> map = new HashMap<Character, Integer>();//创建map存数据，格式：{a=1,b=2,c=1}
		//获取下标
		for (int i = 0; i < input.length(); i++) {
//	         --map的key是啥？就是2、获取到的字符
			char key = input.charAt(i);//根据下标获取对应的字符
//		     3、统计出现的每个字符的个数，存起来，存map里
			Integer value = map.get(key);//拿着key去map里找value
			if (value == null) {
				map.put(key, 1);//如果是默认值null就是没存过，存1就行
			}else {
				map.put(key, value + 1);//如果存过值，+1就行
			}
		}
		System.out.println(map);
	}

}
