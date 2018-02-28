import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

//2. 옆집이 listener다. 
public class EventModel2 {  
	private Frame f;
	private Button btnRed, btnBlue;
	private Panel p;
	private Font font;
	public EventModel2(String title) {
		this.f = new Frame(title);   this.btnRed = new Button("RED");
		this.btnBlue = new Button("BLUE");   this.p = new Panel();
		this.font = new Font("NanumGothic", Font.BOLD, 30);
	}
	void display() {
		this.f.setSize(600,  400);    this.f.addWindowListener(new MyWindow(this.f));
		this.btnRed.setBackground(Color.BLUE);
		this.btnRed.setForeground(Color.RED);  this.btnRed.setFont(this.font);
		//4. Event Source에 Event Listener 등록하자.
		this.btnRed.addActionListener(new MyAction(this.f, this.btnRed, this.btnBlue));
		this.btnBlue.setBackground(Color.RED);
		this.btnBlue.setForeground(Color.BLUE);  this.btnBlue.setFont(this.font);
		this.btnBlue.addActionListener(new MyAction(this.f, this.btnRed, this.btnBlue));
		this.p.add(this.btnRed);    this.p.add(this.btnBlue);
		this.f.add("North", this.p);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventModel2("Event Model II").display();
	}
}




