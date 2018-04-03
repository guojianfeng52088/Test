package nothingPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月30日
 */


abstract class T{
	String name;
	String color;
	
	public void fun(){
		System.out.println("抽象类的fun方法");
	}
	
	public abstract void fun1();
	
}

class T1 extends T{


	@Override
	public void fun1() {
		System.out.println("子类实现父类的抽象方法fun1");
	}
	
	public void fun(){
		System.out.println("子类重写父类的fun方法");
	}
	
	public void fun2(){
		System.out.println("子类特有的fun2方法");
	}
}


public class Test08 {

	public static void main(String[] args) {
//		T1 t1 = new T1();
//		t1.fun();
//		t1.fun1();
//		t1.fun2();
		
//		T t = new T1();
//		t.fun();
//		t.fun1();
		
//		T t = new T();
//		t.fun();
//		t.fun1();
	}
}






