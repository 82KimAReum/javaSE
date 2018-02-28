package kr.co.bitcamp.libs.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import kr.co.bitcamp.libs.controller.SelectController;
import kr.co.bitcamp.libs.model.MyTableModel;
import kr.co.bitcamp.libs.model.StudentVO;

public class OutputPanel extends JPanel implements ActionListener{
	private JPanel pNorth;
	private JButton btnRefresh;
	private JScrollPane scroll;
	private JTable table;
	public OutputPanel() {
		this.pNorth = new JPanel();
		this.btnRefresh = new JButton("Refresh");
		this.btnRefresh.addActionListener(this);
		this.scroll = new JScrollPane(this.table = new JTable());
		this.pNorth.add(this.btnRefresh);
		this.setLayout(new BorderLayout());
		this.add("North", this.pNorth);
		this.add("Center", this.scroll);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Vector<StudentVO> vector = SelectController.select();
		if(vector == null) 
			JOptionPane.showMessageDialog(this, "현재 등록된 학생이 없습니다.");
		else {
			TableModel tm = new MyTableModel(vector); 
			this.table.setModel(tm);
		}
	}
}





