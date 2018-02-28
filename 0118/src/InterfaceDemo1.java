public class InterfaceDemo1 implements Father, Mother{
	public void father() { System.out.println("called Father()"); }
	public void mother() {System.out.println("called mother()"); }
	public void grandMother() { System.out.println("called grandMother()"); }
	public void grandFather() {System.out.println("called grandFather()"); }
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo1();  gf.grandFather();
		InterfaceDemo1 id = new InterfaceDemo1();  
		GrandMother gm = id;                  gm.grandMother();
		gm.grandFather();
	}
}






