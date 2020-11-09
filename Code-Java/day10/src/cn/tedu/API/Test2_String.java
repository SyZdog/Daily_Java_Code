package cn.tedu.API;

public class Test2_String {
	public static void main(String[] args) {
		//创建String类型
		char[] value = {'a','b','c'};
		String str = new String(value);//字符串底层维护了一个char[],再存放在内存的堆中
		
		String s2 = "abc";//存放在内存的 堆的 常量池中，效率高
		//常用方法练习
		System.out.println(s2.charAt(1));//b,获取下标为1的char字符
		System.out.println(s2.concat("efg"));//在原有字符串基础上进行拼接
		System.out.println(s2.endsWith("g"));//false 判断是否以字母g结束
		System.out.println(s2.equals(str));//true，String重写equal(),比较了s1和s2的属性值abc本身
		System.out.println(s2.getBytes());//将字符串转成byte[]
		System.out.println(s2.indexOf("c"));//2,指c出现的第一次的位置索引值
		
		s2 = "abcdefg";
		System.out.println(s2.lastIndexOf("c"));//指c出现的最后一次位置的索引值
		System.out.println(s2.length());//获取字符串的长度
		System.out.println(s2.startsWith("a"));//判断字符串是否以a开始
		System.out.println(s2.substring(1));//从下标1的位置开始向后截取到的字符串
		System.out.println(s2.substring(3,7));//含头不含尾的截取字符串
		System.out.println(s2.toUpperCase());//全转大写
		System.out.println(s2.toLowerCase());//全转小写
		s2 = "     zhend      ";
		System.out.println(s2.trim());//去掉数据的前后空格
		System.out.println(String.valueOf(10)+10);//返回int参数的字符串表示形式
		s2 = "a b c d";
		System.out.println(s2.split(" "));//把字符串按照一定的规则进行切割，形成String[]
   }
}
