/*
 * Version : 4.0
 */
import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student s = new Student();   
		Input input = new Input();     input.input(s);
		Calc calc = new Calc();     calc.calc(s);
		new Output().print(s);
	}
}




