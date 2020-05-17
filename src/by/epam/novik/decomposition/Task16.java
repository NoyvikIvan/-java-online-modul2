package by.epam.novik.decomposition;

//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {

	public static void main(String[] args) {

		int n = 5;
		
		long sum = sumOddRank(n);
		
		System.out.println("Cумма всех " + n + " - значных чисел, содержащих только нечетные цифры: " + sum);
		
		int quantity = evenNumbers(sum);
		
		System.out.println("\nКолличество четных цифр в найденной сумме (" + sum + "): " + quantity);

	}

	private static boolean isAllDigitsOdd(int number, int amount) {

		for (int position = 1; position <= amount; position++) {

			int digit;

			digit = digit(number, position, amount);

			if (!isOddDigit(digit)) {

				return false;

			}
		}

		return true;
	}

	
	private static boolean isOddDigit(int digit) {

		return digit % 2 != 0;

	}

	
	private static boolean isEvenDigit(int digit) {

		return digit % 2 == 0;

	}

	
	private static int digit(long number, int position, int amount) {

		int digit;

		for (int i = amount - 1; i >= position; i--) {

			number = number / 10;

		}

		digit = (int)(number % 10);

		return digit;

	}

	
	public static long sumOddRank(int rank) {

		long sum;

		int start = (int) Math.pow(10, rank);
		int end = (int) Math.pow(10, rank + 1);
		int amount = rank;

		sum = 0;

		for (int number = start; number < end; number++) {

			if (isAllDigitsOdd(number, amount)) {

				sum += number;
			}

		}

		return sum;
	}
	
	
	private static int quantityDigit(long number) {

		int quantityDigit = 0;

		number = Math.abs(number);

		while (number > 0) {

			number = number / 10;
			quantityDigit++;

		}

		return quantityDigit;

	}

	public static int evenNumbers(long number) {
		
		int quantity = 0;
		int digit;
		
		int amount = quantityDigit(number);

		
		for (int position = 1; position <= amount; position++) {
			

			digit = digit(number, position, amount);

			if (isEvenDigit(digit)) {

				quantity++;

			}
		}
		
		return quantity;

	}

}
