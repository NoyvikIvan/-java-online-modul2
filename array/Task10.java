package by.epam.novik.array.array;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

	public static void main(String[] args) {

		int[][] array = createSquareArray(8);
		
		printArray(array);
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				if (i == j && array[i][j] > 0) {
					
					System.out.print(array[i][j] + "; ");
					
				}
			}
		}

	}
	
	public static int[][] createSquareArray(int size) {

		size = size >= 0 ? size : 0;

		int[][] array = new int[size][size];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) ((Math.random() - 0.5) * 20);

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
