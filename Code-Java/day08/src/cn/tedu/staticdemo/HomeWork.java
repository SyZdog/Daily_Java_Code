package cn.tedu.staticdemo;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car day1 = new BMW();
		day1.kind("第一天开的车是宝马");
		car day2 = new Benz();
		day2.kind("第二天开的车是奔驰");
		car day3 = new Audi();
		day3.kind("第三天开的车是奥迪");
	}

}
class car{
	public void kind(String logo) {
		System.out.println (logo);
	}
}
class BMW extends car{
	
}
class Benz extends car{
	
}
class Audi extends car{
	
}