package cn.tedu.staticdemo;

public class Test1_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类
		System.out.println(che.name);
		che.run();
		//对象
		che c = new che();
		System.out.println(c.name);
		che.run();
		che c1 = new che();
		System.out.println(c1.name);
	}

}
class che{
	
	static String name = "Rose";
	public static void run() {
		System.out.println("跑的飞起来");
	}
}