public class Sort {
	private Telephone [] array;
	public Sort(Telephone[] array) {
		this.array = array;
	}
	public void bubbleSort() {}
	public void selectionSort() {}
	public void insertionSort() {
		int i, j;
		Telephone key;
		for(i = 1 ; i < this.array.length ; i++) {
			key = this.array[i];
			for(j = i -1 ; j >= 0 && key.getSum() > this.array[j].getSum() ; j--) {
				this.array[j+1] = this.array[j];
			}
			this.array[j+1] = key;
		}
	}
	
}








