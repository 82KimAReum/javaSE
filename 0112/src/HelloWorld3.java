public class HelloWorld3 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("msg = " + mc.msg);
	}
}
class MyClass{
	String msg = "Hello, World";      //member varible
}