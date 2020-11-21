package cn.tedu.inout;
//这个类用来测试服务端
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3_Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
		//启动服务器
		ServerSocket sever = new ServerSocket(8000);
		Socket socket = sever.accept();
		Socket out = socket;
		InputStream in = out.getInputStream();
		for (int i = 0; i < 5; i++) {
			char  a = (char)in.read();
			System.out.print(a);
		}
		OutputStream out2 = out.getOutputStream();
		out2.write("world".getBytes());
		out2.flush();
		
		sever.close();
		in.close();
		
	}

}
