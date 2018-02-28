public class JoinDemo {
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {    //OS가 처리하는 코드 
				try {
					Thread.sleep(3000);    //3초간 대기 
					System.out.println("Thread is stop.");
					Thread.sleep(5000);    //5초간 대기 
				}catch(Exception ex) {}
			}
		};
		t.start();
		try {
			t.join();           //t Thread가 끝날때 main은 그 때 합류한다.
		}catch(Exception ex) {}
		System.out.println("main() end...");
	}
}
