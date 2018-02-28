package com.swacademy.libs.view;
import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import com.swacademy.libs.model.PatientsVO;

public class MainView {
	private JFrame f;
	private JTabbedPane pane;
	private Container con;
	
	public MainView(String title) {
		this.f = new JFrame(title);
		this.con = this.f.getContentPane();
		this.pane = new JTabbedPane();
	}
	public void display(){
		this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pane.add(new InputPanel(), "데이타 입력");
		this.pane.add(new OutputPanel(), "데이타 출력");
		con.add(this.pane, "Center");
		this.f.setSize(700,500);
		this.f.setVisible(true);
	}
}
