public class ArrayDemo {
	public static void main(String[] args) {
		//Rectangular Array
		//1. 방법 
		/*int [][] array;   //2차원 배열의 선언
		array = new int[2][3];    //Creation
		array[0][0] = 4;   array[0][1] = 5; array[0][2] = 6;   //Assignment
		array[1][0] = 7;   array[1][1] = 8; array[1][2] = 9;*/
		//2. 방법
		/*int [][] array;   //Declaration
		array = new int[][] {                  //Creation & Assignment
			                             {4,5,6}, 
			                             {7,8,9}
			                          };*/
		//3. 방법 	    
		int [][] array = {       //Initialization
				                  {4,5,6},
				                  {7,8,9}			      
		                       };
		for(int i = 0 ;  i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.printf("array[%d][%d] = %d\t\t", i, j, array[i][j]);
			}
			System.out.println();
		}
	}
}







