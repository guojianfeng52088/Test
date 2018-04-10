package threadPackage;


class MyThread extends Thread{
	
	@Override
	public void run() {
		
//		super.run();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("自定义线程->"+i);
		}
	}
	
}


public class MyThreadDemo {

	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("主线程->"+i);
		}
	}
}




