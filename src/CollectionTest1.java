
/**
 * @Description
 * @author chuck
 * @date 2018年4月2日
 */
public class CollectionTest1 {

	public static void main(String[] args) {
		String [] arr = new String[100];
		
		arr[0] = "1";
		arr[50] = "哈哈";
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
		
	}
}
