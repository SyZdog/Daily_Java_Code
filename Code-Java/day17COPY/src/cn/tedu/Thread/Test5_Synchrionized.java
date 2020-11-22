package cn.tedu.Thread;

//这个类用来测试多线程编程的同步锁
public class Test5_Synchrionized {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketSync target = new TicketSync();
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		Thread t3 = new Thread(target);
		Thread t4 = new Thread(target);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
//改造多线程售票案例
class TicketSync implements Runnable{
	int Ticket = 100;
	Object o = new Object();
	//4、如果方法里的代码通通被 同步了，直接把方法用同步修饰，称之为同步方法，用的锁对象this
	@Override
	//synchronized public void run() {
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			//同步代码块：是指，同一时间资源会被独占没人抢
			//1、多线程中数据安全隐患的前提： 多线程程序 + 有共享数据(成员变量) + 多条语句操作共享数据
			//2、同步锁的位置：太大也不行，程序的效率太低。太小也不行，就相当于给自己加了一把锁，从问题发生的位置开始，截止到结束的位置
			//3、锁对象：多线程间使用的必须是同一把锁对象，同步代码块的锁对象可以是任意对象
			
			//synchronized (new Object()) {//不对，相当于每个线程用了自己的锁，多个线程间并不是用的同一个锁
			//synchronized (o) {
			synchronized (this) {
				if (Ticket > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+ "=" +Ticket--);
					
			}
				if (Ticket <= 0) break;
			}
		}
    }
}

