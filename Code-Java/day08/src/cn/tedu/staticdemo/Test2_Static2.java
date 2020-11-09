package cn.tedu.staticdemo;

//这个类测试普通资源与静态资源的调用
public class Test2_Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.teach();
	}

}
class Teacher{
	//普通资源
	//普通资源可以调用静态资源
	String name;
	public void teach() {
		eat();
		System.out.println(age);
		System.out.println("teach......");
	}
	//静态资源
	//静态资源不可以调用普通资源
	static int age;
	public static void eat() {
	//不可以调用	teach();
		System.out.println("eat......");
	}
}