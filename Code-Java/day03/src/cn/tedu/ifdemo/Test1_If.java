package cn.tedu.ifdemo;

import java.util.Scanner;

//		这个类用来测试商品打折案例
public class Test1_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.原价
		double price = new Scanner(System.in).nextDouble();
		//2.计算折后价
		double count = price;//保存折后价
		if(price >= 5000) {
			count = price * 0.5;
		}else if(price >=2000) {
			count = price * 0.8;
		}else if (price >= 1000) {
			count = price * 0.9;
		}
		System.out.println("原价是"+price+"折后价是"+count);
	}

}
