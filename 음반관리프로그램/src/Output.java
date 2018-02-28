import java.util.ArrayList;
import java.util.Vector;

class Output {
	private ArrayList<Account> array;
	private Vector<Janre> vector;
	
	Output(ArrayList<Account> array, Vector<Janre> vector){
		this.array = array;
		this.vector = vector;
	}
	
	void display(){
		int total = 0;
		System.out.println("                            <<음반관리 프로그램>>");
		writeDash();
		System.out.println("종류            경기지역판매액            영남지역판매액            충청지역판매액        판매량");
		writeDash();
		for(int i = 0 ; i < this.vector.size() ; i++){
			System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\n",
					this.vector.elementAt(i).getName(), this.vector.elementAt(i).getKyongi(),
					this.vector.elementAt(i).getYoungnam(), this.vector.elementAt(i).getChoongchung(),
					this.vector.elementAt(i).getNum());
			total += this.vector.elementAt(i).getNum();
		}
		writeDash();
		System.out.println("\n");
		System.out.println("총합계판매량 : " + total);
		System.out.println("입력데이터");
		write();
	}
	
	private void writeDash(){
		for(int i = 0 ; i < 75 ; i++) System.out.print("-");
		System.out.println();
	}
	
	private void write(){
		for(int i = 0 ; i < this.array.size() ; i++){
			System.out.printf("%d\t%s\t%d\n", 
					this.array.get(i).getBunho(), this.array.get(i).getCode(),
					this.array.get(i).getSu());
		}
	}
}
