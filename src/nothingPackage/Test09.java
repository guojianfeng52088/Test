package nothingPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月30日
 */
abstract class Car {

	String brand;
	String color;

	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public void run() {
		System.out.println("每个Car都能run,这是公共方法");
	}

	public abstract void fun();
}

class BSJ extends Car {

	public BSJ(String brand, String color) {
		super(brand, color);
	}

	@Override
	public void fun() {
		System.out.println("这是" + this.brand + "专属的功能");
	}

}

class ThreeCar extends Car {

	public ThreeCar(String brand, String color) {
		super(brand, color);
	}

	@Override
	public void fun() {
		System.out.println("这是:" + this.brand + "专属的功能");
	}
}

public class Test09 {

	public static void main(String[] args) {

		BSJ bsj = new BSJ("保时捷", "黑色");
		bsj.run();
		bsj.fun();

		ThreeCar threeCar = new ThreeCar("三轮车", "白色");
		threeCar.run();
		threeCar.fun();

		sale(threeCar);
		sale(bsj);
	}

	public static void sale(Car car) {

		String brand = car.brand;
		String color = car.color;
		System.out.println("这辆" + brand + "牌子" + color + "的车准备卖掉");
	}
}
