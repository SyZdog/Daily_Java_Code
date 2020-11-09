package cn.tedu.basic;
import java.util.Scanner;
//这个类用来计算3个数最大值
public class HomeWork_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println(max);
	}

}
