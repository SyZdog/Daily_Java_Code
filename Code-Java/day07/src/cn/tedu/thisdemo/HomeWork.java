package cn.tedu.thisdemo;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle j = new Rectangle();
		j.Space(3, 5);
		j.Perimeter(3, 5);
		Circle c = new Circle();
		c.Space(4, 4);
		c.Perimeter(4, 4);
	}

}
class Shapes{
	
	public void Space(int a , int b) {
		if(a == b) {
			System.out.println("圆的面积为：" + a * Math.PI);
		}else {
		System.out.println("矩形的面积为：" + (a * b));
		}
	}
	public void Perimeter(int a , int b) {
		if(a == b) {
			System.out.println("圆的周长为：" + a * a * Math.PI);
		}else {
		System.out.println("矩形的周长为：" + (2 * a + 2 * b));
		}
	}
}
class Rectangle extends Shapes{
	
}
class Circle extends Shapes{
	
}