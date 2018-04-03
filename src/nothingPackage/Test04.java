package nothingPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月29日
 */
public class Test04 {
	//instanceof 
	public static void main(String[] args) {
		
		Object obg = "123";
		
		if(obg instanceof Integer){
			System.out.println("属于String类");
		}else{
			System.out.println("我瞎猜的");
		}
		
		//获取对象的类型
		System.out.println(obg.getClass()); 
		
	}
	
}
