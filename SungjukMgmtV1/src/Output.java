
public class Output {
	private Student [] array;
	public Output(Student [] array) {
		this.array = array;
	}
	public void print() {
		for(Student s : this.array) {
			s.display();
		}
	}
}
