import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction implements ActionListener {  //2. 
	private Frame f;
	private Button btnRed, btnBlue;
	public MyAction(Frame f, Button btnRed, Button btnBlue) {
		this.f = f;
		this.btnRed = btnRed;
		this.btnBlue = btnBlue;
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
