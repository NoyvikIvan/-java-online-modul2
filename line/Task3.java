package by.epam.novik.array.line;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task3 {

	public static void main(String[] args) {
		
		int N = 11;
		
		double[] array;
		
		array = createArray(-10, 2.5, N);
		
		printArray(array);

		printSolution(array);
		
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

	public static void printArray(double[] array) {

		System.out.println("");

		for (double d : array) {

			System.out.print(d + "  ");

		}

		System.out.println("");

	}

	private static int quantityPositiveElements(double[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {

				count++;

			}
		}

		return count;
	}

	private static int quantityZeroElements(double[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 0) {

				count++;

			}
		}

		return count;
	}

	private static int quantityNegativeElements(double[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] < 0) {

				count++;

			}
		}

		return count;
	}

	public static void printSolution(double[] array) {

		int positiveElements;
		int negativeElements;
		int zeroElements;

		positiveElements = quantityPositiveElements(array);
		negativeElements = quantityNegativeElements(array);
		zeroElements = quantityZeroElements(array);

		System.out.println("В массиве:\n" 
							+ positiveElements + " положительных элементов;\n" 
							+ negativeElements	+ " отрицательных элементов;\n" 
							+ zeroElements + " нулевых элементов.");

	}

}
