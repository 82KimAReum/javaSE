package com.swacademy.libs.view;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.swacademy.libs.controller.SaveAction;
import com.swacademy.libs.controller.SelectController;
import com.swacademy.libs.model.MyTableModel;
import com.swacademy.libs.model.PatientsVO;

public class OutputPanel extends JPanel implements ActionListener {
	private JPanel panel;
	private JButton btnDisplay, btnSave;
	private JTable table;
	private JScrollPane pane;
	private SaveAction save;
	
	public OutputPanel(){
		this.setLayout(new BorderLayout());
		panel = new JPanel();   //상단패널
		btnDisplay = new JButton("Display");
		btnSave = new JButton("Save");
		panel.add(btnDisplay);        
		panel.add(btnSave);
		
		table = new JTable();
		table.setRowHeight(25);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFont(new Font("SansSerif", Font.BOLD, 20));
		pane = new JScrollPane(table);
		
		btnDisplay.addActionListener(this);
		btnSave.addActionListener(this);
		
		this.add("North", panel);
		this.add("Center", pane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Save" :       new SaveAction(this); break;
			case "Display" :    this.display(); break;
		}
	}
	private void display() {
		Vector<PatientsVO> vector = SelectController.select();
		if(vector == null){
			JOptionPane.showMessageDialog(this.panel, 
						                               "환자 데이터가 없습니다.", "경고창",
						                               JOptionPane.WARNING_MESSAGE);
		}
		this.table.setModel(new MyTableModel(this.table, vector));
	}
}
