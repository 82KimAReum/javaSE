public class SleepDemo implements Runnable{
	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();    Thread t = new Thread(sd, "First");
		SleepDemo sd1 = new SleepDemo();  Thread t1 = new Thread(sd1, "Second");
		t.setPriority(Thread.MIN_PRIORITY);  //1
		t1.setPriority(Thread.MAX_PRIORITY);  //10
		t.start();    t1.start();
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);  //1초간 대기 
			}catch(Exception ex) {}
			System.out.println(Thread.currentThread().getName() + " --> " + i);
		}
	}
}
