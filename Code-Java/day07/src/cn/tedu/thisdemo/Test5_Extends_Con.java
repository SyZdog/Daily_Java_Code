package cn.tedu.thisdemo;

public class Test5_Extends_Con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p = new Person();
		Students students = new Students();
				
	}

}
class Person{
	
	public Person(String n) {
		System.out.println("父类的无参构造"+n);
	}
}
class Students extends Person{
	
	public Students() {
		super("jack");
		System.out.println("子类的无参构造");
	}
}