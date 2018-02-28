//1. 
public class CreateThread extends Thread{
	public CreateThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		//OS가 실행하는 코드 
		System.out.println("I'm Thread.");
	}
	public static void main(String[] args) {
		CreateThread ct = new CreateThread("My Thread");
		ct.start();  //OS가 run()을 실행하려면 현재의 쓰레드를 runnable로 변경해야 
	}
}



