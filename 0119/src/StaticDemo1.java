//static variable
public class StaticDemo1 {
	private int su;    //member variable
	private static int num;   //static variable
	public StaticDemo1() {  
		su++;   num++;
	}
	public void display() { System.out.println("su = " + su + ", num = " + num); }
	public static void main(String[] args) {
		StaticDemo1 [] array = new StaticDemo1[3];
		for(int i = 0 ; i < array.length ; i++)  array[i] = new StaticDemo1();
		for(StaticDemo1 sd : array)  sd.display();
	}
}






