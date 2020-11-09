package cn.tedu.thisdemo;

public class Test4_Extends_Bianliang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi = new Zi();
		zi.eat();
	}

}
class Fu{
	int num = 30;
	int count = 40;
}
class Zi extends Fu{
	int num = 20;
	public void eat() {
		int num = 10;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
		System.out.println(count);
	}
}