package collection;

public class MyListTest {

	public static void main(String[] args) {
		MyListDemo list = new MyListDemo();
		list.add("张三");
		list.add("李四");
		list.add("王二");
		list.add("麻子");
		
		for (String string : list) {
			System.out.println(string+",");
		}
	}
}
