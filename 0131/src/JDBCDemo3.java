public class JDBCDemo3 {
	public static void main(String[] args) {
		//1103     그리운     76     56     87    78
		StudentVO s = new StudentVO("1103", "그리운",
				76, 56, 87, 78);
		int row = InsertController.insert(s);
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
	}
}
