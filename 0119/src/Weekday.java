public enum Weekday {
	SUN(100), MON(200), TUE(300), 
	WED(400), THU(500), FRI(600), 
	SAT(700);
	private final int value; 
	public Weekday(int value){
		this.value = value;
	}
	public int getValue() { return this.value; }
}
