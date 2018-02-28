import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;    //1. import 한다.
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//1. 내가 listener다. 
public class EventModel1 implements ActionListener, WindowListener{  //2. implements 한다.
	private Frame f;
	private Button btnRed, btnBlue;
	private Panel p;
	private Font font;
	public EventModel1(String title) {
		this.f = new Frame(title);   this.btnRed = new Button("RED");
		this.btnBlue = new Button("BLUE");   this.p = new Panel();
		this.font = new Font("NanumGothic", Font.BOLD, 30);
	}
	void display() {
		this.f.setSize(600,  400);    this.f.addWindowListener(this);
		this.btnRed.setBackground(Color.BLUE);
		this.btnRed.setForeground(Color.RED);  this.btnRed.setFont(this.font);
		//4. Event Source에 Event Listener 등록하자.
		this.btnRed.addActionListener(this);
		this.btnBlue.setBackground(Color.RED);
		this.btnBlue.setForeground(Color.BLUE);  this.btnBlue.setFont(this.font);
		this.btnBlue.addActionListener(this);
		this.p.add(this.btnRed);    this.p.add(this.btnBlue);
		this.f.add("North", this.p);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventModel1("Event Model I").display();
	}
	//3. Override한다.
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == this.btnRed) {
			this.f.setBackground(Color.RED);
		}else if(evt.getSource() == this.btnBlue){
			this.f.setBackground(Color.BLUE);
		}
	}
}




