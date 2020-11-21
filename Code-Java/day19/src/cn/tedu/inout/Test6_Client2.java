package cn.tedu.inout;

//这个类用来做回声案例的客户端
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test6_Client2 {
	//1.连接指定的服务器
	//2.一直给服务器发送数据
	//3.一直接收服务器回声数据	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.连接指定的服务器
		try {
			Socket socket = new Socket("127.0.0.1",8000);
		//2.一直给服务器发送数据
			while (true) {
				//向服务器写出一行数据，并且读取服务器回声回来的一行数据
				PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				//3.一直发送一直读取
				String input = new Scanner(System.in).nextLine();
				out.println(input);//向服务器发送了指定数据
				out.flush();//把数据刷出去
				
				String line = in.readLine();//读取回声数据
				System.out.println("服务器的回声数据是："+ line);
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
