import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수형 배열 방 갯수 : ");
		int size = scan.nextInt();
		try {
			int [] array = new int[size];
			System.out.println("Array's size = " + array.length);
		}catch(Exception ex) {
			System.out.println("분모는 0이 되면 안됩니다.");
		}catch(NullPointerException ex) {
			System.out.println("NullPointerException");
		}catch(NegativeArraySizeException ex) {
			System.out.println("NegativeArraySizeException");
		}
	}
}








