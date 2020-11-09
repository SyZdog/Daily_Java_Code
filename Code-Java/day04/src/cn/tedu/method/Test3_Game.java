package cn.tedu.method;

import java.util.Random;
import java.util.Scanner;

//测试while循环	
public class Test3_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//产生随机数,nextInt(n)-产生n以内的随机数，即n<100(不包括n)。
		int random = new Random().nextInt(100)+1;
		System.out.println(random);
		//调用method
		method(random);
		method2(random);
	}
	
	//创建method2
	public static void method2(int r) {
		// TODO Auto-generated method stub
		//for(int i = 1 ; i >= 0 ;i++) {//for的死循环
				do{//死循环 while(true)--设置程序出口
					//接收输入的值
					int input = new Scanner(System.in).nextInt();
					//判断与随机数的关系
					if(input > r) {
						System.out.println("大了");
					}else if(input < r) {
						System.out.println("小了");
					}else if (input == r) {
						System.out.println("中了");
						break;//出口！！！
					}
				}while(true);
	}
	
	
	//创建method
	public static void method(int r) {
		// TODO Auto-generated method stub
		//死循环
		//for(int i = 1 ; i >= 0 ;i++) {//for的死循环
		while(true) {//死循环 while(true)--设置程序出口
			//接收输入的值
			int input = new Scanner(System.in).nextInt();
			//判断与随机数的关系
			if(input > r) {
				System.out.println("大了");
			}else if(input < r) {
				System.out.println("小了");
			}else if (input == r) {
				System.out.println("中了");
				break;//出口！！！
			}
		}
	}

}
