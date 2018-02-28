import java.util.Scanner;
import java.util.Vector;

class Input {
	private Vector<Patients> vector;
	private Scanner scan;
	
	Input(Vector<Patients> vector){
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	
	void input() throws CountException {
		int count = 0;
		char y_n = '\0';
		do{
			count++;
			if(count > 5) {
				throw new CountException("환자 정원을 초과했습니다.");
			}
			System.out.print("번호 : ");
			int no = this.scan.nextInt();
			System.out.print("진료코드 : ");
			String code = this.scan.next();
			System.out.print("입원일수 : ");
			int days = this.scan.nextInt();
			System.out.print("나 이 : ");
			int age = this.scan.nextInt();
			System.out.print("입력 / 출력 (I/O) ? : ");
			y_n = this.scan.next().charAt(0);
			Patients p = new Patients(no, code, days, age);
			this.vector.addElement(p);
		}while((y_n == 'i' || y_n == 'I'));
	}
}
