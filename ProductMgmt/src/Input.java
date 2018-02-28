import java.util.Scanner;
public class Input {
	private Scanner scan;
	private int count;
	public Input() {
		this.scan = new Scanner(System.in);    count = 0;
	}
	public int getCount() { return this.count;  }
	public Product [] input() {
		char y_n = '\0';
		Product [] array = new Product[100];
		do {
			System.out.print("상품명 : ");    String name = this.scan.next();
			System.out.print("수량 : ");       int qty = this.scan.nextInt();
			System.out.print("판매단가 : ");  int salePrice = this.scan.nextInt();
			System.out.print("매입단가 : ");   int buyPrice = this.scan.nextInt();
			System.out.print("운송 : ");        int transFee = this.scan.nextInt();
			Product p = new Product(name, qty, salePrice, buyPrice, transFee);
			array[count++] = p;
			System.out.print("Again(y/n)? : ");  
			y_n = this.scan.next().charAt(0);
		}while(y_n == 'y' || y_n == 'Y');
		return array;
	}
}
