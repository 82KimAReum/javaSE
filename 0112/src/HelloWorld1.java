//local variable, member(instance) variable, class(static) variable
public class HelloWorld1 {
	String msg = "Hello, World";
	public static void main(String[] args) {
		HelloWorld1 hw = new HelloWorld1();
		System.out.println("msg = " + hw.msg);
	}
}
