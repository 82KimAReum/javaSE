import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Input {
	private Scanner scan;
	private Student [] array;
	public Input(Student [] array) {
		this.array = array;
		File file = new File("sungjuk_utf8.dat");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("지정하신 파일을 찾을 수 없습니다.");   System.exit(-1);
		}
	}
	public void input() {
		for(int i = 0 ; i < this.array.length ; i++) {
			String line = this.scan.nextLine();   //﻿1101     한송이     78     87     83    78
			String [] myarray = line.split("\\s+");
			Student s = new Student(myarray[0], myarray[1],  
					                                Integer.parseInt(myarray[2]),    //"78" --> 78 
					                                Integer.parseInt(myarray[3]),
					                                Integer.parseInt(myarray[4]),
					                                Integer.parseInt(myarray[5]));
			this.array[i] = s;
		}
	}
}



