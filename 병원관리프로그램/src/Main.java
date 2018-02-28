import java.util.Vector;

public class Main {
	private Input input;
	private Calc calc;
	private Sort sort;
	private Output output;
	private Vector<Patients> vector;
	
	private Main() {   //Constructor
		this.vector = new Vector<Patients>(1,1);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.process();
	}
	private void process() {
		try {
			this.input = new Input(this.vector);
			this.input.input();
			this.calc = new Calc(this.vector);
			this.calc.calc();
			this.sort = new Sort(this.vector);
			this.sort.quickSort(0, this.vector.size() - 1);
			this.output = new Output(this.vector);
			this.output.display();
		}catch(CountException ex) {
			System.out.println(ex.getMessage());
			System.exit(-1);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("Program is over...");
		}
	}
}
