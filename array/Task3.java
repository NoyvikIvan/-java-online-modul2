package by.epam.novik.array.array;


//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.


public class Task3 {

	public static void main(String[] args) {

		int k = 3;
		int p = 6;
		
		int[][] array = createSquareArray(4);

		printArray(array);
		
		System.out.println("");
		
		printSolution(array, k, p);
		
		
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
	
	public static void printLine(int[][] array, int line) {
		
		if (line > 0 && line <= array.length) {

			for (int i = 0; i < array[line-1].length; i++) {
				
				System.out.print(array[line-1][i] + "  ");
			
			}
			
			System.out.println("");
			
		} else {
			
			System.out.println("Некорректно передан номер строки.");
			
		}
		
	}
	
	public static void printColumn(int[][] array, int column) {
		
		if (column > 0 && column <= array[0].length) {

			for (int i = 0; i < array.length; i++) {
				
				System.out.println(array[i][column-1] + "  ");
			
			}
			
		} else {
			
			System.out.println("Некорректно передан номер столбца.");
			
		}
		
	}

	
	public static void printSolution(int[][] array, int line, int column ) {


		printLine(array, line);
		printColumn(array, column);
			
		
		
	}


}
