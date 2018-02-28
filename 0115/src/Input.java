import java.util.Scanner;

public class Input {
	public void input(Student s) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");   String hakbun = scan.next();      s.setHakbun(hakbun);
		System.out.print("이름 : ");   String irum = scan.next();           s.setIrum(irum);
		System.out.print("국어 : ");   s.setKor(scan.nextInt());
		System.out.print("영어 : ");   s.setEng(scan.nextInt());
		System.out.print("수학 : ");   s.setMat(scan.nextInt());
	}
}
