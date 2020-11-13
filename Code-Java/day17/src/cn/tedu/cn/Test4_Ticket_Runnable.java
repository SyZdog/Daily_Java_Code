package cn.tedu.cn;


public class Test4_Ticket_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketRunnable t = new TicketRunnable();
		Thread tiThread  = new Thread(t,"窗口1：");
		tiThread.start();
		
		Thread tiThread2  = new Thread(t,"窗口2：");
		tiThread2.start();
		
		Thread tiThread3  = new Thread(t,"窗口3：");
		tiThread3.start();
		
		Thread tiThread4  = new Thread(t,"窗口4：");
		tiThread4.start();
	}

}
class TicketRunnable implements Runnable{

    int ticket = 100;
	Object o = new Object();
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (o) {//同步锁
			if(ticket > 0) {
				try {
					//question_1 重卖，同一张票卖给多个人
					//question_2 超卖，超出的票数，出现0，-1，-2
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ticket--);
			}else if (ticket <= 0) {break;}
		}
	 }		
  }
}