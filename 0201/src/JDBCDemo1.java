import java.util.Scanner;
import java.util.Vector;

public class JDBCDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾고자 하시는 읍/면/동 이름을 넣어주세요 : ");
		String dongName = scan.next();
		Vector<ZipcodeVO> vector = SelectController.select(dongName);
		for(int i = 0 ; i < vector.size() ; i++) {
			System.out.println(vector.get(i));
		}
	}
}



