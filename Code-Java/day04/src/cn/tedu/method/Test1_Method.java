package cn.tedu.method;

//测试方法重载
public class Test1_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(10,5);
		method(10);
		method("jack",10);
	}
	public static void method(String name,int age ) {
		System.out.println(name+" "+age);
	}
	public static void method(int m) {
		System.out.println(m*m);
	}
	//创建方法
	public static void method(int a , int b) {
		System.out.println(a+b);
		
	}
}
