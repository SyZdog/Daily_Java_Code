package cn.tedu.annontation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//这个类可以用来测试自定义注解
public class Test1_Annontation {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
//1.自定义一个注解
@interface Test{
	int age() default 10;
	
	String value() default "jack";
}

//2.使用注解
//@Test
class Hello{
	//@Test(age = 10)
	String name;
	//@Test("jack")
	@Test()
	public void add() {
		System.out.println("add()");
	}
}
}
