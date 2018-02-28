
public class ATM2 implements Runnable {
	private int balance;
	public ATM2() {
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
			for(int i = 0 ; i < 10 ; i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
				if(this.balance > 0)  withdraw(1000);
				else break;
				if(this.balance == 2000 || this.balance == 4000 ||
						this.balance == 6000 || this.balance == 8000) {
					try {
						this.wait();
					} catch (InterruptedException e) {}
				}else this.notify();
			}
		}
	}

}




