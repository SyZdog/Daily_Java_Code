package cn.tedu.method;

import java.util.Arrays;
import java.util.Random;

//测试数组练习
public class Test5_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		method();//输出每个月的天数
//		method2();//遍历数组存入1-10
		method3();//创建随机数组
	}
	//创建method3
		public static void method3() {
			// TODO Auto-generated method stub
			//创建数组-动态
			int a[] = new int[10];
			
			//遍历数组，给元素赋值
			for(int i = 0 ; i < a.length ; i++) {
				a[i] = new Random().nextInt(100);
			}
			//打印数组中的元素
			System.out.println(a);
			System.out.println(Arrays.toString(a));//Arrays是数组的工具类，toString(m)--m是把数组打印成字符串
		}	
//创建method2
	public static void method2() {
		// TODO Auto-generated method stub
		//创建数组-动态
		int a[] = new int[10];
		
		//遍历数组，给元素赋值
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = i+1;
		}
		//打印数组中的元素
		System.out.println(a);
		System.out.println(Arrays.toString(a));//Arrays是数组的工具类，toString(m)--m是把数组打印成字符串
	}
//创建method
	public static void method() {
		// TODO Auto-generated method stub
		//创建数组
		int a[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		//输出每月天数
		//遍历/循环,按照元素下标遍历
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println((i+1)+"月有"+a[i]+"天");
		}
	}
}
