package cn.tedu.method;

//测试数组存hello	
public class Test4_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建静态数组
		int[] c = new int[] {0, 1, 2, 3, 4, 5, 6};
		char[] c2 = {'h','e','l','l','o'};
		//创建动态数组
		char[] c3 = new char[5];
		//给数组第一个元素赋值
		c3[0] = 'h';
		c3[1] = 'e';
		c3[2] = 'l';
		c3[3] = 'l';
		c3[4] = 'o';
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c.length);
	}
}
