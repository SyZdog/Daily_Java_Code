package cn.tedu.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


//这个类用来测试回声案例服务器端
//1.启动服务器
//2.接收客户端请求
//3.给每个客户端分配话务员
//4.话务员：主要负责和客户端沟通
public class Test7_HW_Server {

	public void server() {
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket s = new ServerSocket(8000);
					System.out.println("服务器启动成功！");
					while (true) {
						Socket socket = s.accept();
						System.out.println("客户端连接成功");
						
						HuwuYThread h = new HuwuYThread(socket);
						h.start();		
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
	}
	class HuwuYThread extends Thread{
	    Socket socket;
		public HuwuYThread(Socket s) {
			this.socket = s;
		}
		@Override
		public void run() {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				//先收
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println("客户端发来的数据是：" + line );
					System.out.println("请输入您想要给客户端回声的数据：");
				//再发
					String input =new Scanner(System.in).nextLine();
					writer.println(input);
					writer.flush();
					System.out.println("回声的数据发送成功！");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7_HW_Server ser = new Test7_HW_Server();
		ser.server();
	}

}
