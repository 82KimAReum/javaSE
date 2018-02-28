import java.awt.Color;
import java.awt.Frame;

public class GuiDemo1 {
	private Frame f;
	public GuiDemo1(String title) {
		this.f = new Frame(title);
	}
	void display() {
		this.f.setSize(500, 400);    this.f.setBackground(Color.GREEN);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new GuiDemo1("Frame Demo").display();
	}
}
