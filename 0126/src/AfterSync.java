
public class AfterSync {
	public static void main(String[] args) {
		ATM1 atm = new ATM1();
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		mother.start();   son.start();
	}
}
