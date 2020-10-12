package by.epam.novik.array.array;

/**
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *            1  2   3   .... n
 *            n  n-1 n-2 .... 1
 *            1  2   3   .... n
 *            n  n-1 n-2 .... 1
 *            .................
 *            n  n-1 n-2 .... 1
 */

public class Task4 {

	public static void main(String[] args) {

		int n = 4;

		int[][] array = createArray(n);
		
		if (array != null) {
			
			printArray(array);

		} else {
			
			System.out.println("Введены некорректные данные");
		}
		
		
	}
	
	public static int[][] createArray(int n) {

		int[][] array = null;
		
		if ((n % 2) == 0 && n >= 0) {
			
			array = new int[n][n];

			for (int i = 0; i < array.length; i++) {
				
				if ((i % 2) == 0) {
					
					for (int j = 0; j < array[i].length; j++) {

						array[i][j] = j + 1;

					}
					
				} else {
					
					for (int j = 0; j < array[i].length; j++) {

						array[i][j] = n - j;

					}
				}


			}
		} 		

		return array;

	}
	
	
	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
	}


}
