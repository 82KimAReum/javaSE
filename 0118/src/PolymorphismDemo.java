import java.util.Scanner;

public class PolymorphismDemo {
	public static void main(String[] args) {
		int choice = 0;
		do {
			showMenu();       choice = input();      display(choice);
		}while(choice != 5);
	}
	static void showMenu(){
		System.out.println("<<Menu>>");   
		System.out.println("1. Dog");         System.out.println("2. Cat");          
		System.out.println("3. Korean");    System.out.println("4. American");
		System.out.println("5. Exit");
	}
	static int input() {
		System.out.print("당신은 어느 종족이십니까 ? : ");
		Scanner scan = new Scanner(System.in);   
		return scan.nextInt();
	}
	static void display(int choice) {
		Mammal m = null;
		switch(choice) {
			case 1 :  m = new Dog();  break;
			case 2 :  m = new Cat();   break;
			case 3 :  m = new Korean();  break;
			case 4 :  m = new American();  break;
			case 5 :  System.exit(0);
		}
		m.saySomething();
	}
}






