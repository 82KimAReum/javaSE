//1.
public class StopThread {
	public static void main(String[] args) {
		StopTest st = new StopTest();    Thread thread =  new Thread(st);
		System.out.println("Thread Starting...");
		thread.start();
		try {
			Thread.sleep(1000);   //3초간 대기 
		}catch(Exception ex) {}
		System.out.println("Thread Stopping...");
		st.mystop();
	}
}
class StopTest implements Runnable{
	private boolean flag = false;
	public void mystop() {
		this.flag = true;
	}
	@Override
	public void run() {
		while(!flag) {
			System.out.println("I'm alive....");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}   //1초간 대기
		}
		System.out.println("I'm dead...");
	}
}