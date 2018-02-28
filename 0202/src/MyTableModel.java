import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
	private String code;

	public MyTableModel(String code) {
		this.code = code;
		ResultSet rs = SelectController.selectCity(code);
		Vector<String> columnIdentifiers = new Vector<String>(1,1);
		String [] array = {"ID", "도시명", "국가코드", "지역", "인구"};
		for(String str : array)   columnIdentifiers.addElement(str);
		this.setDataVector(getDataVector(rs), columnIdentifiers);
	}
	private Vector<Object> getDataVector(ResultSet rs){
		Vector<Object> vector = new Vector<Object>(1,1);  //2차원 벡터  
		try {
			while(rs.next()) {
				Vector<String> rowVector = new Vector<String>(1,1);  //1차원 벡터
				rowVector.addElement(String.valueOf(rs.getInt("id")));
				rowVector.addElement(rs.getString("name"));
				rowVector.addElement(rs.getString("countrycode"));
				rowVector.addElement(rs.getString("district"));
				rowVector.addElement(String.format("%,d", rs.getInt("population")));
				vector.addElement(rowVector);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
			}catch(SQLException ex) {}
		}
		return vector;
	}
	
}
