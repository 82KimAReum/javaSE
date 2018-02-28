public class OverrideDemo2 {
	public static void main(String[] args) {
		Computer bumo;   //declaration
		bumo = new Notebook(); //assignment
		bumo.display();
		System.out.println(bumo.name);
	}
}
