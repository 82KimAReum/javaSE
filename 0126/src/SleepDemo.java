public class SleepDemo extends Thread{
	public SleepDemo(String name) { super(name);  }
	public static void main(String[] args) {
		SleepDemo thread1 = new SleepDemo("Sally");
		SleepDemo thread2 = new SleepDemo("Michael");
		thread1.start();   thread2.start();
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			//try {
				//Thread.sleep(1000);
			Thread.yield();
			//}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + 
					 " --> " + i);
		}
	}
}




