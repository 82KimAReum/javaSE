
public interface Dateable {
	int SUN = 1, MON = 2, TUE = 3, WED = 4, THU = 5, FRI = 6, SAT = 7;
	//1. interface는 public static final이 생략된 상수를 갖는다.
	void set(int date);
	int get();
	//2. inteface는 public abstract이 생략된 추상메소드를 갖는다.
}







