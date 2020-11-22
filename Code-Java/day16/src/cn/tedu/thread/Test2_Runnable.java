package cn.tedu.thread;
//这个类用来测试多线程，编程方式2：implements Runnable
public class Test2_Runnable {

	public static void main(String[] args) {
		//4，创建线程对象
		MyRunnable target = new MyRunnable();
		//5.问题：怎么把接口的实现类和Thread类绑定
		Thread thread = new Thread(target,"熊大");
		//6，启动线程？
		thread.start();
		//7，--模拟多线程编程，需要创建多个线程对象并启动
		Thread thread2 = new Thread(target,"熊二");//Thread(variable，String);Thread类的含参构造
		thread2.start();
		 
		//8，自己测试start()和run()的区别?run()只是一个普通方法执行的效果也就是单线程顺序执行效果，没有多线程现象
	    //9，自己修改线程名称?--使用Thread类的含参构造
		
		
	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			//Thread.currentThread();获取当前正在执行业务的线程对象 .getName()名称
			System.out.println(Thread.currentThread().getName() + "=" + i);
		}
	}
}