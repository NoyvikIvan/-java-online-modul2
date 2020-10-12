package by.epam.novik.array.array;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {

	public static void main(String[] args) {

		int[][] array = createRectangleArray(4, 6);
		
		printArray(array);
		
		int[] sumColumnArray = columnSum(array);
		
		for (int i : sumColumnArray) {
			System.out.print(i + "  ");
		}
		System.out.println("");
		int max = max(sumColumnArray);
		int column = maxColumn(sumColumnArray);
		
		if (max >= 0 && column > 0 ) {
			
			System.out.println("Максимальная сумма элементов столбца матрицы - " + max + " в " + column + " столбце");
			
		} else {
			
			System.out.println("Что-то пошло не так");
		}

		
		
	}
	
	public static int[][] createRectangleArray(int line, int column) {

		line = line >= 0 ? line : 0;
		column = column >= 0 ? column : 0;

		int[][] array = new int[line][column];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) (Math.random() * 100);

			}
		}

		return array;

	}
	
	private static boolean isPositive(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j] < 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int[] columnSum(int[][] array) {
		
		int[] sum = null;
		
		if (array != null && isPositive(array)) {
			
			sum = new int[array[0].length];
			
			for (int i = 0; i < sum.length; i++) {
				
				
				for (int j = 0; j < array.length; j++) {
					
					sum[i] += array[j][i];
					
				}
			}
			
		}
		
		return sum;
		
	}
	
	public static int max(int[] array) {
		
		if (array != null) {
			
			int max = array[0];
			
			for (int i = 1; i < array.length; i++) {
				
				if (max < array[i]) {
					
					max = array[i];
					
				}
			}
			
			return max;		
			
		}
		
		return -1;
		
	}

	public static int maxColumn(int[] array) {
		
		if (array != null) {
			
			int max = array[0];
			int index = 0;
			
			for (int i = 1; i < array.length; i++) {
				
				if (max < array[i]) {
					
					max = array[i];
					index = i;
					
				}
			}
			
			return index - 1;		
			
		}
		
		return -1;
		
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
