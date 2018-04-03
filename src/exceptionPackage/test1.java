package exceptionPackage;

/**
 * @Description throwable
 * @author chuck
 * @date 2018年3月30日
 */
public class test1 {

	public static void main(String[] args) {
		
//		Throwable t = new Throwable("偶尔打喷嚏");
//		
//		System.out.println("->"+t.toString());
//		System.out.println("->"+t.getMessage());
//		
//		t.printStackTrace();
		
		div(1,0);
	}
	
	public static void div(int a, int b){
		int c = 0;
		try{
			c = a/b;
			System.out.println("这句话不能被执行");
		}catch(Exception e){
			System.out.println();
			System.out.println("catch语句中的输出->结果:c="+c);	
		}
		System.out.println("结果:c="+c);
	}
}





