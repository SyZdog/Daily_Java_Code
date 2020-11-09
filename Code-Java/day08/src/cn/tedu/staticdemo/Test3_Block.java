package cn.tedu.staticdemo;

public class Test3_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.eat();
		Person p1 = new Person();
		p1.eat();
	}

}
class Person{
	//	静态饭代码块
	static{
		System.out.println("静态代码块");
	}
	//构造代码块
	{
		System.out.println("构造代码块");
	}
	public void eat() {
		//局部代码块
		{
			System.out.println("局部代码块");
		}
		System.out.println("eat......");
	}
}