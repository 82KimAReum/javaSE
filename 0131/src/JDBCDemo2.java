import java.util.Vector;

public class JDBCDemo2 {
	public static void main(String[] args) {
		Vector<StudentVO> vector = SelectController.selectAll();
		if(vector == null) 
			System.out.println("현재 학생이 등록되어 있지 않습니다.");
		else {
			for(int i = 0 ; i < vector.size() ; i++) {
				vector.elementAt(i).display();
			}
		}
	}
}




