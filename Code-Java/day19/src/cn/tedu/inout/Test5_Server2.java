package cn.tedu.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//这个类用来作为回声案例服务器端
public class Test5_Server2 {
	//1.启动服务器
	//2.接收客户端的连接请求
	//3.给每个客户端分配对应的话务员
	//4.话务员：主要负责和客户端沟通I/O
	// 在服务器端，使用多线程开发，让每个客户端之间不用等待，可以并发访问，提高服务器的执行效率，提高吞吐量
	
	public void service() {
		//在服务器端，使用线程开发，让每个客户端之间不用等待，可以并发访问，提过服务器效率的执行效率，提高吞吐量
		new Thread() {//匿名对象+匿名内部类（重写run方法)
			//把业务写入run()中
			@Override
			public void run() {
				try {
					//1.启动服务器,在8000端口处等待客户连接
					ServerSocket server = new ServerSocket(8000);
					System.out.println("服务器启动成功...");
					//2.一直接收客户端的连接请求
					while (true) {
						Socket socket = server.accept();
						System.out.println("客户端连接成功...");
					//3.给每个客户端分配对应的话务员1V1
						HuaWuThread t = new HuaWuThread(socket);
						t.start();
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();//启动线程
	}
	
	//4.话务员：主要负责和客户端沟通I/O
	class HuaWuThread extends Thread{
		Socket socket;
		public HuaWuThread(Socket socket) {
			this.socket = socket;
		}
		
		//把业务放入run(),一直读取客户端发来的数据，并作出回声数据
		@Override
		public void run() {
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
					
				
				//读取一行BufferedReader,并且写出一行PrintWriter
				String line;
				while ((line = in.readLine()) != null) {
					System.out.println("客户端发来的数据是：" + line);
					out.println(line); //给客户端做回声数据
					out.flush();//把数据刷出去
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5_Server2 s = new Test5_Server2();
		s.service();
	}

}
