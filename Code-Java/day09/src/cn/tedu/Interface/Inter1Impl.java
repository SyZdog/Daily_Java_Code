package cn.tedu.Interface;

public class Inter1Impl implements Inter1{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("好好吃饭");
	}

	@Override
	public void game() {
		// TODO Auto-generated method stub
		System.out.println("不要玩游戏");
	}

	public Inter1Impl(){
		super();
		System.out.println("Inter1Impl的构造方法");
	}

}



