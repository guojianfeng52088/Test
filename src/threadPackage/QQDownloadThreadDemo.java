package threadPackage;

/**
 * @Description 守护线程
 * @author chuck
 * @date 2018年4月11日
 */

class Download extends Thread{
	
	@Override
	public void run() {
	
		
			for (int i = 0; i < 100; i++) {
				try {
					this.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(this.getName()+"下载进度:"+i+"%");
			}
	}
	
}

public class QQDownloadThreadDemo extends Thread{
	public static void main(String[] args) {
		Download d = new Download();
		d.setDaemon(true);
		d.setName("下载线程");
		d.start();
		System.out.println(d.getName()+"这个线程是否是守护线程?"+d.isDaemon()); 
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread()+"->"+i);
		}
	}
}
