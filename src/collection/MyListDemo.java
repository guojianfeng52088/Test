package collection;

import java.util.Arrays;
import java.util.Iterator;

public class MyListDemo implements Iterable<String> {

	Object [] obj;
	int index = 0;
	public MyListDemo() {
		obj = new Object[10]; 
	}
	
	
	public void add(Object t){
		int minLength = index + 1;
		ensureCapcity(minLength);
		obj[index++] = t;
	}
	
	public void ensureCapcity(int minLength){
		if (minLength == obj.length){
			int newLength = (int) (obj.length*1.5);
			obj = Arrays.copyOf(obj, newLength);
			
		}
	}

	
	
	
	@Override
	public Iterator<String> iterator() {
		
		return new Iterator<String>() {

			int cursor;	//游标
			
			@Override
			public boolean hasNext() {
				
				return cursor != index;
			}

			@Override
			public String next() {
				
				return (String) obj[cursor++];
			}
		};
		
	}

}
