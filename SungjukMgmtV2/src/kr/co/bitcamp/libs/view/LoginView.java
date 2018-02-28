package kr.co.bitcamp.libs.view;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kr.co.bitcamp.libs.controller.SelectController;

public class LoginView extends JPanel implements ActionListener{
	private MyCanvas canvas;
	private JTextField tfId;
	private JPasswordField tfPwd;
	private JButton btnOk, btnCancel;
	private JPanel pCenter;
	private CardLayout card;
	private Container container;
	
	public LoginView(Container container, CardLayout card) {
		this.container = container;
		this.card = card;
		this.canvas = new MyCanvas();
		pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(2,1));
		pCenter.add(this.canvas);
		pCenter.add(getSecondPanel());
		this.add(pCenter);
	}
	private JPanel getSecondPanel() {
		JPanel p = new JPanel();    p.setLayout(new GridLayout(3,2));
		p.add(new JLabel("아이디 : "));
		p.add(this.tfId = new JTextField(20));
		p.add(new JLabel("패스워드 : "));
		p.add(this.tfPwd = new JPasswordField(20));
		this.tfPwd.addActionListener(this);
		p.add(this.btnOk = new JButton("Login"));
		this.btnOk.addActionListener(this);
		p.add(this.btnCancel = new JButton("Cancel"));
		return p;
	}
	private class MyCanvas extends Canvas{
		private Image icon;
		public MyCanvas() {
			this.setSize(300, 200);
			this.icon = 
					Toolkit.getDefaultToolkit().getImage("./images/school.jpeg");
		}
		@Override
		public void paint(Graphics g) {
			g.drawImage(this.icon, 0, 0, this.icon.getWidth(this), 
					                        this.icon.getHeight(this) / 2, this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tfPwd || e.getSource() == this.btnOk) {
			//-1, 0, 1
			int result = 
					SelectController.userCheck(this.tfId.getText(), 
							                                      this.tfPwd.getText());
			switch(result) {
				case 0 : JOptionPane.showMessageDialog(this, "No Userid");  break;
				case 1 : 
					JOptionPane.showMessageDialog(this, 
							this.tfId.getText()+ "님! 환영합니다.");  
					this.card.next(this.container);
					break;
				case -1 :  JOptionPane.showMessageDialog(this, 
						"패스워드가 일치하지 않습니다. 확인 후 다시 입력해 주세요"); break;
			}
		}
	}
	
}




