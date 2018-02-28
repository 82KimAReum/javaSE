import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Input1 {
	private Scanner scan;
	private Telephone [] array;
	public Input1(Telephone [] array) {
		this.array = array;
		File file = new File("input.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			javax.swing.JOptionPane.showMessageDialog(null, "File Not Found");
			System.exit(-1);
		}
	}
	public void input() {
		for(int i = 0 ; i < this.array.length ; i++) {
			String line = this.scan.nextLine();     //2   422-5123   박은지    1084
			String [] myarray = line.split("\\s+");         //System.out.println(myarray[2]);
			Telephone phone = new Telephone(Integer.parseInt(myarray[0]),
					                                                 myarray[1], myarray[2], 
					                                                 Integer.parseInt(myarray[3]));
			this.array[i] = phone;
			/*
			 * Java에서 문자열을 parsing 하는 방법 3가지
			 * 1) String class의 split()
			 * 2) java.util.StringTokenizer class
			 * 3) java.util.Scanner class
			 */
		}
	}
}



