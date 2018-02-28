public class ExceptionDemo5 {
	public static void main(String[] args) {
		int [] array;
		try {
			//array = new int[-4];
			System.out.println(4  / 0);
		}catch(Exception ex) {
			//System.out.println(ex);  //ex.toString()
			ex.printStackTrace();
		}
	}
}
