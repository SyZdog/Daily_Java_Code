package cn.tedu.Seri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


//这个类用来测试序列化
public class Test1_Seria {

	public static void main(String[] args) {
		//method();//序列化
		method2();//反序列化
	}

	private static void method2() {
		// TODO Auto-generated method stub
		// 创建ObjectInputStream完成反序列化
		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("/Users/zdzsmacbookpro/Desktop/teach/to.txt"));
			//指定要读取的对象
			Object o = in.readObject();
			System.out.println(o);//默认打印地址值cn.tedu.Seri.Student@5f150435，需要重写toString方法
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method() {
		// TODO Auto-generated method stub
		// 创建ObjectOutputStream
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("/Users/zdzsmacbookpro/Desktop/teach/to.txt"));
		//指定要输出的对象
			Student obj = new Student("jack",20,"北京");
			out.writeObject(obj);
			System.out.println("序列化完成！");
			//释放资源
			out.close();
		} catch (IOException e) {
			System.out.println("序列化失败！");
			e.printStackTrace();
		}
}		

}
