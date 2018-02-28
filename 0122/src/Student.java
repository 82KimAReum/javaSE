public class Student {
	private int kor, eng;
	public Student(int kor, int eng) throws KoreanException, EnglishException{
		if(kor >= 0 && kor <= 100) this.kor = kor;
		else throw new KoreanException("국어 점수는 0부터 100점까지...");
		if(eng >= 0 && eng <= 100) this.eng = eng;
		else throw new EnglishException("영어 점수는 0부터 100점까지...");
	}
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + "]";
	}
}
