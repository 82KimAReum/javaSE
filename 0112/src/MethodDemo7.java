public class MethodDemo7 {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 50 ; i++) {
			if(isPrime(i)) System.out.printf("%5d", i);
		}
	}
	static boolean isPrime(int su) {
		boolean flag = true;
		for(int i = 2 ; i < su ; i++) {
			if(su % i == 0) {
				flag = false;  break; 
			}
		}
		return flag;
	}
}
