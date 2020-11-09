package cn.tedu.out;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//这个类用来测试字节输出流
public class Test1_OutputStream {

	private static FileOutputStream os;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();//测试输出字节流
	}

	private static void method() {
		OutputStream os = null;
		try {
			// 1.创建输出流对象
			//在效率上：BufferedOutputStream>FileOutputStream
			//原因：BufferedOutputStream底层维护一个byte[],可以减少和磁盘的交互次数，默认容量8K。
		    os = new BufferedOutputStream(new FileOutputStream("/Users/zdzsmacbookpro/Desktop/teach/11.txt"));
			// 2.开始写出
			os.write(97);
			os.write(48);
			os.write(49);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				os.close();//资源释放
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}

}
