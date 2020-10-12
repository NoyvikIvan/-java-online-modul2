package by.epam.novik.array.array;

/**
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * 
 * A[I,J] = sin((I² - J²) / N)
 * 
 * и подсчитать количество положительных элементов в ней
 */


public class Task7 {

	public static void main(String[] args) {

		int n = 5;

		double[][] array = createArray(n);
		int count = positivElements(array);

		if (array != null) {

			printArray(array);
			System.out.println("Колличество положительных элементов: " + count);

		} else {
			
			System.out.println("Введены некорректные данные.");
			
		}

	}

	public static double[][] createArray(int n) {

		double[][] array = null;

		if (n >= 0) {

			array = new double[n][n];

			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < array[i].length; j++) {


						array[i][j] = ((int)(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n) * 100)) / 100.0;



				}

			}
		}

		return array;

	}

	public static void printArray(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static int positivElements(double[][] array) {
		
        int count = 0;
        
        for (double[] line : array) {
        	
            for (double column : line) {
            	
                if (column > 0) {
                	
                    count++;
                	
                }
            }
        }
        return count;
    }

}
