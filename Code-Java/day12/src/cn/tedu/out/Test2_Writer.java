package cn.tedu.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

	private static void method() {
		//1.创建字符输出流对象
		Writer out = null;
		try {
			// TODO Auto-generated method stub
			out = new BufferedWriter(new FileWriter("/Users/zdzsmacbookpro/Desktop/teach/Hello.txt",true));
			//2.开始写出数据
			out.write("HelloJavaWorld你好世界");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3.释放资源，为了保证资源一定会被释放
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
