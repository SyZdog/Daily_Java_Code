package cn.tedu.basic;

public class Test5_Yunsuanfu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		System.out.println(a++);//符号在后，先使用在变化
		int b = 1;
		System.out.println(++b);//符号在前，先变化在使用
		System.out.println(++a+a+b++);
		
		int c = 1;
		System.out.println(c--);
		int d = 1;
		System.out.println(--d);
		System.out.println(--c-c-c--);
	}

}
