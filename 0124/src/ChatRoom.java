import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;

public class ChatRoom {
	private Frame f;
	private Panel p;
	private Button btnQuit, btnSend;
	private ScrollPane pane;
	private TextField tf;
	private Font font;
	
	public ChatRoom(String title) {
		this.f = new Frame(title);    this.p = new Panel();
		this.btnQuit = new Button("Quit");    this.btnSend = new Button("Send");
		this.pane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);      
		this.tf = new TextField();   
		this.font = new Font("NanumGothic", Font.PLAIN, 30);
	}
	void display() {
		this.f.setSize(600, 400);
		this.f.add("Center", this.pane);
		this.tf.setFont(this.font);
		this.f.add("South", this.tf);
		this.btnSend.setFont(this.font);   this.btnQuit.setFont(this.font);
		this.p.add(this.btnSend);    this.p.add(this.btnQuit);
		this.f.add("East", this.p);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new ChatRoom("Chat Room").display();
	}
}




