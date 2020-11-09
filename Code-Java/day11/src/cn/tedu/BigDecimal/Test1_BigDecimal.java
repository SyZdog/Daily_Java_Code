package cn.tedu.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1_BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

	private static void method() {
		// TODO Auto-generated method stub
		//1.输入数据
		Double a = new Scanner(System.in).nextDouble();
		Double b = new Scanner(System.in).nextDouble();
		//2.创建工具类
		BigDecimal bd1 = new BigDecimal(a+"");
		BigDecimal bd2 = new BigDecimal(b+"");
		//3.运算
		BigDecimal bd3;
		
		bd3 = bd1.add(bd2);
		System.out.println(bd3);
		
		bd3 = bd1.subtract(bd2);
		System.out.println(bd3);
		
		bd3 = bd1.multiply(bd2);
		System.out.println(bd3);
		
		bd3 = bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd3);
	}

}
