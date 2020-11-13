package cn.tedu.cn;

public class Test5_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		
	}

	private static void method() {
		// TODO Auto-generated method stub
		String str = "abc";
		StringBuffer sB = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			sB.append(str);
		}
		System.out.println(sB);
	}

}
