import java.util.Arrays;

public class ArrayDemo6 {
	public static void main(String[] args) {
		int [] array = {4,7,1,9,2,4,6,0,2};
		for(int su : array) System.out.printf("%d\t", su);
		System.out.println();
		Arrays.sort(array);
		for(int su : array) System.out.printf("%d\t", su);
	}
}
