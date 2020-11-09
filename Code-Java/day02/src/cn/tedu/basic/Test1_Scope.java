package cn.tedu.basic;


//测试取值范围
public class Test1_Scope {
	//byte-Byte
	//short-Short
	//int-Integer
	//long-Long
	//float-Float
	//double-Double
	
	public static void main(String[] args) {
		//整形测试：byte short int long
		//定义变量
		byte max = Byte.MAX_VALUE;
		System.out.println(max);//127
		byte min = Byte.MIN_VALUE;
		System.out.println(min);//-128
		short smax = Short.MAX_VALUE;
		System.out.println(smax);//32767
		short smin = Short.MIN_VALUE;
		System.out.println(smin);//-32768
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		System.out.println(imax);//2147483647
		System.out.println(imin);//-2147483648
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		System.out.println(lmax);//9223372036854775807
		System.out.println(lmin);//-9223372036854775808
		
		//浮点
		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		System.out.println(fmax);//3.4028235E38
		System.out.println(fmin);//1.4E-45
		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		System.out.println(dmax);//1.7976931348623157E308
		System.out.println(dmin);//4.9E-324

		//布尔类型
		boolean b = true;
		boolean b2 = false;
		boolean b3 = Boolean.TRUE;
		boolean b4 = Boolean.FALSE;
		
		//字符型character
		char c = 'a';//可以存一个字符
		char c2 = 128 ;//可以存一个数字
		char c3 = '中';//可以存一个汉字
		char c4 = Character.MAX_VALUE;
		char c5 = Character.MIN_VALUE;
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
