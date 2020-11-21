package cn.tedu.inout;

import cn.tedu.inout.Outer.Inner;

//这个类用来测试局部内部类
public class Test2_PartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer1().show();//匿名对象：调用show方法执行调用->局部内部类资源
	}

}
class Outer1{
	public void show() {
		class Inner{
			String name;
			int age;
			public void eat() {
				System.out.println("inner......eat()");
			}
			
		}
		//创建内部类对象，再调用资源
		Inner in =  new Inner();
		in.eat();
		System.out.println(in.name);
		System.out.println(in.age);
	}
	
}