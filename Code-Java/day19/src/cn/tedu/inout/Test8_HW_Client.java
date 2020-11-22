package cn.tedu.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


//这个类用来测试客户端
public class Test8_HW_Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("127.0.0.1",8000);
			while (true) {
				PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//先发
				System.out.println("请输入要发给服务器的数据：");
				String input = new Scanner(System.in).nextLine();
				out.println(input);
				out.flush();
				//再收
				String line;
				line = in.readLine();
				System.out.println("接收的回声数据是：" + line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
