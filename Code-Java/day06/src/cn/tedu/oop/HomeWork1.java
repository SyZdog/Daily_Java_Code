package cn.tedu.oop;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dog1 = new Dog1();
		dog1.setType("金毛");
		System.out.print(dog1.getType());
		dog1.setAge(5);
		System.out.print(" ");
		System.out.print(" "+dog1.getAge());
		System.out.print(" ");
		dog1.jiao();
		dog1.run();
		System.out.println();
		Dog2 dog2 = new Dog2();
		dog2.setType("哈士奇");
		System.out.print(dog2.getType());
		dog2.setAge(3);
		System.out.print(" "+dog2.getAge());
		System.out.print(" ");
		dog2.jiao();
		dog2.run();
		
	}

}
class Dog1{
	private String type;
	private int age;
	public void setType(String n) {
		type = n;
	}
	public String getType() {
		return type;
	}
	public void setAge(int m) {
		age = m;
	}
	public int getAge() {
		return age;
	}
	public void jiao() {
		System.out.println("wang");
	}
	public void run() {
		System.out.println("跑得快");
	}
}class Dog2{
	private String type;
	private int age;
	public void setType(String n) {
		type = n;
	}
	public String getType() {
		return type;
	}
	public void setAge(int m) {
		age = m;
	}
	public int getAge() {
		return age;
	}
	public void jiao() {
		System.out.println("Hang");
	}
	public void run() {
		System.out.println("跑得慢");
	}
}