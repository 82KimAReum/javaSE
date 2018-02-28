import java.util.ArrayList;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		ArrayList<Account> array = new ArrayList<Account>(7);
		Input input = new Input(array);
		input.input();
		Vector<Janre> vector = new Vector<Janre>(4);
		Calc calc = new Calc(array, vector);
		calc.calc();
		Output out = new Output(array, vector);
		out.display();
	}
}
