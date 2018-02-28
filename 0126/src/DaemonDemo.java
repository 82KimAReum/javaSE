//daemon thread는 모든 thread가 종료되면 그때 자동 종료된다. 
public class DaemonDemo implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonDemo());
		t.setDaemon(true);   t.start();
		try {
			Thread.sleep(5000);   //5초간 대기 후 main 종료
		}catch(InterruptedException ex) {}
		System.out.println("main thread is over...");
	}

	@Override
	public void run() {
		// OS가 처리하는 부
		while(true) {
			System.out.println("Daemon Thread is running...");
			try {
				Thread.sleep(500);   //0.5초간 대기 
			}catch(InterruptedException e) {
				System.out.println("Exception Occurrance...");  break;
			}
		}
	}
}





