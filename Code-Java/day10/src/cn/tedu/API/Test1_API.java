package cn.tedu.API;

public class Test1_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("jack",20);
		System.out.println(student);//如果不对toString();重写，则输出student对象在内存的地址值
		System.out.println(student.hashCode());//哈希值
		Student student2 = new Student("jack",20);
		System.out.println(student.equals(student2));
	}

}
class Student{//Student类默认继承超类Object即：class Student extends Object
	String name ;
	int age ;
	public Student() {
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override//右键->source->generate...equals()
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
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