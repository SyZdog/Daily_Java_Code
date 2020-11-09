package cn.tedu.set;

import java.util.HashSet;
public class Test3_QuChong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Set集合
		HashSet<Student> set = new HashSet<Student>();
		//创建Student对象
		Student s1 = new Student("tony",17,"BJ");
		Student s2 = new Student("jack",17,"BJ");
		Student s3 = new Student("rose",17,"BJ");
		Student s4 = new Student("jack",17,"BJ");
		Student s5 = new Student("rose",17,"BJ");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		System.out.println(set);
 }
}
class Student{
	//构造方法
	public Student(){}
	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	//私有属性
	private String name;
	private int age;
	private String addr;
	//提供get,set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
 }
