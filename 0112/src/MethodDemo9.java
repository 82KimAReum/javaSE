import java.util.Scanner;

public class MethodDemo9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 숫자를 입력하세요 : ");
		int first = scan.nextInt();     int second = scan.nextInt();
		int gcd = getGCD(first, second);
		int lcm = gcd * (first / gcd) * (second / gcd);
		System.out.println("GCD = " + gcd + ", LCM = " + lcm);
	}
	static int getGCD(int first, int second) {
		int gcd = 1;
		for(int i = 2 ; i <= first ; i++) {
			if(first % i == 0 && second % i == 0) gcd = i;
		}
		return gcd;
	}
}
