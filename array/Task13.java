package by.epam.novik.array.array;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.


public class Task13 {

	public static void main(String[] args) {

		int[][] array = createSquareArray(6);
		printArray(array);

		System.out.println("\nСортировка по возрастанию:");
		sortColumnUp(array);
		printArray(array);
		
		System.out.println("\nСортировка по убыванию:");
		sortColumnDown(array);
		printArray(array);
		

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

	public static void sortColumnUp(int[][] array) {
		
		for (int i = 0; i < array[0].length; i++) {
			
			for (int j = 0, k = j; j < array.length - 1; k = ++j) {
				
				int element = array[j + 1][i];
				
				while (element < array[k][i]) {
					
					array[k + 1][i] = array[k][i];
					
					if (k-- == 0) {
						break;						
					}
					
				}
				array[k + 1][i] = element;
			}
		}
		
	}
	
	public static void sortColumnDown(int[][] array) {
		
		for (int i = 0; i < array[0].length; i++) {
			
			for (int j = 0, k = j; j < array.length - 1; k = ++j) {
				
				int element = array[j + 1][i];
				
				while (element > array[k][i]) {
					
					array[k + 1][i] = array[k][i];
					
					if (k-- == 0) {
						break;						
					}
					
				}
				array[k + 1][i] = element;
			}
		}
		
	}
	
	
	
	

}
