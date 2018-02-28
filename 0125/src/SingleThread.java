public class SingleThread {
	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		st.run();
		for(int i = 0 ; i < 10 ; i++)  System.out.println(i + " --> I'm main()");
	}
	public void run() {
		for(int j = 0 ; j < 10 ; j++)  System.out.println(j + " --> I'm run()");
	}
}
