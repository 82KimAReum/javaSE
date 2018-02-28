public class MethodDemo2 {
	public static void main(String[] args) {
		int start = 30, end = 50;
		int sum = calcSum100(start, end);     //Call by Value(Pass by Value)
		System.out.printf("%d부터 %d까지의 합은 %d입니다. \n", start, end, sum);
		start = 5;   end = 10;
		sum = calcSum100(start ,end );
		System.out.printf("%d부터 %d까지의 합은 %d입니다. \n", start, end, sum);
	}
	static int calcSum100(int start, int last){   //int start = 30, int last = 50
		int sum = 0 ;
		for(int i = start ; i <= last ; i++) sum += i;
		return sum;
	}
}
