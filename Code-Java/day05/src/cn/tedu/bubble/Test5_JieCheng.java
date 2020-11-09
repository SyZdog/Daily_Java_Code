package cn.tedu.bubble;
//测试5的阶乘
public class Test5_JieCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = method(5);
		System.out.println(res);
	}

	public static int method(int i) {
		// TODO Auto-generated method stub
		if(i == 1) {
			return 1;
		}else {
			return i * method(i-1);
		}
	}

}
