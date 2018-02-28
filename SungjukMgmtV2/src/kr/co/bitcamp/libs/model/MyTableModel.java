package kr.co.bitcamp.libs.model;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
	private Vector<StudentVO> vector;

	public MyTableModel(Vector<StudentVO> vector) {
		this.vector = vector;
		Vector<String> headers = new Vector<String>(1,1);
		String [] array = {"학번", "이름", "국어", "영어", "수학", "전산", 
				                    "총점", "평균", "학점"};
		for(String str : array) headers.addElement(str);
		this.setDataVector(getVector(), headers);
	}
	private Vector<Object> getVector(){
		Vector<Object> v = new Vector<Object>(1,1);
		for(int i = 0 ; i < this.vector.size() ; i++) {
			Vector<String> lineVector = new Vector<String>(1,1);
			StudentVO s = this.vector.elementAt(i);
			lineVector.addElement(s.getHakbun());
			lineVector.addElement(s.getIrum());
			lineVector.addElement(s.getKor() + "");
			lineVector.addElement(String.valueOf(s.getEng()));
			lineVector.addElement(String.valueOf(s.getMat()));
			lineVector.addElement(String.valueOf(s.getEdp()));
			lineVector.addElement(String.valueOf(s.getSum()));
			lineVector.addElement(String.valueOf(s.getAvg()));
			lineVector.addElement(String.valueOf(s.getGrade()));
			v.add(lineVector);
		}
		return v;
	}
}





