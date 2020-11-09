package cn.tedu.basic;

import java.util.Scanner;

public class Test4_Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int t = a;
		a = b;
		b = t;
		System.out.println(a);
		System.out.println(b);
		long y = 9999999999999999L;
	}

}
