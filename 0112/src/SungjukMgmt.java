/*
 * Version : 3.0
 */
import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		SungjukMgmt sm = new SungjukMgmt();
		Student s = new Student();      sm.input(s);   sm.calc(s);   sm.print(s);
	}
	void input(Student s) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");   s.hakbun = scan.next();
		System.out.print("이름 : ");   s.irum = scan.next();
		System.out.print("국어 : ");   s.kor = scan.nextInt();
		System.out.print("영어 : ");   s.eng = scan.nextInt();
		System.out.print("수학 : ");   s.mat = scan.nextInt();
	}
	void calc(Student s) {
		s.sum = s.kor + s.eng + s.mat;      s.avg = s.sum / 3.0;
		s.grade = (s.avg <= 100 && s.avg >= 90) ? 'A' : 
			                        (s.avg < 90 && s.avg >= 80) ? 'B' :
			                        	    (s.avg < 80 && s.avg >= 70) ? 'C' :
			                        	    	    (s.avg < 70 && s.avg >= 60) ? 'D' : 'F';
	}
	void print(Student s) {
		System.out.println("******** 성적관리프로그램***********");
		System.out.println("학번                          이름      국어   영어   수학   총점   평균   평점");
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",
				  s.hakbun, s.irum, s.kor, s.eng, s.mat, s.sum, s.avg, s.grade);
	}
}




