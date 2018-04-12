package threadPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年4月11日
 */

class Ticket2 implements Runnable{

	static int num = 500; 
	
	
	
	@Override
	public void run() {
		
		while(true){
			synchronized ("锁") {
				
				if(num>0){
					num --;
//					try {
//						Thread.currentThread().sleep(300);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					System.out.println(Thread.currentThread().getName()+"卖出一张票,还剩"+num+"张票");
				}else{
					System.out.println("票已售完");
					break;
				}
			}
		}
	}
}



public class Thread2TicketDemo {

	public static void main(String[] args) {
		
		Ticket2 t = new Ticket2();
		
		Thread window1 = new Thread(t, "窗口1");
		Thread window2 = new Thread(t, "窗口2");
		Thread window3 = new Thread(t, "窗口3");
		Thread window4 = new Thread(t, "窗口4");
		Thread window5 = new Thread(t, "窗口5");
		
		window1.start();
		window2.start();
		window3.start();
		window4.start();
		window5.start();
	}
}






