package com.swacademy.libs.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.swacademy.libs.model.PatientsVO;

public class PatientsAddAction implements ActionListener {
	private JPanel panel;
	private JTextField tfNo, tfCode, tfDays, tfAge;
	
	public PatientsAddAction(JPanel panel,
			                              JTextField tfNo, JTextField tfCode, JTextField tfDays, JTextField tfAge){
		this.panel = panel;
		this.tfNo = tfNo;           this.tfCode = tfCode;
		this.tfDays = tfDays;     this.tfAge = tfAge;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PatientsVO p = new PatientsVO(Integer.parseInt(this.tfNo.getText().trim()),
				                               this.tfCode.getText().trim(),
				                               Integer.parseInt(this.tfDays.getText().trim()),
				                               Integer.parseInt(this.tfAge.getText().trim()));
		this.tfNo.setText("");  
		this.tfCode.setText("");
		this.tfDays.setText("");
		this.tfAge.setText("");
		new PatientsCalc(p);        //방금 입력한 환자 계산하기
		int row = InsertController.insert(p);
		if(row == 1) JOptionPane.showMessageDialog(this.panel, "환자가 성공적으로 추가됐습니다.",
				                                           "메시지", JOptionPane.INFORMATION_MESSAGE);
	}
}
