package cn.tedu.bubble;

import java.util.Arrays;

public class Test3_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建二维数组
		int[][] a = {{1,3},{4,6},{7,9}};
		//遍历二维数组
		for(int i = 0; i < a.length ; i++) {//遍历外部数组
			for(int j = 0; j < a[i].length ; j++) {//遍历内部数组
				System.out.println(a[i][j]);
			}
		}
	}

}
