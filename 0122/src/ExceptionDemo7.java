
public class ExceptionDemo7 {
	public static void main(String[] args) {
		Student chulsu = null;
		try{
			chulsu = new Student(105, 110);
			System.out.println(chulsu);
		}catch(KoreanException | EnglishException ex) {
			System.out.println(ex.getMessage());
		}
	}
}



