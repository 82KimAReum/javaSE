
public class WaitNotifyDemo {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		mother.start();   son.start();
	}
}
