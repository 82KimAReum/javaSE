public class Calc {
	private Telephone [] array;
	public Calc(Telephone [] array) {
		this.array = array;
	}
	public void calc() {
		for(int i = 0 ; i < this.array.length ; i++) {
			int gubun = this.array[i].getGubun();
			int defaultFee = this.getDefault(gubun);
			this.array[i].setDefaultFee(defaultFee);    //기본요금
			int tongwha = this.array[i].getAmount(); 
			int fee = tongwha * 12;
			this.array[i].setFee(fee);                           //통화료계산 
			int tax = (int)((this.array[i].getDefaultFee() + fee) * 0.1);
			this.array[i].setTax(tax);                           //세금 계산
			int sum = this.array[i].getDefaultFee() + this.array[i].getFee() + this.array[i].getTax();         
			this.array[i].setSum(sum);                       //합계 계산 
		}
	}
	private int getDefault(int gubun){
		int def = 0;
		switch(gubun) {
			case 1 :  def =  6000;  break;
			case 2 :  def =  4800;  break;  
			case 3 :  def =  3000;  break;
		}
		return def;
	}
}








