package by.epam.novik.decomposition;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {

	public static void main(String[] args) {

		int K = 5;
		int N = 567;


		int[] array = arrayCreate(K, N);
		

		for (int i : array) {

			System.out.print(i + " ");

		}

	}

	public static int[] arrayCreate(int sum, int limit) {

		if (min(sum) != 0 && min(sum) <= limit) {

			int amountElements = amountElements(sum, limit);

			int[] array = new int[amountElements];

			for (int i = 1; i <= limit; i++) {

				if (sumDigit(i) == sum) {

					for (int j = 0; j < array.length; j++) {

						if (array[j] == 0) {

							array[j] = i;
							break;

						}
					}
				}
			}

			return array;

		} else {

			return new int[0];

		}
	}

	public static int sumDigit(int number) {

		int sum = 0;

		while (number > 0) {

			int remainder = number % 10;

			sum += remainder;
			number = number / 10;

		}

		return sum;

	}

	public static int amountElements(int sum, int limit) {

		int amountElements = 0;

		for (int i = 1; i <= limit; i++) {

			if (sumDigit(i) == sum) {

				amountElements++;

			}
		}

		return amountElements;

	}

	public static int min(int sum) {

		int min = 1;

		sum = Math.abs(sum);

		while (min <= Integer.MAX_VALUE) {

			if (sumDigit(min) == sum) {

				return min;

			} else {
				min++;
			}

		}

		return 0;

	}

}
