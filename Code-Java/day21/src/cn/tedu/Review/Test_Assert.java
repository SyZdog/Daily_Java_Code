package cn.tedu.Review;

public class Test_Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//开启断言功能
		int m = 10;
		assert m > 0;
		Season autumn = Season.AUTUMN;
		System.out.println(autumn.ordinal());//返回2
	}

}
//枚举
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}