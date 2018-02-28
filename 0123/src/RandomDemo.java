import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 6 + 1);
		Random r = new Random();
		int rand1= r.nextInt(6) + 1;
		
	}
}
