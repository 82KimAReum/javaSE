import java.sql.SQLException;
import java.util.Vector;

public class SelectController {
	public static Vector<StudentVO> selectAll(){
		Vector<StudentVO> vector = null;
		try {
			vector = StudentDAO.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vector;
	}
}
