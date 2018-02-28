package com.swacademy.libs.view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import com.swacademy.libs.model.EmployeeVO;

public class ViewMain {
	private JFrame f;
	private JTabbedPane tab;
	private Container con;
	private Font font;
	public ViewMain(String title){
		font = new Font("맑은 고딕", Font.BOLD, 25);
		f = new JFrame(title);
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent evt){
				int choice = JOptionPane.showConfirmDialog(f, "정말 종료하시겠습니까?", "종료", 
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(choice == JOptionPane.OK_OPTION) {
					JOptionPane.showMessageDialog(f, "다음에 또 만나요!!!");
					System.exit(0);
				}else{
					f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		this.con = this.f.getContentPane();
		this.con.setLayout(new BorderLayout());
		tab = new JTabbedPane();
		tab.setFont(font);
	}
	public void go(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("open.gif");
		this.f.setIconImage(img);
		tab.addTab("Login", new MyImage());
		tab.addTab("Input", new InputView(this.tab, this.font));
		tab.addTab("Output", new OutputView());
		this.con.add("Center", tab);
		f.setSize(800,600);
		f.setVisible(true);
	}
}
