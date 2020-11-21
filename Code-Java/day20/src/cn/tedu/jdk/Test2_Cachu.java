package cn.tedu.jdk;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


//这个类用来测试泛型的擦除，语法糖（只在编译期有效）
public class Test2_Cachu {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/**
		 * 编译
		 */
		List<String> list = new ArrayList<>();
		list.add("jack");
		list.add("rose");
		/**
		 * 运行
		 */
		//1.通过反射获取Class对象
		Class<? extends List> clazz = list.getClass();
		//2.通过调用getMethod()来返回一个方法
		Method method = clazz.getMethod("add", Object.class);
		//3.invoke(list, 123)，list是你要执行的哪一个对象，123是你要添加的数据
		method.invoke(list, 123);
		System.out.println(list);
	}

}
