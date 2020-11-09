package cn.tedu.File;

import java.io.File;

public class Test4_DiGui_Del {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/zdzsmacbookpro/Desktop/teach/111");
		del(file);
	}

	private static void del(File file) {
	
		// TODO Auto-generated method stub
		File[] fs = file.listFiles();
		for(int i = 0; i < fs.length; i++){
			File f = fs[i];
			if(f.isFile()) {
				f.delete();
			}else if(f.isDirectory()) {//是文件夹就递归
				del(f);
			}
			
		}
		file.delete();//删除空文件夹
	}

}
