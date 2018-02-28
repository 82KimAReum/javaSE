import java.util.Scanner;
public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [][] array = new String[3][];
		array[0] = new String[2];
		System.out.print("학번 : ");   array[0][0] = scan.next();
		System.out.print("이름 : ");   array[0][1] = scan.next();
		array[1] = new String[1];
		System.out.print("학번 : ");   array[1][0] = scan.next();
		array[2] = new String[4];
		System.out.print("학번 : ");   array[2][0] = scan.next();
		System.out.print("이름 : ");   array[2][1] = scan.next();
		System.out.print("주소 : ");   array[2][2] = scan.next();
		System.out.print("전화번호 : ");   array[2][3] = scan.next();
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println("<<" + (i + 1) + "번째 학생정보>>");
			for(String student :  array[i]) {
				System.out.printf("%s\t\t", student);
			}
			System.out.println();
		}
	}
}
