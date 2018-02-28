import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JDBCDemo implements ActionListener{
	private JFrame f;
	private JPanel p;
	private JButton btnSearch;
	private JTextArea area;
	private Container con;
	
	public JDBCDemo(String title) {
		this.f = new JFrame(title);  
		this.con = this.f.getContentPane();
		this.p = new JPanel();
		this.btnSearch = new JButton("Search");
		this.area = new JTextArea();
	}
	void display() {
		this.btnSearch.addActionListener(this);
		this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.p.add(this.btnSearch);    this.con.add("North", this.p);
		this.con.add("Center", this.area);
		this.f.setSize(500, 400);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new JDBCDemo("JDBC Demo").display();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Connection conn = null;
		try {
			conn = new DBBean().getConnection();
			JOptionPane.showMessageDialog(this.f, "Connection Success");
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(this.f, "Connection Failure");
		}
		Statement stmt = null;    ResultSet rs = null;
		StringBuffer sb = new StringBuffer("SELECT hakbun, irum, kor ");
		sb.append("FROM student WHERE kor >= 80");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				String hakbun = rs.getString(1);
				String irum = rs.getString(2);
				int kor =  rs.getInt("kor");
				this.area.append(String.format("%10s%10s%5d", hakbun, irum, kor));
				this.area.append("\n");
			}
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(this.f, ex.getMessage());
		}
	}
}









