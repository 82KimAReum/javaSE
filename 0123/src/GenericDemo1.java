import java.util.Stack;

public class GenericDemo1 {
	public static void main(String[] args) {
		//String str = "Hello";
		//Object obj = str;
		//Stack<Object> obj = new Stack<String>();
		/*Stack raw = new Stack();
		raw.push(100);
		raw.push(3.14);
		raw.push(new Sonata("Black Sonata"));
		int su = raw.pop();
		System.out.println();*/
		//Stack<?> stack = new Stack<String>();
		//Stack<?> stack1 = new Stack<Double>();
		Stack<? super Number> stack = new Stack<Object>();
		Stack<? extends Number> stack1 = new Stack<Integer>();
		Stack<? extends Number> stack2 = new Stack<String>();
		
	}
}








