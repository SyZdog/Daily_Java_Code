package cn.tedu.staticdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = new Scanner(System.in).nextInt();
			int b = new Scanner(System.in).nextInt();
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("第二个值不能为0");
		}catch (InputMismatchException ie) {
			// TODO: handle exception
			System.out.println("输入类型为整数类型");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("请输入正确的整数");
		}
			
	
		
	}

}
