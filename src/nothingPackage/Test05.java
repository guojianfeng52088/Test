package nothingPackage;

/**
 * @Description 抽象类
 * @author chuck
 * @date 2018年3月29日
 */
abstract class Animal {
	String name;
	String color;

	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void sleep() {
		System.out.println("zzzzz...");
	}

	public abstract void run();

}

class Cat extends Animal{
	
	public Cat(String name, String color) {
		super(name, color);	
	}

	public void voice(){
		System.out.println("喵");
	}
	
	@Override
	public void run() {
		System.out.println("Cat类实现了抽象方法");
	}	
}

class Dog extends Animal{

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void run() {
		System.out.println("Dog类实现了抽象方法");
	}
	
	public void voice(){
		System.out.println("汪");
	}
	
}


public class Test05 {

	public static void main(String[] args) {

			Cat cat = new Cat("小猫", "黄色");
			cat.run();
			cat.voice();
			
			Dog dog = new Dog("小狗", "黑色");
			dog.run();
			dog.voice();
	
//			Animal animal = new Animal() {
//				
//				
//				public void run() {
//					
//					
//				}
//			};
					
	}
}
