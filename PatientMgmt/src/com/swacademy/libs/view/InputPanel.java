package com.swacademy.libs.view;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import com.swacademy.libs.controller.PatientsAddAction;
import com.swacademy.libs.model.PatientsVO;

public class InputPanel extends JPanel {
	private JPanel panel, pSouth, pCenter, pWest;
	private JButton btnAdd;
	private JTextField tfNo, tfCode, tfDays, tfAge;
	private JLabel labelNo, labelCode, labelDays, labelAge;
	private Font font;
	private PatientsAddAction action;
	
	public InputPanel(){
		font = new Font("Serif", Font.BOLD, 25);	
		panel = new JPanel();  //중앙패널
		pSouth = new JPanel();    //중앙패널의 하단패널
		pCenter = new JPanel();   //중앙패널의 센터쪽 패널
		pWest = new JPanel();     //중앙패널의 왼쪽 패널
		initComponent();
	}
	private void initComponent(){
		//중앙패널
		panel.setLayout(new BorderLayout());
		panel.setBorder(new TitledBorder(
				                    new BevelBorder(BevelBorder.RAISED), "환자 데이터 입력"));
		
		//중앙패널의 하단패널
		pSouth.add(btnAdd = new JButton("    추가    "));
		btnAdd.setFont(font);
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED));		
		
		//중앙패널의 센터쪽 패널
		pCenter.setLayout(new GridLayout(4,1,10,10));
		tfNo = new JTextField(15);   tfNo.setFont(font);
		tfCode = new JTextField(15);  tfCode.setFont(font);
		tfDays = new JTextField(15);  tfDays.setFont(font);
		tfAge = new JTextField(15);  tfAge.setFont(font);
		pCenter.add(tfNo);  pCenter.add(tfCode);
		pCenter.add(tfDays);  pCenter.add(tfAge);
		
		//중앙패널의 왼쪽 패널
		pWest.setLayout(new GridLayout(4,1,10,10));
		labelNo = new JLabel("번호 : ", JLabel.RIGHT);    
		labelNo.setFont(font);
		labelCode = new JLabel("진료코드 : ", JLabel.RIGHT);   
		labelCode.setFont(font);
		labelDays = new JLabel("입원일수 : ", JLabel.RIGHT);   
		labelDays.setFont(font);
		labelAge = new JLabel("나이 : ", JLabel.RIGHT);     
		labelAge.setFont(font);
		pWest.add(labelNo);   pWest.add(labelCode);
		pWest.add(labelDays);  pWest.add(labelAge);
		
		panel.add("South", pSouth);
		panel.add("West", pWest);
		panel.add("Center", pCenter);
		
		//추가버튼의 이벤트처리
		action = new PatientsAddAction(this, tfNo, tfCode, tfDays, tfAge);
		btnAdd.addActionListener(action);
		add(panel);
	}
}
