package cn.tedu.inout;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//这个类测试一行一行读取
public class Test4_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一行一行读取
		try {
			//创建BufferedReader对象
			BufferedReader in = new BufferedReader(new FileReader("/Users/zdzsmacbookpro/Desktop/teach/from.txt"));
			String line;
			//readLine(),可以一行一行读取
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				
			}
			//资源释放
			in.close();
			PrintWriter out = new PrintWriter("/Users/zdzsmacbookpro/Desktop/teach/from.txt");
			out.println("abcdefg");
			out.println("hjklmn");
			//资源释放
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
