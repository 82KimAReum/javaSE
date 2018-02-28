package com.swacademy.libs.model;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel{
	private Vector<PatientsVO> vector;
	private JTable table;
	public MyTableModel(JTable table, Vector<PatientsVO> vector){
		this.table = table;
		this.vector = vector;
		dataAddToTable();
	}
	private void dataAddToTable(){
		String [] columnArray = {"번호", "진료부서", "진찰비", "입원비", "진료비"};
		Vector<String> colVector = new Vector<String>(1,1);
		for(String str : columnArray) colVector.addElement(str);
		Vector<Object> dataVector = new Vector<Object>(1,1);
		for(int i = 0 ; i < this.vector.size(); i++){
			PatientsVO p = this.vector.get(i);
			Vector<String> row = new Vector<String>(1,1);
			row.addElement(String.valueOf(p.getNo()));
			row.addElement(p.getDepartment());
			row.addElement(String.valueOf(p.getJinchalfee()));
			row.addElement(String.valueOf(p.getIpwonfee()));
			row.addElement(String.valueOf(p.getSum()));
			dataVector.addElement(row);
		}
		this.setDataVector(dataVector, colVector);
	}
}