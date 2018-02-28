public class CarCenter {
	public static void main(String[] args) {
		//Sonata sonata = new Sonata("Silver Sonata");
		//repair(sonata);
		//Carnival carnival = new Carnival("Black Carnival");
		//repair(carnival);
		Matiz matiz = new Matiz("Red Matiz");
		repair(matiz);
	}
	static void repair(Car car) {
		//System.out.println(car.getName() + "이(가) 잘 수리됐습니다.");
		if(car instanceof Sonata) {
			System.out.println("소나타가 수리됐습니다.");
		}else if(car instanceof Carnival) {
			System.out.println("카니발이 수리됐습니다.");
		}else {
			System.out.println("마티즈가 수리됐습니다.");
		}
	}
}






