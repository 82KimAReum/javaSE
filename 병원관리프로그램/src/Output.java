import java.util.Vector;

class Output {
	private Vector<Patients> vector;
	
	Output(Vector<Patients> vector){
		this.vector = vector;
	}
	
	void display(){
		this.printLabel();
		for(Patients p : this.vector) {
			System.out.printf("%2d\t%8s\t%12d\t%10d\t%10d\n",
					p.getNo(), p.getDepartment(), p.getJinchalfee(), p.getIpwonfee(), p.getSum());
		}
		this.printDash();
	}
	
	private void printDash(){
		for(int i = 0 ; i < 50 ; i++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	private void printLabel(){
		System.out.println("            <<병원관리프로그램>>");
		this.printDash();
		System.out.println("번호       진찰부서       진찰비       입원비       진료비");
		this.printDash();
	}
}
