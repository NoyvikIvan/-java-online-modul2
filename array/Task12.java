package by.epam.novik.array.array;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.


public class Task12 {

	public static void main(String[] args) {

		int[][] array = createSquareArray(6);
		boolean up = true;
		
		printArray(array);
		
		sort(array, up);
		System.out.println("");
		System.out.println("Сортировка по возрастанию:");
		printArray(array);

		sort(array, !up);
		System.out.println("");
		System.out.println("Сортировка по убыванию:");
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
	
	public static void sort(int[][] array, boolean up) {
		
		
		for (int i = 0; i < array.length; i++) {
			
			sortLine(array[i], up);
			
		}
		
	}
	
	private static void sortLine(int[] array, boolean up) {
		
		for (int i = 0, j = i; i < array.length - 1; j = ++i) {
	        
        
	        int element = array[i + 1];
	        
	        if (up)	{
	        	while (element < array[j]) {
		        	
		        	array[j + 1] = array[j];
		        	
		            if (j-- == 0) {
		                break;
		            }
		        }
	        } else {
	        	while (element > array[j]) {
		        	
		        	array[j + 1] = array[j];
		        	
		            if (j-- == 0) {
		                break;
		            }
		        }
	        }
	        array[j + 1] = element;
	    }
		
	}
	


    

	
	
}
