package nothingPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月29日
 */
class Person2{
	String name;
	
	protected void fun(){
		System.out.println("非静态函数");
	}
	protected static void eat(){
		System.out.println("静态函数");
	}
}

public class Test02 {

	public static void main(String[] args) {
	
		Person2 p1 = new Person2();
		p1.name = "lll";
		p1.fun();
		p1.eat();
	}
}
