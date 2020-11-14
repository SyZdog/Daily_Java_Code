package cn.tedu.reflect;

public class Student extends Object {
	//提供构造方法
	public Student() {}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//提供的成员变量
	public String name;
	public int age;
	public void eat(int i) {
		System.out.println("eat()"+ i);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
