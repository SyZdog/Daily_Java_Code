package cn.tedu.bubble;

import java.util.Arrays;

//用来测试冒泡排序
public class Test1_Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建无序数组
		int[] a = {99,20,75,23,21};
		//调用method排序
		//int[] newA =  method(a); 
		//System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
 	}

	public static int[] method(int[] a) {
		// TODO Auto-generated method stub
		//1.外循环：控制比较轮数，n个数，比较n-1次
		for(int i = 0 ; i < a.length-1 ; i++) {
			
			//2.内循环：相邻比较交换位置
			for(int j = 0 ; j < a.length-1 ; j--) {	
				if(a[j] > a[j+1]){//相邻比较
					//交换数据
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
				
			}
			
		}
		return a;//把排序后的数组返回
	}
	
}
