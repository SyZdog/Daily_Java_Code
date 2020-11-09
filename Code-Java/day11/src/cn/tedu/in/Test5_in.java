package cn.tedu.in;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test5_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

	private static void method() {
		// TODO Auto-generated method stub
		//创建字节流对象
		try {
			InputStream in = new BufferedInputStream(new FileInputStream("/Users/zdzsmacbookpro/Desktop/teach/1.rtf"));
			int b;
			long s = System.currentTimeMillis();
			while((b = in.read()) != -1) {
				System.out.println(b);
			}
			long s1 = System.currentTimeMillis();
			System.out.println(s1-s);
			in.close();//释放资源
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
