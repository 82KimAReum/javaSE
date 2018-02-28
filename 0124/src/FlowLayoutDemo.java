import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

public class FlowLayoutDemo {
	private Frame f;
	private Button btnOk, btnCancel;
	private Font font;
	public FlowLayoutDemo(String title) {
		this.f = new Frame(title);      
		this.btnOk = new Button("OK");
		this.btnCancel = new Button("Cancel");
		this.font = new Font("Nimbus", Font.PLAIN, 30);
	}
	void display() {
		this.f.setLayout(new FlowLayout());
		this.btnOk.setFont(this.font);   this.btnCancel.setFont(this.font);
		this.f.add(this.btnOk);
		this.f.add(this.btnCancel);
		this.f.setSize(500, 600);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutDemo("FlowLayout Demo").display();
	}
}
