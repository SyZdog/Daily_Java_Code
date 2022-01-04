package cn.tedu.set;

import java.util.HashSet;
//这个类用来给自定义对象去重
//总结：
//1、如果你想用Set集合，给自定义对象去重，要求你在自己的类中，同时提供重写的hashCode()和equals()
//--源码摘抄：if (p.hash == hash &&((k = p.key) == key || (key != null && key.equals(k))))
//重写的hashCode()：我们不适用默认的自动计算出来的哈希值，而是要根据对象的属性值计算，如果对象的属性值都相同，那么请产生相同的哈希值
//重写的equals()：我们要比较的不是对象的地址值，而是比较，两个对象间如果属性值都一样就返回true
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
		//重复的添加了属性相同的对象，为什么没有去重？？--翻完源码，显示
		//1，保证对象拥有相同的哈希值？？默认使用的是Object提供的hashCode()计算的哈希值
		   //如果你想要根据两个对象的属性值计算哈希值，那就需要重写hashCode()
		//2，是要保证两个对象间的equals()返回true，那就需要重写equals()
		System.out.println(set);
		//目前set集合根本就没有给自定义对象去重，因为s4 s5和s2 s3属性完全一样，但是set还是存了。
		//需求：set集合添加数据时，去判断一下，如果两个对象的所有属性值都一样，就直接去重就行 ！！
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
