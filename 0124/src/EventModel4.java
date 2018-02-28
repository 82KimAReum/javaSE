import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import java.awt.Color;

public class EventModel4 {
	private Frame f;
	private Panel p;
	private Choice choice;
	private Font font;
	
	public EventModel4(String title) {
		this.f = new Frame(title);
		this.p = new Panel();
		this.choice = new Choice();
		this.font = new Font("NanumGothic", Font.BOLD, 30);
	}
	void display() {
		this.f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {
				int answer = JOptionPane.showConfirmDialog(EventModel4.this.f, 
						                                            "정말 종료하시겠습니까?");
				if(answer == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		String [] array = {"--색상선택--", "빨강", "주황", "노랑", "초록", "파랑", "분홍"};
		for(String str : array)  this.choice.add(str);
		this.choice.addItemListener(new MyItem());
		this.choice.setFont(this.font);
		this.p.add(this.choice);
		this.f.add(BorderLayout.NORTH, this.p);
		this.f.setSize(400, 300);    this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventModel4("Event Model IV").display();
	}
	private class MyItem implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent evt){
			//"--색상선택--", "빨강", "주황", "노랑", "초록", "파랑", "분홍"
			Color [] array = {null, Color.RED, Color.ORANGE, Color.YELLOW,
					               Color.GREEN, Color.BLUE, Color.PINK};
			int idx = EventModel4.this.choice.getSelectedIndex();
			if(idx != 0)
				EventModel4.this.f.setBackground(array[idx]);
		}
	}
}
