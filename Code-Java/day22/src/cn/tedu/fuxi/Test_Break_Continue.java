package cn.tedu.fuxi;

import java.util.Scanner;

public class Test_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			int input = new Scanner(System.in).nextInt();
			if (input != 88) {
				System.out.println("没猜对，请重新输入");
				continue;//继续输入
				
			}else{
				System.out.println("猜对了！");
				break;
			}
			
		}
	}

}
