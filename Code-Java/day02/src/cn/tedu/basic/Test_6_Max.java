package cn.tedu.basic;

import java.util.Scanner;

public class Test_6_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		//s三元运算符
	

		//三个数的最大值
		int c = new Scanner(System.in).nextInt();
		int max = (a > b ? a : b) > c ? (a > b ? a : b): c;
		
		System.out.println(max);
		
	}

}
