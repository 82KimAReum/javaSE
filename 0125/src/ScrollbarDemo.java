import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarDemo {
	private Frame f;
	private Canvas canvas;
	private Scrollbar redScbar, greenScbar, blueScbar;
	private Label redLabel, greenLabel, blueLabel;
	private Panel p;
	private Font font;
	
	public ScrollbarDemo(String title) {
		this.f = new Frame(title);   this.p = new Panel();
		this.canvas = new Canvas();
		this.redScbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		this.greenScbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		this.blueScbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		this.redLabel = new Label("0(0)");
		this.greenLabel = new Label("0(0)");
		this.blueLabel = new Label("0(0)");
		this.font = new Font("NanumGothic", Font.BOLD, 25);
	}
	void display() {
		this.f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		this.f.setSize(300, 700);    this.canvas.setBackground(Color.BLACK);    
		this.f.add(BorderLayout.CENTER, this.canvas);
		this.p.setLayout(new GridLayout(3, 2));
		this.redScbar.addAdjustmentListener(new MyAdjustment());
		this.redScbar.setBackground(Color.RED);
		this.greenScbar.addAdjustmentListener(new MyAdjustment());
		this.greenScbar.setBackground(Color.GREEN);
		this.blueScbar.addAdjustmentListener(new MyAdjustment());
		this.blueScbar.setBackground(Color.BLUE);
		this.redLabel.setFont(this.font);
		this.p.add(this.redLabel);  this.p.add(this.redScbar); 
		this.greenLabel.setFont(this.font);
		this.p.add(this.greenLabel);  this.p.add(this.greenScbar);
		this.blueLabel.setFont(this.font);
		this.p.add(this.blueLabel);     this.p.add(this.blueScbar);
		this.f.add("North", this.p);
		this.f.setVisible(true);
	}
	private class MyAdjustment implements AdjustmentListener{
		@Override
		public void adjustmentValueChanged(AdjustmentEvent evt) {
			if(evt.getSource() == ScrollbarDemo.this.redScbar)
				ScrollbarDemo.this.redLabel.setText(
					String.valueOf(evt.getValue()) + "(" + 
					String.valueOf(Integer.toHexString(evt.getValue())).toUpperCase() +
					")"	
				);
			else if(evt.getSource() == ScrollbarDemo.this.greenScbar)
				ScrollbarDemo.this.greenLabel.setText(
					String.valueOf(evt.getValue()) + "(" + 
					String.valueOf(Integer.toHexString(evt.getValue())).toUpperCase() +
					")"	
				);
			else if(evt.getSource() == ScrollbarDemo.this.blueScbar)
				ScrollbarDemo.this.blueLabel.setText(
					String.valueOf(evt.getValue()) + "(" + 
					String.valueOf(Integer.toHexString(evt.getValue())).toUpperCase() +
					")"	
				);
			ScrollbarDemo.this.canvas.setBackground(new Color(
					ScrollbarDemo.this.redScbar.getValue(), 
					ScrollbarDemo.this.greenScbar.getValue(),
					ScrollbarDemo.this.blueScbar.getValue()	));	
		}
		
	}
	public static void main(String[] args) {
		new ScrollbarDemo("Scrollbar Demo").display();
	}
}




