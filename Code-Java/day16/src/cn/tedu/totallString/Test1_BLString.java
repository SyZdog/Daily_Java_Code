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

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//获取下标
		for (int i = 0; i < input.length(); i++) {
			char key = input.charAt(i);
			Integer value = map.get(key);
			if (value == null) {
				map.put(key, 1);
			}else {
				map.put(key, value + 1);
			}
		}
		System.out.println(map);
	}

}
