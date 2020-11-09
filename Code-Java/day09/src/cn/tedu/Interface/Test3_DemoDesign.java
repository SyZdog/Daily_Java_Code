package cn.tedu.Interface;

public class Test3_DemoDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher cgbTeacher = new CgbTeacher();
		cgbTeacher.teach();
		cgbTeacher.ready();
		
	}

}
interface Teacher{
	abstract public void teach();
	abstract public void ready();
}
class CgbTeacher implements Teacher{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("培优讲课");
	}

	@Override
	public void ready() {
		// TODO Auto-generated method stub
		System.out.println("备课");
	}
	
}
abstract class Acteacher implements Teacher{
}
