package cn.tedu.cn;
//饿汉
public class Test7_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MySingle m = new MySingle();
		
		MySingle m = MySingle.getSingle(10,20);
	
		System.out.println(m);//重写toString方法
	}

}
//优化单例设计模式

 class MySingle{
	//在类的内部提供一个已经创建好的对象该对象为null
	 private static MySingle instance = null;
	 private final int paramA;
	 private final int paramB;
	 
	//创建私有构造方法不让外界new
	private MySingle(int paramA, int paramB){ 
		this.paramA = paramA;
		this.paramB = paramB;
	}
	//在类的内部提供一个已经创建好的对象
	//private static MySingle single = new MySingle();
	//对外提供全局访问点
     public synchronized static MySingle getSingle(int paramA,int paramB) {
    	if(instance == null) {
    		instance = new MySingle(paramA, paramB);
    		
    	}
		return instance;
		
	}
	@Override
	public String toString() {
		return "MySingle [paramA=" + paramA + ", paramB=" + paramB + "]";
	}
}