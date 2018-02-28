//key가 크면 내림차순,
public class InsertionSorting {
	public static void main(String[] args) {
		int [] array = {4,8,1,3,9,2,5};     print(array);
		insertionSort(array);                 print(array);
	}
	static void insertionSort(int [] array) {
		int i, j, key;
		for(i = 1 ; i < array.length ; i++) {
			key = array[i];   
			for(j = i -1 ; j >= 0 && key > array[j] ; j--) {   //제일 중요함. 
				array[j + 1] = array[j];
			}
			array[j + 1] = key;
		}
	}
	static void print(int [] array) {
		for(int su : array) System.out.printf("%5d", su);
		System.out.println();
	}
}
