package cn.tedu.in;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Tesr6_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

	private static void method() {
		// TODO Auto-generated method stub
		//创建字符流对象
		try {
			Reader reader = new BufferedReader(new FileReader("/Users/zdzsmacbookpro/Desktop/teach/1.rtf"));
			int r;
			long s = System.currentTimeMillis();
			while((r = reader.read()) != -1) {
				System.out.println(r);
			}
			long s1 = System.currentTimeMillis();
			System.out.println(s1 - s);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
