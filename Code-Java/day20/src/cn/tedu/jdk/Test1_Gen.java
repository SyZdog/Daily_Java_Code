package cn.tedu.jdk;

import java.util.ArrayList;
import java.util.List;

//这个类用来测试泛型上限
public class Test1_Gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		print(list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("jack");
		list2.add("rose");
		//print(list2);类型不匹配就会发生错误
		
	}
	//数字类型Number中有：byte short,int,long,float,double。
	public static void print(List<? extends Number>list) {
		for (Number number : list) {
			System.out.println(number);
		}
	}

}
