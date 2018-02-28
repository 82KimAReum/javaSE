import java.util.Stack;

public class StackDemo1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		String str = stack.pop();
		Stack<Double> stack1 = new Stack<Double>();
		stack1.push(3.14);
		double avg = stack1.pop();
	}
}
