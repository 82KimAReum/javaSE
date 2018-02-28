public class ExceptionDemo4 {
	public static void main(String[] args)  {
		Test t = null;
		try{
			t = new Test(110);  System.out.println(t);
		}catch(Exception ex) {
			javax.swing.JOptionPane.showMessageDialog(null, 
					                          ex.getMessage());
			//System.out.println(ex.getMessage());
		}
	}
}
class Test{
	private int kor;
	public Test(int kor)  throws Exception {
		if(kor >= 0 && kor <= 100) this.kor = kor;
		else throw new Exception("국어 점수는 0부터 100점까지입니다.");
	}
	@Override
	public String toString() {
		return String.format("kor = %d", this.kor);
	}
}









