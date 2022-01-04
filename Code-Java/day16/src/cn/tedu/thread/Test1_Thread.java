package cn.tedu.thread;

//这个类用来测试多线程，编程方式1：extends Thread
public class Test1_Thread {

	public static void main(String[] args) {
		//4，创建Thread对象
		MyThread t = new MyThread("线程1");
		//5，启动线程调用start()，JVM会自动调用run()的业务 ---使线程从新建转成 可运行状态，等待CPU调度
		t.start();
		//---6，模拟多线程，需要启动最少2个线程叫多线程程序，如果只启动一个线程，叫单线程程序。
		MyThread t2 = new MyThread("线程2");
		t2.start();//---使线程从新建转成 可运行状态，等待CPU调度
		//t.run();
		//7，run()和start()区别是什么？run()在执行时只是当做一个普通方法在执行，并没有多线程效果
		 //8，线程的随机性：CPU会自动调度可运行状态的线程们，但是哪个时间片执行哪个线程我们无法控制
//	     0=Thread-0
//	     0=Thread-1
//	     1=Thread-0
//	     1=Thread-1
//	     2=Thread-0
	}

}
//1、自定义多线程类，方式1：extends Thread
class MyThread extends Thread{
	//Thread含参构造方法，更改线程名称
	private String name;
	public MyThread(String n) {
		super(n);
		this.name = n;
	}
	//2、重写了Thread里的run()alt+/，把业务放入run()
	
	@Override
	public void run() {
		//super.run();//默认使用Thread类里的业务
		//3、写业务？ 输出10次当前的线程名称
		for (int i = 0; i < 10; i++) {
		//getName();可以获取正在执行任务的线程名称
			System.out.println(i + "=" +getName());
		}
	}
}