package collection;

import java.util.ArrayList;

public class FanTypeTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Util.print(list);

		ArrayList list2 = Util.getList();
		
		String t1 = getT("123");
		System.out.println("t1="+t1);
		Integer t2 = getT(12223);
		System.out.println("t2="+t2);
	}
	
	
	public static <T> T getT (T o){
		return o;
	}
}
