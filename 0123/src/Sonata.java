public class Sonata implements Comparable{
	private int price;
	private String name;
	public Sonata(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Object obj) {
		Sonata another = (Sonata)obj;
		return this.price - another.price;
	}
}





