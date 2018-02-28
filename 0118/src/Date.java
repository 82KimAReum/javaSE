//3. interface를 상속받은 class는 반드시 추상메소드를 재정의해야 한다. 
public class Date implements Dateable {
	private int date;
	@Override
	public void set(int date) {
		this.date = date;
	}
	@Override
	public int get() {
		return this.date;
	}
}
