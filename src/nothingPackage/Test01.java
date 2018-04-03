package nothingPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月21日
 */
class Person{
	
	{
		i = 2000;
	}
	
	static{
		System.out.println("看看调用几次");
	}
	
	public Person(){
		i = 3000;
	}
	
	int i = 1000;
	
}

public class Test01 {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("i = "+person.i);
		
		Person person2 = new Person();
	}
	
}











