public class TwoThread extends Thread{
	public static void main(String[] args) {
		TwoThread st = new TwoThread();
		//st.run();
		st.start();
		for(int i = 0 ; i < 10 ; i++)  System.out.println(Thread.currentThread().getName());
	}
	public void run() {
		for(int j = 0 ; j < 10 ; j++)  System.out.println(Thread.currentThread().getName());
	}
}
