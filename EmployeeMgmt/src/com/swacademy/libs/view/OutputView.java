package com.swacademy.libs.view;
import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.swacademy.libs.controller.MyOutputAction;
import com.swacademy.libs.model.EmployeeVO;

public class OutputView extends JPanel {
	private JPanel pNorth;
	private JButton btnDisplay;
	private JTable table;
	private JScrollPane pane;
	public OutputView(){
		this.setLayout(new BorderLayout());
		table = new JTable();
		pane = new JScrollPane(table);
		this.add("Center", pane);
		pNorth = new JPanel();
		pNorth.add(btnDisplay = new JButton("Display"));
		btnDisplay.addActionListener(new MyOutputAction(this.table));
		this.add(pNorth, "North");
	}
}








