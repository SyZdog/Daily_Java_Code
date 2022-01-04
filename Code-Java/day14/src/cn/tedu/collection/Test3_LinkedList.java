package cn.tedu.collection;

import java.util.LinkedList;

public class Test3_LinkedList {
	
	public static void main(String[] args) {
		//这个类用来测试LinkedList
		LinkedList<String>  list = new LinkedList();
		      
		//2，常用方法
		list.add("杰克");
		list.add("肉丝");
		list.add("凹凸曼");
		list.add("蜘蛛侠");
		      
		System.out.println(list);
		//TODO 测试从Collection接口和List接口继承过来的共性方法
		      
		//3，LinkedList特有方法
		list.addFirst("美队");//添加首元素
		list.addLast("钢铁侠");//添加尾元素
		System.out.println(list);
		      
		System.out.println(list.getFirst());//获取首元素
		System.out.println(list.getLast());//获取尾元素
		      
		System.out.println(list.removeFirst());//删除首元素
		System.out.println(list.removeLast());//删除尾元素
		      
		      
     }
}
