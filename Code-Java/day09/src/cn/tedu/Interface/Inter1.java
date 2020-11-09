package cn.tedu.Interface;

public interface Inter1 {
	final static int age =10;
	abstract public void eat();
	abstract public void game();
}
interface Inter2{
	abstract public void eat1();
	abstract public void game2();
}
interface Inter3 extends Inter1,Inter2{
	
}