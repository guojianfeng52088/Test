package string;

import java.util.Arrays;

/**
 * @Description String 汇总
 * @author chuck
 * @date 2018年4月2日
 */
public class StringTest1 {

	public static void main(String[] args) {
		
		String str1 = "123";
		
		
		
		boolean b1 = str1.endsWith("3");
		System.out.println("b1->"+b1);
		
		boolean b2 =  str1.startsWith("2");
		System.out.println("b2->"+b2);
		
		String str2 = "hello";
		String str3 = "HELLO";
		String str4 = "hello";
		
		boolean b3 = str2.equalsIgnoreCase(str2);
		System.out.println("b3->"+b3);
		
		boolean b4 = str2.contains("h");
		System.out.println("b4->"+b4);
		
		char [] arr =  str3.toCharArray();
		System.out.println("arr -> "+Arrays.toString(arr));
		
		byte [] by = str2.getBytes();
		System.out.println("by -> " + Arrays.toString(by));
		
		
		String sBefore = "123abc";
		String sAfter =  sBefore.replace("123", "ABC");
		System.out.println("替换后的字符串:"+sAfter);
		
		String splitStr = "123-456-789-645";
		String [] split =  splitStr.split("-", 3);
		System.out.println("split->"+Arrays.toString(split));
		
		
	}
	
}
