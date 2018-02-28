package kr.co.bitcamp.libs.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.bitcamp.libs.controller.InsertController;
import kr.co.bitcamp.libs.model.Calc;
import kr.co.bitcamp.libs.model.StudentVO;

public class InputPanel extends JPanel implements ActionListener{
	private JTextField tfHakbun, tfName, tfKor, tfEng, tfMat, tfEdp;
	private JLabel lblHakbun, lblName, lblKor, lblEng, lblMat, lblEdp;
	private JButton btnOk, btnCancel;
	private Font font;
	private JTabbedPane tab;
	
	public InputPanel(JTabbedPane tab) {
		this.tab = tab;
		this.font = new Font("NanumGothic", Font.BOLD, 20);
		this.add(getCenter());
	}
	JPanel getCenter() {
		JPanel p = new JPanel();     p.setLayout(new BorderLayout());
		p.add("Center", getNorth());
		p.add("South", getSouth());
		return p;
	}
	JPanel getNorth() {
		JPanel p = new JPanel();   
		p.setBorder(new TitledBorder("성적입력"));
		p.setLayout(new GridLayout(6, 2, 5, 5));
		p.add(this.lblHakbun = new JLabel("학번"));
		this.lblHakbun.setFont(this.font);
		p.add(this.tfHakbun = new JTextField(10));
		this.tfHakbun.setFont(this.font);
		p.add(this.lblName = new JLabel("이름"));
		this.lblName.setFont(this.font);
		p.add(this.tfName = new JTextField(10));
		this.tfName.setFont(this.font);
		p.add(this.lblKor = new JLabel("국어"));
		this.lblKor.setFont(this.font);
		p.add(this.tfKor = new JTextField(10));
		this.tfKor.setFont(this.font);
		p.add(this.lblEng = new JLabel("영어"));
		this.lblEng.setFont(this.font);
		p.add(this.tfEng = new JTextField(10));
		this.tfEng.setFont(this.font);
		p.add(this.lblMat = new JLabel("수학"));
		this.lblMat.setFont(this.font);
		p.add(this.tfMat = new JTextField(10));
		this.tfMat.setFont(this.font);
		p.add(this.lblEdp = new JLabel("전산"));
		this.lblEdp.setFont(this.font);
		p.add(this.tfEdp = new JTextField(10));
		this.tfEdp.setFont(this.font);
		return p;
	}
	JPanel getSouth() {
		JPanel p = new JPanel();
		p.add(this.btnOk = new JButton("입력하기"));
		this.btnOk.setFont(this.font);
		this.btnOk.addActionListener(this);    //4. 
		p.add(this.btnCancel = new JButton("다시하기"));
		this.btnCancel.setFont(this.font);
		this.btnCancel.addActionListener(this);
		return p;
	}
	//3. 
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "입력하기" : inputAction();   break;
			case "다시하기" : clearAction();   break;
		}
	}
	private void clearAction() {
		this.tfHakbun.setText("");  this.tfName.setText("");
		this.tfKor.setText("");   this.tfEng.setText("");
		this.tfMat.setText("");   this.tfEdp.setText("");
	}
	private void inputAction() {
		StudentVO s = new StudentVO(this.tfHakbun.getText().trim(),
				                                             this.tfName.getText().trim(), 
				                             Integer.parseInt(this.tfKor.getText().trim()),
				                             Integer.parseInt(this.tfEng.getText().trim()),
				                             Integer.parseInt(this.tfMat.getText().trim()),
				                             Integer.parseInt(this.tfEdp.getText().trim())
				                             );
		Calc calc = new Calc(s);
		calc.calc();
		int row = InsertController.insert(s);
		if(row == 1) {
			JOptionPane.showMessageDialog(this, "Insert Success");
			int choice = JOptionPane.showConfirmDialog(this, "Input Again(y/n)", 
					"Confirm Window", JOptionPane.YES_NO_OPTION);
			if(choice == JOptionPane.YES_OPTION) {
				this.clearAction();
			}else {
				//TODO : 두번째 탭 활성화하기 
				this.tab.setEnabledAt(1, true);
				this.tab.setSelectedIndex(1);
			}
		}
		else {
			JOptionPane.showMessageDialog(this, "Insert Failure");
			this.clearAction();
		}
	}
}









