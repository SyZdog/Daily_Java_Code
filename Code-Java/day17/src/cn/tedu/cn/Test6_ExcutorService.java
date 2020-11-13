package cn.tedu.cn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test6_ExcutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tRunnable t = new tRunnable();
		ExecutorService pool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			pool.execute(t);
		}
	}

}
class tRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int tickets = 1000;
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
		Object o = new Object();
		while (true) {
			//synchronized (o) {
			lock.writeLock().lock();
				if(tickets > 0 ) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						lock.writeLock().unlock();//防止死锁
					}
					System.out.println(Thread.currentThread().getName()+"="+tickets--);
				}else if(tickets <= 0) {break;}
			}
			
		//}
	}

}