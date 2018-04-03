package string;

/**
 * @Description
 * @author chuck
 * @date 2018年4月2日
 */
public class StringBufferTest1 {

	public static void main(String[] args) {
		
	
		StringBuffer sb = new StringBuffer("123");
		sb = sb.append("321");
		System.out.println("sb->"+sb);
		String good = sb.toString();
		System.out.println("good->"+good);
		
	}
}
