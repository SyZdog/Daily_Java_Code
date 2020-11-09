package cn.tedu.API;

public class Test3_StringBuffer {
	public static void main(String[] args) {
		method2();//完成加号拼接字符串
		
	}
	
	private static void method2() {
		// TODO Auto-generated method stub
		String str = "abcdefghijklmnopqrstuvwxyz";
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		Long s = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++) {
			sb.append(str);
		}
		Long s1 = System.currentTimeMillis();
		System.out.println(s1-s);
	}

	private static void method() {
		// TODO Auto-generated method stub
		String str = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		Long s = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++) {
			result = result + str;
		}
		Long s1 = System.currentTimeMillis();
		System.out.println(s1-s);
	}
}
