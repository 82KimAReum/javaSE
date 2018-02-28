class Janre {
	private String name;  //쟝르종류
	private int kyonggi;      //경기지역판매액
	private int youngnam;   //영남지역판매액
	private int choongchung;   //충청지역판매액
	private int num;                //판매량
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getKyongi() {
		return kyonggi;
	}
	void setKyonggi(int kyonggi) {
		this.kyonggi = kyonggi;
	}
	int getYoungnam() {
		return youngnam;
	}
	void setYoungnam(int youngnam) {
		this.youngnam = youngnam;
	}
	int getChoongchung() {
		return choongchung;
	}
	void setChoongchung(int choongchung) {
		this.choongchung = choongchung;
	}
	int getNum() {
		return num;
	}
	void setNum(int num) {
		this.num = num;
	}
}
