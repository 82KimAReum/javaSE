//static initialization block
public class StaticDemo3 {
	private int su;   //member variable
	private final int NUM;   //member constant
	private static double avg;    //static variable
	private static final double PI;   //static constant
	//{    //instance initialization block
	public StaticDemo3() {   //Constructor
		this.su = 5;    this.NUM = 100;
	}
	static {     //static block, static initializer, static initialization block
		System.out.println("나는 스태틱 블록 ");
		avg = 89.5;     PI = 3.141596;
	}
	public static void main(String[] args) {
		System.out.println("나는 메인 메소드 ");
		System.out.println(avg);
	}
	
	
	
	
}








