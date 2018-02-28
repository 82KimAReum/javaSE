import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		String [] array = {"JavaSE", "Oracle", "HTML5", "CSS3", "JavaScript", "jQuery"};
		Stack stack = new Stack();
		for(int i = 0 ; i < array.length ; i++) stack.push(array[i]);
		Enumeration enums = stack.elements();
		while(enums.hasMoreElements()) {
			System.out.println(enums.nextElement());
		}
		/*System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());*/
	}
}
