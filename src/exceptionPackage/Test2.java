package exceptionPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年3月30日
 */
public class Test2 {

	public static void main(String[] args) {
		try {
			fun(1, 0, null);
		} catch (Exception e) {
			System.out.println("出错了");
		}
	}

	public static void fun(int a, int b, int[] arr) throws Exception {
		if (b == 0) {
			throw new Exception();
		} else if (arr == null) {

		}
		int c = a / b;
		System.out.println("结果:" + c);
	}

}
