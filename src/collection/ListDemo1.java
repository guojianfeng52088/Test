package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @author chuck
 * @date 2018年4月3日
 */
public class ListDemo1 {
	/**
	 * List和ArrayList的区别
	 * List是一个接口,而ArrayList是一个实现类,实现了List中定义的方法
	 * List继承于Collection
	 * ArrayList继承于 AbstractList->AbstractCollection->Collection
	 * ArrayList有序,可重复
	 */

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); 
		list1.add("1");
		list1.add("2");
		list1.add("1");
		
		for (Object obj : list1) {
			System.out.println(obj);
		}
		
		
		
		/**
		 * LinkedList的用法 
		 */
		
		LinkedList list = new LinkedList();
		list.add("张三");
		list.add("李思");
		
		list.addFirst("第一刀皇");
		list.addLast("第三邪皇");
		list.add("老末?");
		
		Object obj = list.poll();
		
		System.out.println("----"+obj.toString());
		
	for (Object object : list) {
		System.out.println("list->"+object.toString());
	}
		
	
	
	/**
	 * Set的用法
	 * set是一个接口,元素不可重复
	 */
	
	Set set = new HashSet<>();
	
	set.add("小猫");
	set.add("小狗");
	set.add("小猫");
	
	for (Object object : set) {
		System.out.println("set->"+object.toString());
	}
	
	
		
	}
}
