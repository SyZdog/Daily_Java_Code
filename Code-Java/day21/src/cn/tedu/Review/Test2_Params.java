package cn.tedu.Review;

import java.util.Arrays;

//这个类用来测试可变参数
public class Test2_Params {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = add(1,2);
		System.out.println(sum);
		int sum2 = add(1, 2, 3);
		System.out.println(sum2);
	}
	//可变参数，变的是参数的个数，可以灵活的接收参数
	public static int add(int...a) {
		//可变参数，底层维护的是数组
		//System.out.println(Arrays.toString(a));
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum ;
	}
	/*private static int add(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}

	private static int add(int i, int j) {
		return i+j;
	}
	*/
}
