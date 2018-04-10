package threadPackage;


class Remote extends Thread{
	
	public Remote(String name){
		super(name);
	}
	
	
	@Override
	public void run() {
		if(this.getName().equals("张三")){
			
			synchronized ("遥控器") {
				System.out.println(this.getName()+"取走了遥控器,准备取电池");
				synchronized ("电池") {
					System.out.println(this.getName()+"取到了电池,开空调");
				}
			}
			
		}else if(this.getName().equals("李四")){
			synchronized ("电池") {
				System.out.println(this.getName()+"取走了电池,准备取遥控器");
				synchronized ("遥控器") {
					System.out.println(this.getName()+"取走了遥控器,开空调");
				}
			}
		}
	}
}


public class RemoteControlDemo {

	public static void main(String[] args) {
		Remote r1 = new Remote("张三");
		Remote r2 = new Remote("李四");
		r1.setPriority(1);
		r2.setPriority(10);
		
		r1.start();
		r2.start();
	}
}
