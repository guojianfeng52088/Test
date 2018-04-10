package threadPackage;

/**
 * 自定义线程的第二种方法 
 */
public class Thread2Demo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread()+"线程->"+i);
		}
		
		System.out.println("当前线程对象"+Thread.currentThread());
		System.out.println("当前对象"+this);
	}

	public static void main(String[] args) {
		
		Thread2Demo demo = new Thread2Demo();
		
		Thread thread = new Thread(demo, "张三");
		thread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}






