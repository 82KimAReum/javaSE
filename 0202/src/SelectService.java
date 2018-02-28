import javax.swing.JTable;

public class SelectService {
	private String code;
	private JTable table;
	public SelectService(String code, JTable table) {
		this.code = code;
		this.table = table;
		this.table.setModel(new MyTableModel(this.code));
	}
	
}
