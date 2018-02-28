public class ArrayDemo1 {
	public static void main(String[] args) {
		//Jagged, Ragged Array
		//1. 방법
		/*int [][] array;     //Declaration
		array = new int[3][];    //Creation
		array[0] = new int[5];   //Creation
		array[1] = new int[3];   //Creation
		array[2] = new int[7];   //Creation
*/		//2. 방법
		/*int [][] array;     //Declaration
		array = new int[][] {
			                             {1,2,3,4,5},
			                             {6,7,8},
			                             {9,10,11,12,13,14,15}
		};*/
		//3. 방법 
		int [][] array = {
                                  {1,2,3,4,5},
                                  {6,7,8},
                                  {9,10,11,12,13,14,15}
                               };
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length;  j++) {
				System.out.printf("array[%d][%d] = %d\t\t", i, j, array[i][j]);
			}
			System.out.println();
		}
	}
}
