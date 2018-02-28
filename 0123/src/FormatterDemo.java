public class FormatterDemo {
	public static void main(String[] args) {
		int su = 128;
		System.out.printf("su = %1$o, su = %1$x\n", su);
		int kor = 90, eng = 85, mat = 100;
		System.out.printf("%3$5d%2$5d%1$5d\n", kor, eng, mat);
		/*int price = 20_000_000;
		System.out.printf("price = %d\n", price);
		System.out.printf("price = %,d\n", price);
		String irum = "Michael";
		System.out.printf("irum = %15s\n", irum);
		System.out.printf("irum = %-15s\n", irum);
		int kor = 90, eng = 85, mat = 100;
		System.out.printf("%05d%05d%05d\n", kor, eng, mat);*/
	}
}




