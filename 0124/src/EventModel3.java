import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;   //1. import

public class EventModel3 {
	private Frame f;
	private Panel p;
	private TextField tf;
	private Checkbox chkRed, chkBlue, chkGreen;
	private CheckboxGroup cbg;
	private Font font;
	
	public EventModel3(String title) {
		this.f = new Frame(title);    this.tf = new TextField();
		this.p = new Panel();    this.cbg = new CheckboxGroup();
		this.chkRed = new Checkbox("RED", this.cbg, false);
		this.chkGreen = new Checkbox("GREEN", this.cbg, false);
		this.chkBlue = new Checkbox("BLUE", this.cbg, false);
		this.font = new Font("NanumGothic", Font.BOLD, 30);	
	}
	void display() {
		this.f.addWindowListener(new MyWindow1());
		this.f.addMouseMotionListener(new MyMotion());
		this.chkRed.setFont(this.font);    this.chkGreen.setFont(this.font);
		this.chkBlue.setFont(this.font);   this.tf.setFont(this.font);
		this.chkRed.addItemListener(new MyItem());
		this.chkGreen.addItemListener(new MyItem());
		this.chkBlue.addItemListener(new MyItem());
		this.p.add(this.chkRed);   this.p.add(this.chkGreen);  this.p.add(this.chkBlue);
		this.f.add(this.p, BorderLayout.NORTH);  
		this.f.add(this.tf, BorderLayout.SOUTH);
		this.f.setSize(600, 400);    this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventModel3("Event Model III").display();
	}
	private class MyWindow1 extends WindowAdapter{  //2. implements, extends
		//3. Override
		@Override
		public void windowClosing(WindowEvent evt) {
			EventModel3.this.f.setVisible(false);
			f.dispose();
			System.exit(0);
		}
	}
	private class MyItem implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent evt){
			if(evt.getSource() == chkRed) {
				f.setBackground(Color.RED);
			}else if(evt.getSource() == chkGreen) {
				EventModel3.this.f.setBackground(Color.GREEN);
			}else if(evt.getSource() == chkBlue) {
				f.setBackground(Color.BLUE);
			}
		}
	}
		
	private class MyMotion extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent evt) {
			int x = evt.getX();     int y = evt.getY();
			tf.setText(String.format("(x, y) = (%d, %d)", x, y));
		}
	}
}




