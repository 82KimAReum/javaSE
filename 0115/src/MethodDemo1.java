//Recursive Call
public class MethodDemo1 {
	public static void main(String[] args) {
		int n = 8;
		System.out.println(n  + " 번째 값은 " + fibonacci(n));
	}
	static int fibonacci(int  n) {
		if(n <= 2) return 1;
		else return (fibonacci(n - 1) + fibonacci(n - 2));
	}
}



