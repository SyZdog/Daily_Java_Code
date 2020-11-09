package cn.tedu.oop;

public class Test2_Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person("jack");
		Person p3 = new Person("Rose",18);
		System.out.println(p3.name);
	}

}
//1.构造方法没有返回类型，2.构造方法的方法名和类名是是完全一致的
class Person{
	public  Person(){
		System.out.println("构造方法");
	}
	public Person(String n) {
		System.out.println("构造方法"+n);
	}
	public Person(String n,int i) {
		name = n;
		age = i;
		System.out.println(n+":"+i);
	}
	String name;
	int age;
	public void eat() {
		System.out.println("吃胖胖");
	}
}