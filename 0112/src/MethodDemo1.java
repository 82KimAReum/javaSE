public class MethodDemo1 {
	public static void main(String[] args) {
		calcSum100(30, 50);     //Call by Value(Pass by Value)
		calcSum100(5, 10);  
	}
	static void calcSum100(int start, int last){   //int start = 30, int last = 50
		int sum = 0 ;
		for(int i = start ; i <= last ; i++) sum += i;
		System.out.printf("%d부터 %d까지의 합은 %d입니다\n", start, last, sum);
	}
}
