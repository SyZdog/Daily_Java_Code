package cn.tedu.cn;

public class Test3_TicketWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketThread t = new TicketThread("窗口1：");
		t.start();
		
		TicketThread t1 = new TicketThread("窗口2：");
		t1.start();
		
		TicketThread t2 = new TicketThread("窗口3：");
		t2.start();
		
		TicketThread t3 = new TicketThread("窗口4：");
		t3.start();
	}

}
class TicketThread extends Thread{
	
	public TicketThread() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	static int ticket = 100;
	static Object o = new Object();
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (o) {
			if(ticket > 0) {
				try {
					//question_1 重卖，同一张票卖给多个人
					//question_2 超卖，超出的票数，出现0，-1，-2
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName() + ticket--);
			}else if (ticket <= 0) {break;}
		  }
			
		}
		
	}
}