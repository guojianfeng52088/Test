package exceptionPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月30日
 */
class NoIpException extends Exception{
	public NoIpException(String message){
		super(message);
	}
} 

public class Test3 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println("str1->"+str1+" str2->"+str2+" str3->"+str3+" str4->"+str4.toString());
		
		try{
			FeiQ(null);
		}catch(NoIpException e){
//			e.printStackTrace();
//			e.getMessage();
			e.toString();
		}
		
	}
	
	public static void FeiQ(String ip) throws NoIpException{
		if (ip == null){
			throw new NoIpException("么有网啊");
		}
	}
} 
