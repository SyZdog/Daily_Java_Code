package cn.tedu.inout;
//这个类用来测试匿名内部类
public class Test2_NonamePartClass {

	public static void main(String[] args) {
		// new Inner1()匿名对象+{ }+;,相当于创建了一个接口的实现类，所以需要重写接口中的所有抽象方法
		new Inner1() {

			@Override
			public void get() {
				// TODO Auto-generated method stub
				System.out.println("get()");
			}

			@Override
			public void save() {
				// TODO Auto-generated method stub
				System.out.println("save()");
			}
			
		}.get();//匿名内部类只能触发指定的方法（只能干一件事）
		
		new Inner2() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃的开心");
			}
		}.eat();
		Inner3 in = new Inner3();//匿名对象
		in.game();
		new Inner3().game();
		
	}

}
//普通类
class Inner3{
	public void game() {
		System.out.println("game");
	}
}
//创建抽象类
abstract class Inner2{
	abstract public void eat();
	public Inner2() {}
	public void play() {
		System.out.println("玩的开心");
	}
}
//创建接口
interface Inner1{
	void get();
	void save();
}