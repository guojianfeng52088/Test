package nothingPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月29日
 */
class Fu{
	
	public void fun(){
		System.out.println("这是父类的方法");
	}
	
}

class Zi extends Fu{
	
//	public void fun(){
//		System.out.println("重写父类的方法");
//	}
}


public class Test03 {

	public static void main(String[] args) {
		Fu f = new Fu();
		f.fun();
		
		Zi z = new Zi();
		z.fun();
	}
	
}
