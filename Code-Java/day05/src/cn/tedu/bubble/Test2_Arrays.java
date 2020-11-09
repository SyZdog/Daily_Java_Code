package cn.tedu.bubble;

import java.util.Arrays;

//测试工具类Arrays
public class Test2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//copyOf()--由于数组一旦创建长度不变，所以复制完产生的是新数组
		int[] from = {1,2,3,4,5};
		int[] to = Arrays.copyOf(from,10);
		//copyOf(m,n)n大于原数组长度，开辟新的空间，即扩容
		//[1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(to));
		//n小于原数组长度，缩容。 
		int[] to2 = Arrays.copyOf(from,3);
		//[1, 2, 3]
		System.out.println(Arrays.toString(to2));
	}

}
