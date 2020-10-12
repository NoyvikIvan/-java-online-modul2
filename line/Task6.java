package by.epam.novik.array.line;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task6 {

	public static void main(String[] args) {

		int N = 15;

		double[] array;

		array = createArray(N);

		printArray(array);
		
		printSolution(array);
		

	}

	public static double[] createArray(int length) {

		length = length >= 0 ? length : 0;

		double[] array = new double[length];
		Double value;

		for (int i = 0; i < array.length; i++) {

			value = (int) ((Math.random() - 0.5) * 1000) / 10.0;
			array[i] = value;

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

	private static boolean isSimple(int number) {

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				return false;

			}

		}

		return true;

	}

	private static double unusualSum(double[] array) {

		double sum = 0;
		int number;

		for (int i = 0; i < array.length; i++) {
			number = i + 1;

			if (isSimple(number)) {

				sum += array[i];
			}

		}

		return sum;

	}

	public static void printSolution(double[] array) {

		if (array.length > 1) {

			double sum = unusualSum(array);

			System.out.println("Сумма чисел, порядковые номера которых являются простыми числами " + sum);

		} else {
			
			System.out.println("Невозможно выполнить суммирование.");
			
			
		}
		
		

	}

}
