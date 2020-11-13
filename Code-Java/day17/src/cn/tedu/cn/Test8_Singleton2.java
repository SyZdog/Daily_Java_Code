package cn.tedu.cn;

public class Test8_Singleton2 {
//面试重点：
	//1.延迟加载：是指不会第一时间创建对象，什么时候需要什么时候创建
	//2.线程安全问题：是指共享资源有多线程共享资源会出现数据安全隐患
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton m = singleton.getSingle();
		System.out.println(m.toString());
	}

}
class config{
	public static final int PARAM_A = 123;
	public static final int PARAM_B = 456;
}
class singleton {
	//在类的内部提供一个已经创建好的对象该对象为null,不占用内存
	private static singleton instance = null;
	private final int paramA;
	private final int paramB;
	//调用外部类传参
	private singleton(){ 
		this.paramA = config.PARAM_A;
		this.paramB = config.PARAM_B;
	}
	
	public static synchronized singleton getSingle() {
		if (instance == null) {
			instance = new singleton();
					
		}
		return instance;
	}

	@Override
	public String toString() {
		return "MySingle [paramA=" + paramA + ", paramB=" + paramB + "]";
	}
	
}