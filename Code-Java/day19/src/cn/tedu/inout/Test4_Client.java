package cn.tedu.inout;
//这个类用来测试客户端
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test4_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//启动客户端
		Socket client = new Socket("127.0.0.1",8000);
		OutputStream out= client.getOutputStream();
		out.write("hello".getBytes());
		
		InputStream in = client.getInputStream();
		for (int i = 0; i < 5; i++) {
			char in2 = (char)in.read();
			System.out.print(in2);
			
		}
		client.close();
		out.close();
	}

}
