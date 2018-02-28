import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.*;   //1. 

public class CardLayoutDemo implements MouseListener {  //2
	private Frame f;
	private Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;
	private Panel pan1, pan2, pan3, pan4, pan5, pan6, pan7;
	private CardLayout card;
	
	public CardLayoutDemo(String title) {
		this.f = new Frame(title);   this.card = new CardLayout();
		this.lbl1 = new Label("1st Card");   this.lbl2 = new Label("2nd Card");
		this.lbl3 = new Label("3rd Card");   this.lbl4 = new Label("4th Card");
		this.lbl5 = new Label("5th Card");   this.lbl6 = new Label("6th Card");
		this.lbl7 = new Label("7th Card");
		this.pan1 = new Panel();   this.pan2 = new Panel();
		this.pan3 = new Panel();   this.pan4 = new Panel();
		this.pan5 = new Panel();   this.pan6 = new Panel();
		this.pan7 = new Panel();
	}
	//3. override
	@Override
	public void mouseClicked(MouseEvent evt) {
		//this.card.next(this.f);
	}
	public void mouseEntered(MouseEvent evt) {
		this.card.next(this.f);
	}
	public void mouseExited(MouseEvent evt) {}
	public void mousePressed(MouseEvent evt) {}
	public void mouseReleased(MouseEvent evt) {}
	
	void display() {
		this.pan1.add(this.lbl1);    this.pan1.setBackground(Color.RED);  
		//4. 
		this.pan1.addMouseListener(this);
		this.pan2.add(this.lbl2);    this.pan2.setBackground(Color.ORANGE);
		this.pan2.addMouseListener(this);
		this.pan3.add(this.lbl3);    this.pan3.setBackground(Color.YELLOW);
		this.pan3.addMouseListener(this);
		this.pan4.add(this.lbl4);    this.pan4.setBackground(Color.GREEN);
		this.pan4.addMouseListener(this);
		this.pan5.add(this.lbl5);    this.pan5.setBackground(Color.BLUE);    
		this.pan5.addMouseListener(this);
		this.pan6.add(this.lbl6);    this.pan6.setBackground(new Color(0, 0,128));
		this.pan6.addMouseListener(this);
		this.pan7.add(this.lbl7);    this.pan7.setBackground(new Color(255, 0, 255));
		this.pan7.addMouseListener(this);
		this.f.setSize(300, 700);    this.f.setLayout(this.card);
		this.f.add(this.pan1, "First");    this.f.add(this.pan2, "Second");   
		this.f.add(this.pan3, "Third");   this.f.add(this.pan4, "Fourth");    
		this.f.add(this.pan5, "Fifth");   this.f.add(this.pan6, "Sixth");
		this.f.add(this.pan7, "Seventh"); 
		
		this.card.show(this.f, "First");
		this.f.setVisible(true);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new CardLayoutDemo("CardLayout Demo").display();
	}
	
	
	
	
	
}
