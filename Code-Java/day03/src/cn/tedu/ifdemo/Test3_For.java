package cn.tedu.ifdemo;

//测试for
public class Test3_For {
	public static void main(String[] args) {
		// 0-10
		for(int i =0 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		for(int i = 10 ; i >= 0 ; i--) {
			System.out.println(i);
		}
		for(int i = 8 ; i <= 8888 ; i = i*10+8) {
			System.out.print(i+",");
		}
	}

}
