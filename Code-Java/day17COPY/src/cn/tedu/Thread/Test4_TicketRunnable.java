package cn.tedu.Thread;
//这个类用来测试多线程售票
//需求:设计4个售票窗口，总计售票100张
public class Test4_TicketRunnable {

	public static void main(String[] args) {
		//3、创建对象
		TicketRunnable target = new TicketRunnable();
		Thread t1 = new Thread(target, "窗口1");
		Thread t2 = new Thread(target, "窗口2");
		Thread t3 = new Thread(target, "窗口3");
		Thread t4 = new Thread(target, "窗口4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
class TicketRunnable implements Runnable{
	int tickets = 100; //创建变量，记录票的总数
	static int Ticket = 100;
	@Override
	public void run() {
		if (Ticket > 0) {
			//假设当前tickets=1
			// TODO Auto-generated method stub
			while (true) {//一直卖票
				try {
					//先让程序休眠10ms
	                //问题1：超卖，0  -1 
	                //问题2：重卖，70号票卖给了两个人
					Thread.sleep(10);//线程访问的延迟性
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Thread.currentThread().getName()获取当前正在执行任务的线程名
				System.out.println(Thread.currentThread().getName() + "=" + Ticket--);
				if(Ticket <= 0)break;
		}
				
		}
	}
	
}