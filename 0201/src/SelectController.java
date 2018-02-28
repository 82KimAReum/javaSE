import java.sql.SQLException;
import java.util.Vector;

public class SelectController {
	public static Vector<ZipcodeVO> select(String dongName){
		Vector<ZipcodeVO> vector = null;
		try {
			vector = ZipcodeDAO.select(dongName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vector;
	}
}
