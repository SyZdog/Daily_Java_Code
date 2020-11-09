package cn.tedu.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test2_File {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//1.创建文件对象
		File file = new File("/Users/zdzsmacbookpro/Desktop/teach/1.rtf");
		//2.测试方法
		System.out.println(file.length());//文件的字节量
	       System.out.println(file.exists());//是否存在，存在返回true
	       System.out.println(file.isFile());//是否为文件，是文件返回true
	       System.out.println(file.isDirectory());//是否为文件夹，是文件夹返回true
	       System.out.println(file.getName());//获取文件/文件夹名
	       System.out.println(file.getParent());//获取父文件夹的路径
	       System.out.println(file.getAbsolutePath());//获取文件的完整路径
		
	       //     创建、删除
	       file = new File("/Users/zdzsmacbookpro/Desktop/teach/2.rtf");
	       System.out.println(file.createNewFile());//创建不存在的文件！！
	      
	       file = new File("/Users/zdzsmacbookpro/Desktop/teach/m");
	       System.out.println(file.mkdir());//创建不存在的单级文件夹！！
	       file = new File("/Users/zdzsmacbookpro/Desktop/teach/o/p/q");
	       System.out.println(file.mkdirs());//创建不存在的多级文件夹！！
	      // System.out.println(file.delete());//删除文件或者删除空的文件
	       
	     //	     文件夹列表
	       file = new File("/Users/zdzsmacbookpro/Desktop/teach/a");
	       String[] names = file.list();
	       //列出文件夹中的所有文件的  名称
	       System.out.println(Arrays.toString(names));
	      
	        File[] fs = file.listFiles();
	       //列出文件夹中的所有文件的 文件对象
	       System.out.println(Arrays.toString(fs));    
	}

}
