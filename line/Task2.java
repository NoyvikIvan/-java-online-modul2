package by.epam.novik.array.line;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task2 {

	public static void main(String[] args) {

		double[] array = createArray(3, 1.5, 6);
		
		printArray(array);

		double Z = 6;

		int count = changeArrayValue(array, Z);
		
		printArray(array);

		printSolution(count);
		

	}

	public static double[] createArray(double start, double step, int length) {

		length = length >= 0 ? length : 0;

		double[] array = new double[length];
		double value = start;

		for (int i = 0; i < array.length; i++) {

			array[i] = value;
			value += step;

		}

		return array;

	}

	public static int changeArrayValue(double[] array, double newValue) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > newValue) {

				array[i] = newValue;
				count++;

			}
		}

		return count;
	}
	
	public static void printSolution(int count ) {
		
		if (count > 0) {
			
			System.out.println("Выполнено замен: " + count + ".");
			
		} else {
			
			System.out.println("Замен не выполнялось.");
			
		}
		
	}
	
	public static void printArray(double[] array) {
		
		System.out.println("");
		
		for (double d : array) {
			
			System.out.print(d + "  ");
			
		}
		
		System.out.println("");
		
	}

}
