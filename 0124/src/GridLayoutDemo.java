import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutDemo {
	private Frame f;
	private Button [] array;
	private Font font;
	public GridLayoutDemo(String title) {
		this.f = new Frame(title);    
		this.font = new Font("NanumGothic", Font.BOLD, 30);
		this.array = new Button[] {new Button("北"), new Button("南"),
				                                 new Button("西"), new Button("東"),
				                                 new Button("中")};
	}
	void display() {
		this.f.setSize(500, 400);
		for(Button btn : this.array)    btn.setFont(this.font);
		this.f.setLayout(new GridLayout(2, 3));
		for(Button btn : this.array)    this.f.add(btn);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutDemo("GridLayout Demo").display();
	}
}
