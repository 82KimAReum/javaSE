package com.swacademy.libs.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.swacademy.libs.controller.MyAction;
import com.swacademy.libs.model.EmployeeVO;

public class InputView extends JPanel {
	private JPanel pTemp, pSouth, pCenter, pWest;
	private JLabel labelSabun, labelName, labelGibonCode, labelNightHour, labelFamily;
	private JTextField tfSabun, tfName;
	private JButton btnInput, btnClear;
	private JRadioButton rb1, rb2, rb3, rb4;
	private ButtonGroup group;
	private JComboBox<Integer> cbNight, cbFamily;
	private Font font;
	private JTabbedPane tab;
	InputView(JTabbedPane tab, Font font){
		this.tab = tab;
		this.font = font;
		pWest = getWest();
		pCenter = getCenter();
		pSouth = getSouth();
		pTemp = new JPanel();
		pTemp.setLayout(new BorderLayout());
		pTemp.setBorder(new TitledBorder(
				new LineBorder(Color.RED, 1, true),"사원번호입력"));
		pTemp.add(pCenter, "Center");
		pTemp.add(pWest, "West");
		pTemp.add(pSouth, "South");
		this.add(pTemp);
	}
	private JPanel getWest(){
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1,0,10));
		p.add(labelSabun = new JLabel("사원번호 : "));
		labelSabun.setFont(font);
		p.add(labelName = new JLabel("이름 : "));
		labelName.setFont(font);
		p.add(labelGibonCode = new JLabel("기본급코드 : "));
		labelGibonCode.setFont(font);
		p.add(labelNightHour = new JLabel("야간시간 : "));
		labelNightHour.setFont(font);
		p.add(labelFamily = new JLabel("가족수 : "));
		labelFamily.setFont(font);
		return p;
	}
	private JPanel getCenter(){
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1,0,10));
		p.add(tfSabun = new JTextField(12));
		tfSabun.setFont(font);
		p.add(tfName = new JTextField(12));
		tfName.setFont(font);
		JPanel gibonCode = new JPanel();
		gibonCode.setLayout(new GridLayout(1,4));
		rb1 = new JRadioButton("1"); rb1.setFont(font);
		rb2 = new JRadioButton("2"); rb2.setFont(font);
		rb3 = new JRadioButton("3"); rb3.setFont(font);
		rb4 = new JRadioButton("4"); rb4.setFont(font);
		group = new ButtonGroup();
		group.add(rb1);  group.add(rb2);  group.add(rb3);
		group.add(rb4);
		gibonCode.add(rb1);  gibonCode.add(rb2);
		gibonCode.add(rb3);  gibonCode.add(rb4);
		p.add(gibonCode);
		Integer [] array = {0,1,2,3,4};
		cbNight = new JComboBox<Integer>(array);
		cbNight.setFont(font);
		p.add(cbNight);
		Integer [] array1 = {0,1,2,3,4,5};
		cbFamily = new JComboBox<Integer>(array1);
		cbFamily.setFont(font);
		p.add(cbFamily);	
		return p;
	}
	private JPanel getSouth(){
		JPanel p = new JPanel();
		p.add(btnInput = new JButton("INPUT"));
		btnInput.setFont(font);
		btnInput.addActionListener(
				new MyAction(this, this.tab, this.tfSabun, this.tfName, this.group, 
	                                   this.cbNight, this.cbFamily));
		p.add(btnClear = new JButton("CLEAR"));
		btnClear.setFont(font);
		btnClear.addActionListener(
				new MyAction(this, this.tab, this.tfSabun, this.tfName, this.group, 
	                                   this.cbNight, this.cbFamily));
		return p;
	}
}








