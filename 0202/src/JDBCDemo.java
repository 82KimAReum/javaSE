import java.awt.Container;
import java.awt.event.ItemEvent;    //1. import 하자.
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JDBCDemo implements ItemListener{  //2. implements 하자.
	private JFrame f;
	private JPanel pNorth;
	private JLabel label;
	private JComboBox<String> combo;
	private JScrollPane scroll;
	private JTable table;
	private Container con;
	
	public JDBCDemo(String title) {
		this.f = new JFrame(title);
		this.con = this.f.getContentPane();
		this.pNorth = new JPanel();
		this.label = new JLabel("Country Code");
		this.combo = new JComboBox<String>();
		this.scroll = new JScrollPane(this.table = new JTable());
	}
	
	void display() {
		this.f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent evt) {
				Vector<String> vector = 
						              SelectController.selectCountryCode();
				for(int i = 0 ; i < vector.size() ; i++) 
					JDBCDemo.this.combo.addItem(vector.get(i));
			}
		});
		this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pNorth.add(this.label);
		this.combo.addItemListener(this);  //4. Event Source에 Event 등록하자. 
		this.combo.addItem("--국가선택--");
		this.pNorth.add(this.combo);
		this.con.add("Center", this.scroll);  
		this.con.add("North", this.pNorth);
		this.f.setSize(500, 400);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new JDBCDemo("City Search Program").display();
	}
	//3. Override하자.
	@Override
	public void itemStateChanged(ItemEvent e) {
		String code = null;
		if(this.combo.getSelectedIndex() != 0) {
			code = (String)this.combo.getSelectedItem();
			SelectService ss = new SelectService(code, this.table);
		}
	}
}





