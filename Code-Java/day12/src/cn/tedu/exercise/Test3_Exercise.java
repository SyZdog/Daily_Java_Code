package cn.tedu.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

//这个类用来练习文件复制
public class Test3_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//源文件
		System.out.println("请输入源文件的路径");
		String f = new Scanner(System.in).nextLine();
		File from = new File(f);
		
		//目标文件
		System.out.println("请输入目标文件的路径");
		String t = new Scanner(System.in).nextLine();
		File to = new File(t);
		copy(from,to);//完成文件的复制
		
	}

	private static void copy(File from, File to) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		try {
			//1.读取from文件
			in = new BufferedInputStream(new FileInputStream(from));
			
			//2.写入to文件
			out = new BufferedOutputStream(new FileOutputStream(to));
			
			//3.边读边写
			int b = 0;
			//read()目前是一个字节一个字节的读，效率低
			//想要实现批量读取,使用read(char[] cs),	提高效率
			//char[] cs = new char[8*1024];
			byte[] cs = new byte[8*1024];
			while((b = in.read(cs)) != -1) {//用b接收读取到的值，没有数据就返回-1
				out.write(cs);//写出到文件中
			}
			System.out.println("文件复制成功！！！");
		} catch (IOException e) {
			System.out.println("文件复制失败！！！");
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
