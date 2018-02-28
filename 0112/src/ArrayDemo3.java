//Array's copy : 주소복사, 값복사
public class ArrayDemo3 {
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5};
		int [] copy = {3,4};
		copy = original;     //주소복사
		System.out.println("original[0] = " + original[0]);
		System.out.println("copy[0] = " + copy[0]);
		original[0] += 100;
		System.out.println("original[0] = " + original[0]);
		System.out.println("copy[0] = " + copy[0]);
	}
}
