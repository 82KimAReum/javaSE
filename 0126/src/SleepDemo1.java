import java.awt.Canvas;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class SleepDemo1 extends Thread{
	private Frame f;
	private MyCanvas canvas;
	private Font font;
	
	public SleepDemo1(String title) {
		this.f = new Frame(title);
		this.canvas = new MyCanvas();
		this.font = new Font("NanumGothic", Font.BOLD, 40);
		this.start();
	}
	void display() {
		this.f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		this.canvas.setFont(this.font);
		this.f.setSize(400, 300);    this.f.add("Center", this.canvas);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new SleepDemo1("Digital Clock").display();
	}
	private class MyCanvas extends Canvas{
		private Date now = null;
		@Override
		public void paint(Graphics g) {
			now = new Date();
			String str = String.format("%tT", now);
			g.drawString(str, 50, 50);
		}
	}
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				this.canvas.repaint();
			}
		}catch(InterruptedException ex) {
			System.out.println("test");
		}
	}
}







