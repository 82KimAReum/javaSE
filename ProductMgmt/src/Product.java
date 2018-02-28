public class Product {
	private String name;
	private int qty, salePrice, buyPrice, transFee, profit;
	private double rate;
	public Product(String name, int qty, int salePrice, int buyPrice, int transFee) {
		this.name = name;     	this.qty = qty;     this.salePrice = salePrice;
		this.buyPrice = buyPrice;      this.transFee = transFee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getTransFee() {
		return transFee;
	}
	public void setTransFee(int transFee) {
		this.transFee = transFee;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void display() {
		System.out.printf("%-10s\t%8d\t%8d\t%8d\t%8d\t%15d\t%8.2f\n", 
				this.name, this.qty, this.salePrice, this.buyPrice, this.transFee,
				this.profit, this.rate);
	}
}
