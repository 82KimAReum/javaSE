import java.awt.Color;
import java.awt.Frame;

public class GuiDemo extends Frame {
	public GuiDemo(String title) {
		super(title);
	}
	public static void main(String[] args) {
		GuiDemo gui = new GuiDemo("Frame Demo");
		gui.setBackground(Color.YELLOW);
		gui.setSize(500, 400);
		gui.setVisible(true);
	}
	
}
