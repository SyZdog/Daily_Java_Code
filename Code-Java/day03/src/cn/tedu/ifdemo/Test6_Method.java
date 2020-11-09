package cn.tedu.ifdemo;

//测试方法的调用
public class Test6_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method();//调用指定的method();
		//method2(10);//方法的参数
		//method3("jack",20);//多个参数，逗号隔开
		int result = method4(5,10);//方法的返回值
		System.out.println(result);//15
	}
	//创建method4()
	public static int method4(int a,int b) {
		return a+b;
		//通过return返回
	}
	//创建method()
	public static void method() {
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}
	//创建method3()
	public static void method3(String n , int a) {
		System.out.println(n);
		System.out.println(a);
	}
	//创建method2()
	//public static void method2(参数类型 参数名) {
	public static void method2(int num) {
		System.out.println(num*num);
	}
	

}
