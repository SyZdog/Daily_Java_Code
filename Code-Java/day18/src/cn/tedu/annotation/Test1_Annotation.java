package cn.tedu.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
//这个类用来测试自定义注解
public class Test1_Annotation {
	public static void main(String[] args) {
	}
}
//第一步：自定义注解，注意语法和java不同！！

//1,定义注解需要用：@interface来标志  注解名

//2,@Target指定注解可以存在的位置

//@Target(ElementType.METHOD)//3,注解可以出现在方法上

@Target({ ElementType.METHOD , ElementType.TYPE })//7,注解还可以出现在多个位置上

//4,@Retention指定注解可以存在的生命周期

@Retention(RetentionPolicy.SOURCE)//5,注解可以存源在文件中

@interface Test{//定义了一个注解，名字叫Test
//8,定义注解的功能--给注解添加属性
//	int age();//这个可不是age方法，而是注解中定义的age属性的语法
	int age() default 0 ;//10,为了使用时方便，age属性设置默认值
	//12,特殊属性value
	String value() ;
//	String value() default "jack";//14,属性有了默认值就不再找你要了
}

//第二步：使用注解
//6,使用注解时，只要在指定的注解名字前面加上@即可使用
class Hello{
	String name;
//	@Test  注解没有属性时，可以直接使用，有属性了就必须给属性赋值
	
	//9,定义了普通的age属性，并赋值，写法age=10，如果用时太麻烦不想赋值
	
//	@Test(age=10)
	//11,由于age属性有了默认值，所以直接用就可以了
	
	@Test("add")//13,给value属性赋值可以简写"add"，就相当于value="add"
	public void add() {
		System.out.println("add()");
	}
}