package cn.tedu.oop;

//抽象，用于多态
public class Test1_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a = new Dog1();
		a.eat();
		//Animal a2 =new Animal();抽象类不能被实例化
		//Animal a1 = new Cat();
		System.out.println(a.num);
		System.out.println(a.name);
	}

}
abstract class Animal1{ ///抽象类
	
	int num = 10;
	final String name = "jack";
	abstract public void eat();//抽象方法
	public void sleep() {
		
	}
	public Animal1() {
		System.out.println("Animal1的构造方法");
	}
}
class Dog1 extends Animal1{
	public void eat() {
		System.out.println("eat");
	}
}
abstract class Cat extends Animal1{

}