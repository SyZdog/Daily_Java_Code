package cn.tedu.thisdemo;

public class Test3_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.eat();
		Bird b = new Bird();
	//	b.eat();
	}

}
class Animal{
	public void eat(){
		System.out.println("父类的eat()");
		
	}
}
class Cat extends Animal{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("小猫吃猫粮");
	}
	
}
class Bird extends Animal{
	
}