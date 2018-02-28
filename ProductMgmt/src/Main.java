public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Product [] array = input.input();
		int count = input.getCount();
		Calc calc = new Calc(array, count);
		calc.calc();
		Output output = new Output(array, count);
		output.print();
	}
}
