//daemon은 process가 종료되어도 background service를 위해서 완전히 종료되지 
//않는 thread 
public class DaemonDemo {
	public static void main(String[] args) {
		Thread daemon = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);    //10초간 대기
					System.out.println("I'm dead.");
				}catch(Exception ex) {}
			}
		};
		daemon.setDaemon(true);  //IllegalThreadStateException 발생할 수 있음.
		daemon.start();
		System.out.println("Program is over...");
	}
}
