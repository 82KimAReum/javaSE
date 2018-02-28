public class Output {
	private Telephone [] array;
	public Output(Telephone [] array) {
		this.array = array;
	}
	public void display() {
		for(Telephone phone : this.array) {
			System.out.printf("%3d\t%12s\t%12s\t%8d\t%8d\t%8d\t%10d\n", 
				phone.getGubun(), phone.getTel(), phone.getIrum(),
				phone.getDefaultFee(), phone.getFee(), phone.getTax(),
				phone.getSum());
		}
	}
}
