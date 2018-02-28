
public class ATM1 implements Runnable {
	private int balance;
	public ATM1() {
		this.balance = 10000;
	}
	private /*synchronized*/ void withdraw(int howmuch) {
		if(this.balance <= 0) {
			System.out.println("[" + Thread.currentThread().getName() + 
					                     "]의 잔액이 부족합니다.");
		}else {
			this.balance -= howmuch;
			System.out.println("[" + Thread.currentThread().getName() + 
                    "] --> " + this.balance);
		}
	}
	@Override
	public void run() {
		synchronized(this){
			for(int i = 0 ; i < 5 ; i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
				if(this.balance > 0)  withdraw(1000);
				else break;
			}
		}
	}

}




