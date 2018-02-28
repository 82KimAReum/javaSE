import java.io.FileNotFoundException;

public class OverrideDemo3 {
	public static void main(String[] args) {
		Mobile m = new IPhone();    System.out.printf("%d\n", m.display("Hello"));
	}
}
class Mobile{
	public int display(String str)  
			 {  return Integer.parseInt(str); }
}
class IPhone extends Mobile{
	@Override
	public int display(String str) throws FileNotFoundException
			{  return Integer.parseInt(str);  }
}