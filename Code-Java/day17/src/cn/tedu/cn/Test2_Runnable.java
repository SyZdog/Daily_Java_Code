package cn.tedu.cn;
//实现多线程方式2，Runnable
public class Test2_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程对象
		MyRunnable target  = new MyRunnable();
		Thread thread = new Thread(target,"熊大");
		thread.start();
		
		Thread thread2 = new Thread(target,"熊二");
		thread2.start();
		
		
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Thread.currentThread()获取当前执行业务的线程对象
		//getName()获取名称
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}
	
}