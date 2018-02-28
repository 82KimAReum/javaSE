import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class CanvasDemo {
	private Frame f;
	private MyCanvas mc;
	public CanvasDemo(String title) {
		this.f = new Frame(title);
		this.mc = new MyCanvas();
	}
	void display() {
		this.f.setSize(400, 500);   this.f.setLayout(new FlowLayout());
		this.mc.setSize(250, 400);
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Image image = toolKit.getImage("jimin.jpg");
		this.mc.setImage(image);
		this.f.add(this.mc);
		this.f.setVisible(true);
	}
	private class MyCanvas extends Canvas{
		private Image image;
		public void setImage(Image image) {
			this.image = image;
		}
		@Override
		public void paint(Graphics g) {
			g.drawImage(this.image, this.getWidth() / 2 - 100, 
					              this.getHeight() / 2 - 150, 200, 300, this);
		}
	}
	public static void main(String[] args) {
		new CanvasDemo("Image Demo").display();
	}
}
