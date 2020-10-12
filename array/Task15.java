package by.epam.novik.array.array;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.


public class Task15 {

	public static void main(String[] args) {

		int[][] array = createRectangleArray(7, 7);
		
		printArray(array);
		changeArray(array);
		System.out.println("");
		printArray(array);
		

		
		
	}
	
	public static int[][] createRectangleArray(int line, int column) {

		line = line >= 0 ? line : 0;
		column = column >= 0 ? column : 0;

		int[][] array = new int[line][column];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) (Math.random() * 30);

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
	
	private static int max(int[][] array) {
		
		int max;
		int[] temp;
		temp = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			
			temp[i] = max(array[i]);
						
		}
		
		max = max(temp);
		return max;
		
		
	}
	
	private static int max(int[] array) {
		
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
			}
			
		}
		
		return max;
		
	}
	
	public static void changeArray(int[][] array) {
		
		int max = max(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j] % 2 != 0) {
					
					array[i][j] = max;
					
				}
				
			}
		}
		
	}
	
	


}
