public class WrapperDemo {
	public static void main(String[] args) {
		/*int su = 100;   //in stack
		Integer in = new Integer(su);    //wrapping, boxing
		int num = in.intValue();            //unwrapping, unboxing
		System.out.println("num = " + num);*/
		
		int su = 100;     //in stack
		Integer in = su;      //autoboxing
		int num = in * 100;  //autounboxing
		System.out.println("num = " + num);
		
		
		
		
		
		
		
		
		
	}
}
