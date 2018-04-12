package threadPackage;

class Money extends Thread{
	
	static int allMoney = 5000;
	
	public Money(String name) {
		super(name);
	}
	
	@Override
	public void run() {
	  
		while (true) {
			synchronized ("锁") {
				if(allMoney >= 100){
					allMoney -= 100;
					System.out.println(this.getName()+"线程取钱,还剩"+allMoney);
				}else{
					System.out.println("钱取完了");
					break;
				}
			}
		}
	}
}


public class MoneyThreadDemo {

	public static void main(String[] args) {
		Money wife = new Money("老婆");
		Money husband = new Money("老公");
		
		wife.start();
		husband.start();
	}
}
