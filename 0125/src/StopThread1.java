public class StopThread1 {
	public static void main(String[] args) {
		StopDemo st = new StopDemo();    Thread thread =  new Thread(st);
		System.out.println("Thread Starting...");
		thread.start();
		try {
			Thread.sleep(1000);   //1초간 대기 
		}catch(Exception ex) {}
		System.out.println("Thread Stopping...");
		thread.interrupt();
	}
	
}
class StopDemo implements Runnable{
	@Override
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("I'm alive....");
				Thread.sleep(100);   //0.1초간 대기 
			}
		}catch(InterruptedException ex) {
		}finally {
			System.out.println("I'm dead...");
		}
	}
}





