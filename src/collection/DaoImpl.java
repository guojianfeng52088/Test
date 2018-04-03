package collection;

public class DaoImpl <T> implements Dao<T> {

	@Override
	public void add(T t) {
		
		System.out.println("添加了一个元素:"+t.toString());
	}

}
