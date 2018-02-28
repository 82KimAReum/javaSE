public class MethodDemo8 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum += getSum(i);
		}
		System.out.println("sum = " + sum);
	}
	static int getSum(int max) {
		int sum = 0;   for(int i = 1 ; i <=max ; i++) sum += i;
		return sum;
	}
}
