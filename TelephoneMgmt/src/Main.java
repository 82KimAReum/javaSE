public class Main{
	public static void main(String[] args) {
		Telephone [] array = new Telephone[10];
		Input1 iput = new Input1(array);                iput.input();
		Calc calc = new Calc(array);                 calc.calc();
		Sort sort = new Sort(array);                  sort.insertionSort();
		Output oput = new Output(array);         oput.display();
	}
}