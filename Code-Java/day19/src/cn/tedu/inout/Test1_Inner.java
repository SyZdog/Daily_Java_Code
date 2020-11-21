package cn.tedu.inout;

//这个类用来测试内部类
public class Test1_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外部类名.内部类名 变量名 = 外部类对象.内部类对象
		//Outer.Inner oi = new Outer().new Inner();
		//oi.get();
		//System.out.println(oi.count);
		new Outer().save();//创建外部类匿名对象，调用外部类方法(也间接调用了内部类的资源）
		Outer.Inner oi2 = new Outer.Inner();//静态内部类建立的对象形式
		oi2.get();
		new Outer.Inner().get();//匿名对象调用静态内部类方法
		Outer.Inner.get();//非静态外部类调用静态内部类的方法
		
		
	}
}
class Outer{//外部类（将动态内部类改为静态）
	String name;
	private int age;
	public void save() {
		//System.out.println("Outer....save()");
		Inner in = new Inner();//创建内部类对象
		System.out.println(in.count);//调用属性
		in.get();//调用方法
	}
    static class Inner{//内部类（成员内部类）
		int count = 10;
		public static void get() {
			System.out.println("Inner.....get()");
			//内部类可以直接访问外部类的成员，包括私有成员
			//System.out.println(name);
			//System.out.println(age);
			//save();
		}
		
		}
	}

