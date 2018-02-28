import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		String str = "1101   한송이   78   89  90  100";
		//String [] array = str.split("\\s+");
		/*StringTokenizer st = new StringTokenizer(str);
		String [] array = new String[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens())   array[i++] = st.nextToken();*/
		Scanner scan = new Scanner(str).useDelimiter("\\s+");
		String hakbun = scan.next();    	String irum = scan.next();
		int kor = scan.nextInt();   int eng = scan.nextInt();
		System.out.println(irum + ", kor = " + kor);
	}
}



