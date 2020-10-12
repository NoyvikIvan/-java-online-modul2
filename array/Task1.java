package by.epam.novik.array.array;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {

	public static void main(String[] args) {

		int[][] array = createRectangleArray(5, 5);

		printArray(array);
		
		int count = 0;
		
		for (int i = 0; i < array[0].length; i++) {

			if ((i + 1) % 2 != 0 && array[0][i] > array[array.length - 1][i]) {
				
				count++;
				System.out.println( "Столбец №" + (i + 1));

				for (int j = 0; j < array.length; j++) {

					System.out.println(array[j][i]);

				}

			}
		}
		
		if (count == 0) {
			
			System.out.println("Подходящих столбцов нет");
		}

	}

	

	public static int[][] createRectangleArray(int line, int column) {

		line = line >= 0 ? line : 0;
		column = column >= 0 ? column : 0;

		int[][] array = new int[line][column];

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
