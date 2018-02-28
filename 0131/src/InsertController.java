import java.sql.SQLException;

public class InsertController {
	public static int insert(StudentVO s) {
		int row = 0;
		try {
			row = StudentDAO.insert(s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
}
