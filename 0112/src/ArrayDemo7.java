//Selection Sorting
public class ArrayDemo7 {
	public static void main(String[] args) {
		int [] array = {4, 6, 8, 2, 3, 8, 1, 4, 6};
		System.out.println("<<Before Sorting>>");
		for(int su : array) System.out.printf("%6d", su);
		System.out.println();
		for(int i = 0 ; i < array.length - 1 ; i++)
			for(int j = i + 1 ; j < array.length ; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];    array[i] = array[j];   array[j] = temp;
				}
			}
		System.out.println("<<After Sorting>>");
		for(int su : array) System.out.printf("%6d", su);
	}
}
