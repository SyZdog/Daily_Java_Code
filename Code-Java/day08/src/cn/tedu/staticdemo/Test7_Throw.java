package cn.tedu.staticdemo;

import java.util.Scanner;


public class Test7_Throw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method();
	}

	private static void method() throws Exception{
		// TODO Auto-generated method stub
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println(a/b);
	}

}
