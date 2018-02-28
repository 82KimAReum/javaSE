public class MethodDemo {
	public static void main(String[] args) {
		calcSum100();     //Call by Name(Pass by Name)
		calcSum100();
		//calcSum100();
		//calcSum100();
	}
	static void calcSum100(){
		int sum = 0 ;
		for(int i = 1 ; i < 101 ; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
