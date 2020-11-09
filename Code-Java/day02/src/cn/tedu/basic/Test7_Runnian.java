package cn.tedu.basic;

import java.util.Scanner;

public class Test7_Runnian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.年号
		int year = new Scanner(System.in).nextInt();
		String desc = "平年";
		//判断
		/*if(year % 4 == 0 ) {
			if(year % 100 != 0) {
				desc  ="闰年";
			}
		}
		if(year % 400 == 0) {
			desc  ="闰年";
		}*/
		//ToDo优化
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			desc = "闰年";
		}
		System.out.println(year+"年是"+desc);
	}

}
