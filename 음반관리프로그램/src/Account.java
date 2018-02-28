class Account {
	private int bunho;  //소매점 번호
	private String code;  //음악종류코드 
	private int su;         //판매수량 
	
	Account(int bunho, String code, int su) {
		this.bunho = bunho;
		this.code = code;
		this.su = su;
	}
	
	int getBunho() {
		return bunho;
	}
	String getCode() {
		return code;
	}
	int getSu() {
		return su;
	}
}
