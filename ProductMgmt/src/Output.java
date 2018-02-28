public class Output {
	private Product [] array;
	private int count;
	public Output(Product[] array, int count) {
		this.array = array;
		this.count = count;
	}
	public void print() {
		System.out.println("                                 <<상품별 판매 이익금 및 이익율표>>");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("상품명                  수량      판매단가      매입단가       운송료        이익금     이익율");
		System.out.println("-------------------------------------------------------------------------");
		for(int i = 0 ; i < this.count ; i++) {
			this.array[i].display();
		}
	}
}
