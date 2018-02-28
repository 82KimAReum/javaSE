import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanel {
	private Frame f;
	private Panel p;
	public FrameWithPanel(String title) {
		this.f = new Frame(title);      this.p = new Panel();
	}
	void display() {
		this.f.setLayout(null);
		this.p.setSize(300, 400);   this.p.setBackground(Color.yellow);
		f.add(this.p, "South");
		f.setSize(500, 600);     f.setBackground(Color.RED);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameWithPanel("Frame With Panel").display();
	}
}





