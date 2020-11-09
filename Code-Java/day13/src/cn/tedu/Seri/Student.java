package cn.tedu.Seri;

import java.io.Serializable;

//描述学生类
//java.io.NotSerializableException
//Serializable是个空接口，里面没有方法，用来做标志
public class Student implements Serializable{
	
	//给每个文件分配唯一的ID值
	private static final long serialVersionUID = 1L;

	//提供构造方法
    public Student() {}//无参构造方法
	//右键-source-倒数第三个-OK
	public Student(String name, int age, String addr) {//含参构造方法
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//封装成员变量
	private String name;
	private int age;
	private String addr;
	
	//get(),set()
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
	
	//重写toString()
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
		}
	
	
	
	
	
	
}
