public class MethodDemo3 {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};    
		mymethod(array);    //Call by Reference
		System.out.println("array[0] = " + array[0]);
	}
	static void mymethod(int [] array1) {  //int [] array1 = array;
		array1[0] += 100;
	}
}
