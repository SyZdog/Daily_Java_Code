package cn.tedu.bubble;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int[] newA = method(a);
		System.out.println(Arrays.toString(newA));
	}

	public static int[] method(int[] a) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < a.length-1 ;i++) {
			a[i] = new Random().nextInt(100)+1;
			for(int j = 0 ; j < a.length-1 ; j++) {
				if(a[j]>a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
		}
	}
		return a;
  }
}


