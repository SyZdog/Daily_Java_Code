package cn.tedu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import org.junit.Test;

public class Test1_Reflection {
//这个类用来测试反射
	//语法要求：public void 无参 @Test
	@Test
	public void getClazz() throws Exception {
		//获取类对象
		Class<?> student1 = Class.forName("cn.tedu.reflect.Student");//Class.forName("类的全路径")
		Class<?> student2 = Student.class;//类名.class
		Class<?> student3 = new Student().getClass();//对象.getClass()
		
		System.out.println(student1);//反射内容
		System.out.println(student2.getName());//类名+包名
		System.out.println(student3.getSimpleName());//只有类名
		System.out.println(student3.getPackage());
	}
	//获取构造方法
	@Test
	public void getConstruct() {
		//1.获取class对象
		Class<?> clazz = Student.class;
		//2.获取构造方法们，放到数组中
		Constructor<?>[] cs  = clazz.getConstructors();
		//3.获取每个构造，for each 1.类型 2.变量名 3.要遍历的数组
		for (Constructor<?> c : cs) {
			System.out.println(c.getName());//获取构造方法的名称(有参+无参）
			 Class<?>[] cc = c.getParameterTypes();//获取构造方法的参数
			 System.out.println(Arrays.toString(cc));
		}
		
	}
	
	//获取成员方法
	@Test
	public void getMethod() throws Exception {
		//1.获取class对象
		Class<?> clazz = Class.forName("cn.tedu.reflect.Student");
		//2.获取成员方法们
		Method[] ms = clazz.getMethods();
		for (Method m : ms) {
			System.out.println(m.getName());//获取方法名
			Parameter[] cc = m.getParameters();//获取方法参数
			System.out.println(Arrays.toString(cc));//
		}
	}
	
	//获取成员变量（属性），要求：成员变量必须用public修饰，如果没有修饰，默认为default
	@Test
	public void getField() {
		//1.获取class对象
		Class<?> clazz = new Student().getClass();
		
		//2.获取属性们
		Field[] fs = clazz.getFields();
		for (Field f : fs) {
			System.out.println(f.getName());//获取属性名
			System.out.println(f.getType().getName());//获取变量类型
		}
	}
	
	//通过反射创建对象
	
	@Test
	public void getObeject() throws Exception {
		//1.获取class对象
		Class<?> clazz = Student.class;
		//2.创建对象
		Object obj = clazz.getConstructor().newInstance();//触发无参构造,JavaSE-14需补充.getConstructor()
		System.out.println(obj);
		//指定含参构造
		Constructor<?> c = clazz.getConstructor(String.class,int.class);
		Object obj2 = c.newInstance("jack",20);
		System.out.println(obj2);
		Student stu = (Student)obj2;//向下转型Object->Student
		System.out.println(stu.age);//调用Student类特有功能
		System.out.println(stu.name);
		
 		
	}
}
