import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 
    extends Frame implements ActionListener{
	private TextArea area;
	private Button btnOpen;
	private FileDialog fdOpen;
	private Panel p;
	public RandomAccessFileDemo2(String title) {
		super(title);
		this.p = new Panel();
		this.area = new TextArea();
		this.btnOpen = new Button("File Open");
		this.fdOpen = new FileDialog(this, "파일 열기창", FileDialog.LOAD);
	}
	void display() {
		this.btnOpen.addActionListener(this);
		this.setSize(700, 600);  this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		this.p.add(this.btnOpen);    	this.add("North", this.p);
		this.add("Center", this.area);    this.setVisible(true);
	}
	public static void main(String[] args) {
		new RandomAccessFileDemo2("Notepad").display();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.fdOpen.setVisible(true);
		//File file = new File(this.fdOpen.getFile());
		RandomAccessFile raf = null;
		try{
			String directory = this.fdOpen.getDirectory();
			String file = this.fdOpen.getFile();
			File f  = new File(directory, file);
			raf = new RandomAccessFile(f, "r");
			while(raf.getFilePointer() < raf.length()) {
				this.area.append(raf.readLine());
				this.area.append("\n");
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
