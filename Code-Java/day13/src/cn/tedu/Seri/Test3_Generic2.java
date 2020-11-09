package cn.tedu.Seri;
public class Test3_Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3,4,5};
		print(a);
		String[] s = {"aaa","bbb"};
		print(s);
	}

	private static <E> void print(E[] s) {
		// TODO Auto-generated method stub
		for (E n : s) {
			System.out.println(n);
		}
	}
}
	
