package cn.tedu.oop;

public class HomeWork_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher dpl = new Teacher();
		dpl.setName("小明");
		System.out.print(dpl.getName());
		dpl.setAge(21);
		System.out.print("，"+dpl.getAge());
		dpl.setSalary(8500);
		System.out.print("，"+dpl.getSalary());
		dpl.setAdd("北京");
		System.out.print("，"+dpl.getAdd());
		Teacher xpl = new Teacher();
		System.out.println();
		xpl.qc("小王", 20, 8000, "上海");
	}

}
class Teacher{
	private String name;
	private int age;
	private int salary;
	private String add;
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setSalary(int s) {
		salary = s;
	}
	public int getSalary() {
		return salary;
	}
	public void setAdd(String ad) {
		add = ad;
	}
	public String getAdd() {
		return add;
	}
	public void qc(String n , int a , int s , String ad) {
		System.out.println(n + "，" + a + "，" + s + "，" + ad);
	}
}