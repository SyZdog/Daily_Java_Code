package cn.tedu.cn;

public class Test1_Thread {
//测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread("jack");//新建状态
		//t.run();//单纯调用方法
		t.start();//启动线程
		
		MyThread t2 = new MyThread("rose");
		t2.start();
	}

}
class MyThread extends Thread{
	public MyThread() {
		super();
	}
	public MyThread(String name) {
		super(name);
	}
	//重写run()
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();//默认使用Thread类的业务
		//输出10次当前业务的线程的名称
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"="+getName());
		}
	}
}