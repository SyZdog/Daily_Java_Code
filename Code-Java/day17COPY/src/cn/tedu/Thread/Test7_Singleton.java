package cn.tedu.Thread;
//这个类用来测试单例设计模式   ---  饿汉式
public class Test7_Singleton {
	public static void main(String[] args) {
		MySingle m = MySingle.getSingle();
		MySingle m2 = MySingle.getSingle();
		//==如果比较的是两个引用类型的变量？比较的是地址值
		System.out.println(m == m2);
	}
}
//创建自己的单例程序
class MySingle {
	//1，私有化构造方法，不让外界随意new
	private MySingle() {}
	
	//2，在类的内部，提供一个已经创建好的对象
	//static是因为  静态资源getSingle()只能调用静态
	static private MySingle single = new MySingle();
	
	//3，对外提供一个全局访问点
	//static 是因为，想要访问get()可以创建对象访问，但是目前已经不允许创建对象了。只能通过类名调用，就得修饰。
	static public MySingle getSingle(){
		//把内部创建好的对象返回调用位置
		return single;
	}
}