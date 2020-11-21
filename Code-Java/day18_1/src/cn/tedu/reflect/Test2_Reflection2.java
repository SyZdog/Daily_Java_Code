package cn.tedu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

//这个类用来测试暴力反射

public class Test2_Reflection2 {
	@Test
	public void getField() throws Exception  {
		//1.获取Class对象
		Class<?> clazz = Class.forName("cn.tedu.reflect.Person");
		//2.获取私有属性
		Field field = clazz.getDeclaredField("name");
		//3.获取属性的数据类型
		System.out.println(field.getType().getName());
		//4.设置属性的值
		Object obj = clazz.getConstructor().newInstance();
		//暴力手段设置--true表示私有成员可见
		field.setAccessible(true);
		//set(a,b)--a是你要给哪个对象设置值，b是要设置的具体值
		field.set(obj, "rose");
		System.out.println(field.get(obj));
	}
	
	//通过暴力反射获取私有方法
	@Test
	public void getMethod() throws Exception {
		//1.获取Class对象
		Class<?> clazz = Person.class;
		//2.通过暴力反射获取私有方法
		Method method = clazz.getDeclaredMethod("eat", int.class, String.class);
		//3.通过反射创建对象
		Object obj = clazz.getConstructor().newInstance();
		//4.设置私有可见
		method.setAccessible(true);
		//5.通过暴力反射执行私有方法
		method.invoke(obj, 29,"马冬梅");
		
	}
}
