package cn.tedu.thisdemo;

public class Test1_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		
	}

}
class Student {
	//
	{
		System.out.println("构造代码块");
	}
	public Student() {
		//this("jack");
		System.out.println("无参构造");
	}
	public Student(String n) {
		this();
		System.out.println("含参构造"+n);
	}
	int num =20;
	int a =30;
	public void eat() {
		{
			System.out.println("局部代码块");
		}
		int num = 10 ;
		System.out.println(num);
		System.out.println(this.a);
	}
	
}