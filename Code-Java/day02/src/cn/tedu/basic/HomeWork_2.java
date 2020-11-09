package cn.tedu.basic;
import java.util.Scanner;
//分数进行等级判断
public class HomeWork_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = new Scanner(System.in).nextInt();
		String result;
		if(91 < score && score < 100) {
			result = "优秀";//System.out.println("优秀");
		}else if(81 < score && score < 90) {
			result = "良好";//System.out.println("良好");
		}else if(71 < score && score < 80) {
			result = "中等";//System.out.println("中等");
		}else if(60 > score ) {
			result = "不及格";//System.out.println("不及格");
		}else {
			result = "非法数据"+score;
		}
		System.out.println(result);
	}

}
