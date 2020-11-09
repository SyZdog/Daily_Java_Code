package cn.tedu.ifdemo;

//测试嵌套for
public class Test5_For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1; j <= i ; j++) {//修改内循环的循环条件，让j跟随i改变
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1; j <= i ; j++) {//修改内循环的循环条件，让j跟随i改变
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}

}
