import java.util.Vector;

class Sort {
	private Vector<Patients> vector;

	Sort(Vector<Patients> vector) {
		this.vector = vector;
	}
	
	void quickSort(int start, int end){
		int low = start, high = end;
		Patients mid = this.vector.elementAt((start + end) / 2);
		do {
			while(this.vector.get(low).getNo() < mid.getNo()) low++;
			while(this.vector.get(high).getNo() > mid.getNo()) high--;
			if(low <= high) swap(low++, high--);
		}while(low <= high);
		if(start < high)  quickSort(start, high);
		if(low < end) quickSort(low, end);
	}
	private void swap(int front, int back) {
		Patients temp = this.vector.get(front);
		this.vector.setElementAt(this.vector.get(back), front);
		this.vector.setElementAt(temp, back);
	}
}
