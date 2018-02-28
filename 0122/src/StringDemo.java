/*
 * 1. Primitive type 비교 : == 연산자만 사용, 값 비교
 * 2. Reference type 비교 : ==연산자, equals(), 무조건 주소 비교
 *                                       단, equals() 값 비교를 위한 override 가능
 * 3. String type 비교 : 값비교시 무조건 equals()를 사용한다.                              
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = new String("Hello");    
		String str1 = "Hello";
		if(str == str1) System.out.println("equals");
		else System.out.println("different");
	}
}







