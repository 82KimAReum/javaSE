public class Telephone{
	private int gubun, amount;
	private String tel, irum;
	private int defaultFee, fee, tax, sum;
	public Telephone(int gubun, String tel, String irum, int amount) {
		this.gubun = gubun;
		this.amount = amount;
		this.tel = tel;
		this.irum = irum;
	}
	public int getGubun() {
		return gubun;
	}
	public void setGubun(int gubun) {
		this.gubun = gubun;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getDefaultFee() {
		return defaultFee;
	}
	public void setDefaultFee(int defaultFee) {
		this.defaultFee = defaultFee;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}