
public class GenericDemo2 {
	public static void main(String[] args) {
		Sonata sonata1 = new Sonata("Black Sonata", 20_000_000);
		Sonata sonata2 = new Sonata("Red Sonata", 15_000_000);
		Sonata sonata3 = new Sonata("Silver Sonata", 25_000_000);
		Sonata [] array = {sonata1, sonata2, sonata3};
		sort(array);
		display(array);
	}
	static <T> void display(T [] array) {
		for(T t : array) {
			Sonata sonata = (Sonata)t;
			System.out.println(sonata.getName());
		}
	}
	static <T extends Comparable<T>> void sort(T [] array) {
		for(int i = 0 ; i < array.length - 1 ; i++) {
			for(int j = 0 ; j < array.length - 1 - i ; j++) {
				if(array[j].compareTo(array[j+1]) < 0) {
					Sonata temp = (Sonata)array[j];
					array[j] = array[j+1];
					array[j+1] = (T) temp;
				}
			}
		}
	}
}
