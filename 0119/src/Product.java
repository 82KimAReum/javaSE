public class Product extends Object implements Cloneable{
	private String name;
	public Product(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object copy() {
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("복제에 실패했습니다.");
		}
		return obj;
	}
	@Override
	public String toString() {
		return String.format("name = %s\n", this.name);
	}
}





