import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class SelectController {
	public static ResultSet selectCity(String countrycode) {
		ResultSet rs = null;
		try {
			rs = CountryDAO.selectCity(countrycode);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return rs;
	}
	
	
	public static Vector<String> selectCountryCode() {
		Vector<String> vector = null;
		try {
			vector = CountryDAO.selectCountryCode();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return vector;
	}

}
