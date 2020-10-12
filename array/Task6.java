package by.epam.novik.array.array;

/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *               1 1 1 .... 1 1 1
 *               0 1 1 .... 1 1 0
 *               0 0 1 .... 1 0 0
 *               ................
 *               0 0 1 .... 1 0 0
 *               0 1 1 .... 1 1 0
 *               1 1 1 .... 1 1 1
 */

public class Task6 {

	public static void main(String[] args) {

		int n = 8;

		int[][] array = createArray(n);

		if (array != null) {

			printArray(array);

		} else {
			
			System.out.println("Введены некорректные данные.");
			
		}

	}

	public static int[][] createArray(int n) {

		int[][] array = null;

		if ((n % 2) == 0 && n >= 0) {

			array = new int[n][n];

			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < array[i].length; j++) {

					if (  
						((j < array.length - i) && (j >= i)) || 
					   ((j <= i) && (j >= (array.length - 1 - i)))  
					   ) {

						array[i][j] = 1;

					} else {

						array[i][j] = 0;

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
