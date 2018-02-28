package com.swacademy.libs.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.swacademy.libs.model.EmployeeVO;

public class MyAction implements ActionListener {
	private JTextField tfSabun, tfName;
	private ButtonGroup group;
	private JComboBox<Integer> cbNight, cbFamily;
	private JPanel p;
	private JTabbedPane tab;
	public MyAction(JPanel p, JTabbedPane tab, 
			JTextField tfSabun, JTextField tfName, ButtonGroup group,
			JComboBox<Integer> cbNight, JComboBox<Integer> cbFamily) {
		this.p = p;
		this.tab = tab;
		this.tfSabun = tfSabun;
		this.tfName = tfName;
		this.group = group;
		this.cbNight = cbNight;
		this.cbFamily = cbFamily;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			if(e.getActionCommand().equals("INPUT")){
				this.input();
			}else if(e.getActionCommand().equals("CLEAR")){
				this.tfSabun.setText("");  this.tfName.setText("");
			}
		}catch(EmployeeException ex){
			JOptionPane.showMessageDialog(p, ex.getMessage(), 
					            "Warning", JOptionPane.ERROR_MESSAGE);
				this.tab.transferFocus();
		}catch(EmployeeOverValueException ex){
			JOptionPane.showMessageDialog(p, ex.getMessage(), 
		            "Warning", JOptionPane.ERROR_MESSAGE);
			this.tfSabun.setText("");
			this.tab.transferFocus();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(p, ex.getMessage(), 
		            "Warning", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void input() throws EmployeeException, EmployeeOverValueException {
		if(!checkLengthInput()) 
			throw new EmployeeException("값이 없습니다."); 
		else if(!checkOverValue())
			throw new EmployeeOverValueException(
					"사원번호의 길이가 맞지 않습니다.");
		else {
			String sabun = this.tfSabun.getText().trim();
			String name = this.tfName.getText().trim();
			Enumeration<AbstractButton> enums = this.group.getElements();
			int gibonCode = 0;
			while(enums.hasMoreElements()){
				AbstractButton ab = enums.nextElement();
				JRadioButton jb = (JRadioButton)ab;
				if(jb.isSelected()) 
					gibonCode = Integer.parseInt(jb.getText().trim());
			}
			int nighthour = this.cbNight.getSelectedIndex();
			int family = this.cbFamily.getSelectedIndex();
			EmployeeVO emp = new EmployeeVO(sabun, name, gibonCode, nighthour, family);
			Calc calc = new Calc(emp);
			calc.calc();
			this.tfSabun.setText("");
			this.tfName.setText("");
			while(enums.hasMoreElements()){
				AbstractButton ab = enums.nextElement();
				JRadioButton jb = (JRadioButton)ab;
				jb.setSelected(false);
			}
			this.cbNight.setSelectedIndex(0);
			this.cbFamily.setSelectedIndex(0);
			int row = InsertController.insert(emp);
			if(row == 1)
				JOptionPane.showMessageDialog(p, "사원정보가 추가됐습니다.",
						"Information", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	private boolean checkOverValue(){
		boolean isTruth = false;
		if(this.tfSabun.getText().length() == 4) isTruth = true;
		else isTruth = false;
		return isTruth;
	}
	private boolean checkLengthInput()  {
		boolean isTruth = false;
		int count = 0, num = 0, su = 0;
		Enumeration<AbstractButton> enums = this.group.getElements();
		if(this.tfSabun.getText().length() > 0) isTruth = true;
		while(enums.hasMoreElements()){
			JRadioButton jb = (JRadioButton)enums.nextElement();
			if(jb.isSelected()) count++;
		}
		if(this.cbNight.getSelectedIndex() != 0) num = 1;
		if(this.cbFamily.getSelectedIndex() != 0) su = 1;
		if(isTruth && count > 0 && num > 0 && su > 0) isTruth = true;
		else isTruth = false;
		return isTruth;
	}
}








