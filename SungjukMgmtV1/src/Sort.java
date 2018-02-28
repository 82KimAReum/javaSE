public class Sort {
	private Student [] array;
	public Sort(Student[] array) {
		this.array = array;
	}
	public void selectionSort() {
		for(int i = 0 ; i < this.array.length - 1 ; i++) {
			for(int j = i + 1 ; j < this.array.length ; j++) {
				if(this.array[i].getSum() > this.array[j].getSum()) {
					int ranking = this.array[j].getRanking();
					ranking++;
					this.array[j].setRanking(ranking);
				}else if(this.array[i].getSum() < this.array[j].getSum()) {
					int ranking = this.array[i].getRanking();
					ranking++;
					this.array[i].setRanking(ranking);
				}
			}
		}
	}
	public void insertSort() {
		int i, j;
		Student key;
		for(i = 1 ; i < this.array.length ; i++) {
			key = this.array[i]; 
			for(j = i -1 ; j >= 0 && key.getSum() > this.array[j].getSum() ; j--) {
				this.array[j+1] = this.array[j];
			}
			this.array[j+1] = key;
		}
	}
	public void bubbleSort() {
		for(int i = 0 ; i < this.array.length - 1 ; i++) {
			for(int j = 0 ; j < this.array.length - 1 - i ; j++) {
				if(this.array[j].getSum() <  this.array[j+1].getSum()) {
					Student temp = this.array[j];
					this.array[j] = this.array[j+1];
					this.array[j+1] = temp;
				}
			}
		}
	}
}



