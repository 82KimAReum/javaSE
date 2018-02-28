public class Calc {
	private int count;
	private Product [] array;
	public Calc(Product[] array, int count) {
		this.array = array;    this.count = count;
	}
	public void calc() {
		for(int i = 0 ; i < this.count ; i++) {
			Product p = this.array[i];
			int saleMoney = p.getQty() * p.getSalePrice();   //판매금액
			int buyMoney = p.getQty() * p.getBuyPrice();    //매입금액
			int profit = saleMoney - (buyMoney + p.getTransFee());    //이익금
			double rate = (double)profit / buyMoney * 100;
			p.setProfit(profit);    p.setRate(rate);
		}
	}
}
