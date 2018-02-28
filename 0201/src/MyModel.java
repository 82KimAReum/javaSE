import java.util.Vector;

import javax.swing.table.DefaultTableModel;
public class MyModel extends DefaultTableModel {
	private Vector<ZipcodeVO> vector;
	public MyModel(Vector<ZipcodeVO> vector) {
		this.vector = vector;
		this.setDataVector(getData(), getColumnVector());
	}
	private Vector<Object> getData(){
		Vector<Object> dataVector = new Vector<Object>(1,1);
		Vector<String> rowVector = new Vector<String>(1,1);
		for(int i = 0; i < this.vector.size() ; i++) {
			ZipcodeVO zip = this.vector.get(i);
			rowVector.addElement(zip.getZipcode());
			rowVector.addElement(zip.getSido());
			rowVector.addElement(zip.getGugun());
			rowVector.addElement(zip.getDong());
			rowVector.addElement(zip.getBunji());
			dataVector.addElement(rowVector);
		}
		return dataVector;
	}
	private Vector<String> getColumnVector(){
		String [] headers = {"우편번호", "시/도", "구/군", "읍/면/동", "번지"};
		Vector<String> colVector = new Vector<String>(1,1);
		for(String str : headers) colVector.addElement(str);
		return colVector;
	}
}




