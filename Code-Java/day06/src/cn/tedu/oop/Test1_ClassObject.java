package cn.tedu.oop;

public class Test1_ClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.call();
		p.message();
		p.music();
		System.out.println(p.color);
		System.out.println(p.size);
		System.out.println(p.model);
		System.out.println(p.price);
		
		Phone p1 = new Phone();
		p1.color = "深蓝色";
		p1.size = "6.1";
		p1.model ="iPhone12 Pro";
		p1.price = 9599;
		System.out.println(p.color);
		System.out.println(p.size);
		System.out.println(p.model);
		System.out.println(p.price);
		p1.call();
		p1.message();
		p1.music();
	}

}
class Phone{
		String color;
		String size;
		String model;
		double price;
		//
		public void call() {
			System.out.println("正在打电话");
		}
		public void message() {
			System.out.println("正在发短信");
		}	
		public void music() {
			System.out.println("正在听音乐");
	}
}