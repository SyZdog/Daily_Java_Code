package cn.tedu.thread;
//这个类用来测试多线程售票
public class Test3_TicketThread {

	public static void main(String[] args) {
	    //4、创建线程对象
		TicketThread t = new TicketThread();
		TicketThread t2 = new TicketThread();
		TicketThread t3 = new TicketThread();
		TicketThread t4 = new TicketThread();
		//问题1：我们想让程序只卖100张票，但是目前卖了400张，为什么？
		t.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
//1，多线程编程：extends Thread
class TicketThread extends Thread{
	static int tickets = 100;//可以被多个对象共享，只会加载一次
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
		//！！！如果数据能够接受sleep的考验，才能说明数据没有了安全隐患
			try {
				//问题2：产生了重卖：同一张票卖给了多个人
				//问题3：产生了超卖：超出了票数，甚至卖出了0和-1和-2
				Thread.sleep(10);//让程序休眠10ms
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "=" +tickets--);
			if (tickets <= 0) break;//死循环的出口！！
			
		}
		
	}
}