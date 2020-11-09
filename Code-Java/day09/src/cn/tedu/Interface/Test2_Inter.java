package cn.tedu.Interface;

public class Test2_Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter1 inter = new Inter1Impl();
		inter.eat();
		inter.game();
		System.out.println(inter.age);
	}
}