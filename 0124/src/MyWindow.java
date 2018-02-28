import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;   //1. 

public class MyWindow implements WindowListener {   //2.
	private Frame f;
	public MyWindow(Frame f) {
		this.f = f;
	}
	//3. 
	@Override
	public void windowClosing(WindowEvent evt) {
		this.f.setVisible(false);
		this.f.dispose();
		System.exit(0);
	}
	public void windowClosed(WindowEvent evt) {}
	public void windowOpened(WindowEvent evt) {}
	public void windowIconified(WindowEvent evt) {}
	public void windowDeiconified(WindowEvent evt) {}
	public void windowActivated(WindowEvent evt) {}
	public void windowDeactivated(WindowEvent evt) {}
}
