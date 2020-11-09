package cn.tedu.API;

import java.util.Scanner;

public class Test4_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = new Scanner(System.in).nextLine();
		String regex = "[0-9]{17}[0-9xX]";
		if(input.matches(regex)) {
			System.out.println("ok");
		}else {
			System.out.println("不OK");
		}
	}

}
