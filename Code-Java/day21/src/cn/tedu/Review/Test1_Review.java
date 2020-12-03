package cn.tedu.Review;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test1_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3/2);
		System.out.println(3/2d);
		System.out.println(1-0.8);
		double a = new Scanner(System.in ).nextDouble();
		double b = new Scanner(System.in ).nextDouble();
		BigDecimal bd1 = new BigDecimal(a+"");
		BigDecimal bd2 = new BigDecimal(b+"");
		
		//+ - * /
		//add(),subtract(),multiply(),divide()
		BigDecimal bd3;
		bd3 = bd1.add(bd2);
		System.out.println(bd3);
		bd3 = bd1.subtract(bd2);
		System.out.println(bd3);
		bd3 = bd1.multiply(bd2);
		System.out.println(bd3);
		bd3 = bd1.divide(bd2 , 3 , BigDecimal.ROUND_HALF_UP);
		System.out.println(bd3);
		//自增和自减
		int m = 1;
		int n = 1;
		//符号在后，先使用再变化
		System.out.println(m++);
		//符号在前，先变化再使用
		System.out.println(--n);
		//三元运算符的形式 ? :
		int i = 5;
		int j = 8;
		int max = i > j ? i : j;
		System.out.println(max);
		//打印1~10
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		
	}
}
