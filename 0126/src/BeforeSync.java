
public class BeforeSync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		mother.start();   son.start();
	}
}
