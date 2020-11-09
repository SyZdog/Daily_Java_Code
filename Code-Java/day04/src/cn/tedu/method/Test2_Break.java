package cn.tedu.method;

import java.util.Scanner;

//测试break 和 continue
public class Test2_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用method
		method();
	}

	public static void method() {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 100 ; i++) {
		int input = new Scanner(System.in).nextInt();
		if(input != 88) {
			continue;
		}
		else if(input == 88) {
			System.out.println("恭喜您，猜对了！");
			break;
		}
	}
  }
}
