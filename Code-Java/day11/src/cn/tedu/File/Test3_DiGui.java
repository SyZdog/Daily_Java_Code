package cn.tedu.File;

import java.io.File;


//	创建文件对象，并指定操作的文件
public class Test3_DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/zdzsmacbookpro/Desktop/teach/111");
		long total = size(file);
		System.out.println(total);
	}

	private static long size(File file) {
		// TODO Auto-generated method stub
		File[] fs = file.listFiles();
		long sum = 0;
		for(int i = 0; i < fs.length; i++) {
			File f = fs[i];
			if(f.isFile()) {
				sum = sum + f.length();
			}else if(f.isDirectory()) {
				sum = sum + size(f);
			}
		}
		return sum;
	}

}
