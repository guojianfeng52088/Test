package threadPackage;


public class ThreadFunction extends Thread{

	public ThreadFunction(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//得到当前线程的名字
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadFunction thread = new ThreadFunction("sb");
		//设置线程的优先级
		thread.setPriority(MIN_PRIORITY);
		thread.start();
		System.out.println("自定义的线程优先级"+thread.getPriority());
		
		//设置线程睡眠时间
//		thread.sleep(1000);
		Thread currentThread = thread.currentThread();
		System.out.println("主线程的优先级是:"+currentThread.getPriority());
		currentThread.setPriority(10);
		
		System.out.println("主线程的名字是;"+currentThread.getName());
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(currentThread.getName()+":"+i);
		}
		
	}
}
