package kr.co.bitcamp.libs.view;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewMain extends JFrame{
	private CardLayout card;
	private Container con;
	private LoginView login;    //JPanel
	private SungjukView sungjuk;  //JPanel
	
	public ViewMain(String title){
		super(title);
		this.con = this.getContentPane();
		this.sungjuk = new SungjukView();
		this.con.setLayout(this.card = new CardLayout());
		this.login = new LoginView(this.con, this.card);
	}
	public void display() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {
				int choice = JOptionPane.showConfirmDialog(ViewMain.this, "정말 종료하시겠습니까 ?", 
						           "종료여부", JOptionPane.YES_NO_OPTION,
						           JOptionPane.QUESTION_MESSAGE);
				if(choice == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(ViewMain.this, 
							                   "감사합니다. 다음에 만나요!!!");
					System.exit(0);
				}else if(choice == JOptionPane.NO_OPTION) return;
			}
		});
		this.setSize(700, 600);
		int x = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - 
				    this.getWidth() / 2);
		int y = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - 
			    this.getHeight() / 2);
		this.setLocation(x, y);
		this.con.add(this.login, "login");
		this.con.add(this.sungjuk, "sungjuk");
		this.card.show(this.con, "login");
		this.setVisible(true);
	}
}






