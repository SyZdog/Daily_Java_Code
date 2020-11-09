package cn.tedu.Seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//用来测试编码转换流，解决中文乱码的问题
public class Test2_Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method();//写出
		method1();//读取
	}
	private static void method1() {
		// TODO Auto-generated method stub
		try {
			//创建InputStreamReader
			InputStreamReader in = new InputStreamReader(new FileInputStream("1.txt"));
			//读取数据
			int b =0;
			while((b = in.read()) != -1) {
				System.out.println(b);
			}
			//释放资源
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//写出
	private static void method() {
		// TODO Auto-generated method stub
		try {
			//创建OutputStreamWriter
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("1.txt"));
			//写出
			out.write("赵得智");
			//释放资源
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
