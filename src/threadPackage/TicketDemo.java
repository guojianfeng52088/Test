package threadPackage;

class Ticket extends Thread{
	
	public Ticket(String name){
		super(name);
	}
	
	
	static int num = 50;
	
	@Override
	public void run() {
	
		while(true){
			
			synchronized ("锁") {
				if(num>0){
					num --;
					try {
						this.currentThread().sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName()+"卖掉一张票,还剩"+num+"张票");
				}else{
					System.out.println("已售罄");
					break;
				}
			}
		}
	}
}




public class TicketDemo {

	
	public static void main(String[] args) {
		
		Ticket ticket1 = new Ticket("窗口1");
		Ticket ticket2 = new Ticket("窗口2");
		Ticket ticket3 = new Ticket("窗口3");
		
		ticket1.start();
		ticket2.start();
		ticket3.start();
		
	}
}
