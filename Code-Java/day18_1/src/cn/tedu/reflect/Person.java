package cn.tedu.reflect;

//这个类用来测试暴力反射
public class Person {

	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private void eat(int i, String j) {
		System.out.println("吃饭饭"+i+j);
	}
	@SuppressWarnings("unused")
	private void sleep() {
		System.out.println("睡觉觉");
	}
}
