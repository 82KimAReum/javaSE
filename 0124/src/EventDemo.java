import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;        //1.

public class EventDemo implements ActionListener {
	private Frame f;
	private Button btn;
	public EventDemo(String title) {
		this.f = new Frame(title);     this.btn = new Button("RED");
	}
	void display() {
		this.f.setSize(500, 400);      this.f.add(this.btn, "North");
		this.btn.addActionListener(this);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventDemo("Event Demo").display();
	}
	//3. 
	@Override
	public void actionPerformed(ActionEvent e) {
		this.f.setBackground(Color.RED);
	}
}



