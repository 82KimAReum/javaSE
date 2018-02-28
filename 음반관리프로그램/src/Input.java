import java.util.ArrayList;
import java.util.Scanner;

class Input {
	private ArrayList<Account> array;
	private Scanner scan;
	
	Input(ArrayList<Account> array){
		this.array = array;
		scan = new Scanner(System.in);
	}
	void input(){
		int count = 0;
		char y_n = '\0';
		do{
			count++;
			System.out.print("소매점번호 : ");
			int no = this.scan.nextInt();
			System.out.print("음악종류코드 : ");
			String code = this.scan.next();
			System.out.print("판매수량 : ");
			int su = this.scan.nextInt();
			System.out.print("입력/출력(I/O) : ");
			y_n = this.scan.next().charAt(0);
			Account account = new Account(no, code, su);
			this.array.add(count - 1, account);
		}while(count <= 7 && (y_n == 'i' || y_n == 'I'));
	}
}
