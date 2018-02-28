import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String data = "1101,  한송이,   78;  89:  90,  95";
		//String [] array = data.split("\\s+");
		StringTokenizer st = new StringTokenizer(data, ",;:");
		//System.out.println(st.countTokens());
		String [] array = new String[st.countTokens()];
		for(int i = 0; i < array.length ; i++) {
			array[i] = st.nextToken();
		}
		System.out.println(array[1]);
	}
}






