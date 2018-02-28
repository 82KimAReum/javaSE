package kr.co.bitcamp.libs.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SungjukView extends JPanel{
	private JTabbedPane tab;
	private InputPanel  inputPanel;  //JPanel
	private OutputPanel outputPanel;  //JPanel
	
	public SungjukView() {
		this.setLayout(new BorderLayout());
		this.add(this.tab = new JTabbedPane());
		this.tab.addTab("입력하기", 
				new ImageIcon("./images/open.gif"), 
				this.inputPanel = new InputPanel(this.tab));
		this.tab.addTab("출력하기", 
				new ImageIcon("./images/save.gif"), 
				this.outputPanel = new OutputPanel());
		//this.tab.setEnabledAt(1, false);
	}
	
	
}





