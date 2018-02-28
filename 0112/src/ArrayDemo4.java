//배열의 값복사 
public class ArrayDemo4 {
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5};
		int [] copy = {7,8,9};
		System.arraycopy(original, 0, copy, 0, 3);
		System.out.printf("Before Change >> %d, %d\n", original[0], copy[0]);
		original[0] += 100;
		System.out.printf("After Change >> %d, %d\n", original[0], copy[0]);
	}
}
