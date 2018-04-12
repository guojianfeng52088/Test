package threadPackage;

/**
 * @Description
 * @author chuck
 * @date 2018年4月11日
 */
public class Demo5 extends Thread {

	public Demo5(String name){
		super(name);
	}
	
	@Override
	public void run()  { // 子类抛出的异常类型必须要小于或者等于父类抛出 的异常类型。
		for(int i = 1 ;  i<100 ; i++){
			System.out.println(this.getName()+"已经下载了："+i+"%");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		System.out.println("下载完毕，正在安装更新包！！！");
	}
	
	
	
	
	public static void main(String[] args) {
		//创建一个线程对象
		Demo5 d = new Demo5("守护线程");
		
		d.setDaemon(true); //设置一个线程为守护线程。
//		System.out.println("是守护线程吗？"+d.isDaemon());  // isDaemon 判断一个线程是否为守护线程。
		//启动线程
		d.start();
		
		for(int i = 0; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
