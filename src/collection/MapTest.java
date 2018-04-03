package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * map的遍历 
	 */
	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		
		map.put("key1", "张三");
		map.put("key2", "李四");
		map.put("key3", "王二");
		
		Set<Map.Entry<String, String>> set =  map.entrySet();
	
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> entry =  it.next();
			System.out.println("键->"+entry.getKey()+" 值->"+entry.getValue());
		}
		
	}
}
