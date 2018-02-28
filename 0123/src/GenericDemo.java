public class GenericDemo {
	public static void main(String[] args) {
		//Test t = new Test(100);
		//int su = t.getNum();
		Test<Integer> t = new Test<Integer>(100);
		int su = t.getNum();
		Test<Double> t1 = new Test<Double>(3.14);
		double pi = t1.getNum();
		Test<String> t2 = new Test<String>("Hello");
		String str = t2.getNum();
	}
}





