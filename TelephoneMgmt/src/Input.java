import java.util.Scanner;

public class Input {
	private Scanner scan;
	private Telephone [] array;
	public Input(Telephone [] array) {   
		this.scan = new Scanner(System.in);      this.array = array;
	}
	public void input() {
		for(int i = 0 ; i < this.array.length ; i++) {
			System.out.print("구분 : ");         int gubun =  this.scan.nextInt();
			System.out.print("전화번호 : ");   String tel = this.scan.next();
			System.out.print("성명 : ");          String irum = this.scan.next();
			System.out.print("통화량 : ");       int amount = this.scan.nextInt();
			Telephone phone = new Telephone(gubun, tel, irum, amount);
			this.array[i] = phone;
		}
	}
}





