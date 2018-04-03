package nothingPackage;

/**
 * @Description 匿名内部类
 * @author chuck
 * @date 2018年3月30日
 */

abstract class Fish{
	
	public abstract void fun();
	
}

class Fish2{
	public void fun(){
		System.out.println("....");
	}
}

class Outer{
	public void print(){
		new Fish2(){
			
		}.fun();
	}
}

public class Test10 {

	public static void main(String[] args) {
		Fish f = new Fish(){
			
			String name ;
			
			public void swim(){
				System.out.println("在游泳");
			}

			public void fun() {
				System.out.println("匿名内部类的方法");
			}
		};
		
		f.fun();
		
		Outer out = new Outer();
		out.print();
		
	}
	
	
	
}
