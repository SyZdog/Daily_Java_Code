package cn.tedu.ifdemo;
//嵌套for循环
public class Test4_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 4 ; i++) {//外循环3次
			System.out.println(i);
			for(int j = 1; j < 6; j++) {//内循环5次
				System.out.println(j);
			}
		}
		System.out.println();//空行
		//外循环控制行，内循环控制列
		for(int i = 1; i <= 3 ; i++) {//外循环3次，控制行，打印3行
			for(int j = 1; j <= 5; j++) {//内循环5次，控制列，打印5列
				System.out.print("*");
			}
			System.out.println();//空行
		}
		
	}

}
