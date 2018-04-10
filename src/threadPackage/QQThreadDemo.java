package threadPackage;

class Talk extends Thread{
	
	@Override
	public void run() {
		while (true) {
			System.out.println("文字聊天中");
		}
	}
}

class Video extends Thread{
	@Override
	public void run() {
	
		while (true) {
			System.out.println("视频聊天中");
		}
		
	}
}

public class QQThreadDemo {

	public static void main(String[] args) {
		
		
		Talk talkThread = new Talk();
		
		Video videoThread = new Video();
		
		talkThread.start();
		videoThread.start();
		
	}
}
