import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;

public class BorderLayoutDemo {
	private Frame f;
	private Button [] array;
	private Font font;
	public BorderLayoutDemo(String title) {
		this.f = new Frame(title);    
		this.font = new Font("NanumGothic", Font.ITALIC, 30);
		this.array = new Button[] {new Button("北"), new Button("南"),
				                                 new Button("西"), new Button("東"),
				                                 new Button("中")};
	}
	void display() {
		this.f.setSize(500, 400);
		for(Button btn : this.array)    btn.setFont(this.font);
		this.f.add(this.array[0], "North");    this.f.add("South", this.array[1]);
		this.f.add(this.array[2], BorderLayout.WEST);
		this.f.add(BorderLayout.EAST, this.array[3]);
		this.f.add(BorderLayout.CENTER, this.array[4]);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutDemo("BorderLayout Demo").display();
	}
}
