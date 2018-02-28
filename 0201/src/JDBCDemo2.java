import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class JDBCDemo2 implements ActionListener{
	private JFrame f;
	private Container con;
	private JButton btnSearch;
	private JTextField tf;
	private JPanel p;
	private JTable table;
	private Font font;
	
	public JDBCDemo2(String title) {
		this.f = new JFrame(title);
		this.con = this.f.getContentPane();
		this.font = new Font("NanumGothic", Font.PLAIN, 25);
		Icon icon = new ImageIcon("./images/open.gif");
		this.btnSearch = new JButton("우편번호검색", icon);
		this.btnSearch.setFont(this.font);
		this.tf = new JTextField("찾고자 하시는 읍/면/동을 넣어주세요.", 20);
		this.tf.setFont(this.font);
		this.p = new JPanel();
	}
	void display() {
		this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.f.setSize(700, 500);
		this.tf.addActionListener(this);
		this.tf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent evt) {
				JDBCDemo2.this.tf.setText("");
			}
		});
		this.p.add(this.tf);       
		this.btnSearch.addActionListener(this);
		this.p.add(this.btnSearch);
		this.con.add("North", this.p);   
		this.con.add("Center", this.table = new JTable());
		this.btnSearch.requestFocus();
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new JDBCDemo2("우편번호 검색 창").display();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tf || e.getSource() == this.btnSearch) {
			Vector<ZipcodeVO> vector = 
					                   SelectController.select(this.tf.getText().trim());
			TableModel tm = new MyModel(vector);
			this.table.setModel(tm);
		}
	}
	
}
