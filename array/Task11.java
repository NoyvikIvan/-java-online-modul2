package by.epam.novik.array.array;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task11 {

	public static void main(String[] args) {

		int[][] array = createRectangleArray(10, 20);
		
		printSolution(array);
		

		
	}

	public static int[][] createRectangleArray(int line, int column) {

		line = line >= 0 ? line : 0;
		column = column >= 0 ? column : 0;

		int[][] array = new int[line][column];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) (Math.random() * 15);

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
	
	public static void printLine(int[][] array) {

		int count;

		for (int i = 0; i < array.length; i++) {
			
			count = 0;
			
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j] == 5) {
					
					count++;
					
				}
			}
			
			if (count >= 3 ) {
				
				System.out.println("В строке №" + (i + 1) + " число 5 встречается три или более раз(" + count + ").");

			}
		}
	}
	
	
	public static void printSolution(int[][] array) {
		
		printArray(array);
		
		printLine(array);		
	}
	
	
	
	
	

	
}
