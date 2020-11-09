package cn.tedu.staticdemo;

public class Test5_Oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BM bm = new BM();
		bm.run();
		//		父类引用子类
		cars c = new BM();
		c.run();
		c.stop();
	}

}
class cars{
	public void run() {
		System.out.println("run");
	}
	public void stop() {
		System.out.println("stop");
	}
}
class BM extends cars{
	public void run() {
		System.out.println("BM......run");
	}
}