//2. 
public class CreateThread1 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CreateThread1 ct = new CreateThread1();   //ct.start();
		Thread thread = new Thread(ct, "My Thread");    thread.start();
		System.out.println(Thread.currentThread().getName());
	}
}






