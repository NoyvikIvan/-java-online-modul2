package by.epam.novik.array.array;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

	public static void main(String[] args) {

		int[][] array = createSquareArray(5);
		
		printArray(array);
		
		System.out.println("");
		
		printSolution(array);
		
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
	
	public static void printSolution(int[][] array) {
		
		int size = array.length;
		
		if (array.length == array[size-1].length) {
			
			for (int i = 0; i < size; i++) {
				
				for (int j = 0; j < i; j++) {
					
					System.out.print("\t");
				}
				
				System.out.println(array[i][i]);

			}
		} else {
			
			System.out.println("Неверно переданы параметры");
		}
		
		
		
		
		
	}


}
