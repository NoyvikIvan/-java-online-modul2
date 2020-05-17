package by.epam.novik.decomposition;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведеннAЯ 
//в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

public class Task14 {

	public static void main(String[] args) {

		int n = 787654;
		
		searchArmstrongNumber(n);


	}

	public static int sumDigit(int number) {

		int sum = 0;
		number = Math.abs(number);

		while (number > 0) {

			int remainder = number % 10;

			sum += remainder;
			number /= 10;

		}

		return sum;

	}

	public static int quantityDigit(int number) {

		int quantityDigit = 0;

		number = Math.abs(number);

		while (number > 0) {

			number = number / 10;
			quantityDigit++;

		}

		return quantityDigit;

	}

	private static int positivePow(int a, int b) {

		double result;

		result = Math.pow(a, b);

		if (result > Integer.MAX_VALUE) {

			return -1;
		}

		return (int) result;
	}

	public static boolean isArmstrongNumber(int number) {

		int armstrongValue = positivePow(sumDigit(number), quantityDigit(number));

		return number == armstrongValue;

	}

	public static void printArmstrongNumber(int number) {

		System.out.println("Число " + number + " - является числом Армстронга.");

	}

	public static void searchArmstrongNumber(int limit) {

		int count = 0;

		for (int i = 0; i < limit; i++) {

			if (isArmstrongNumber(i)) {

				count++;

				if (count == 1) {

					System.out.println("Чсла Армстронга на промежутке от 1 до " + limit + ":/n");

				}

				printArmstrongNumber(i);

			}
		}

		if (!(count == 0)) {
			
			System.out.println("/nКоличество чисел Армстронга - " + count);
			
		} else {
			
			System.out.println("На заданном промежутке нет чисел Армстронга.");

		}


	}

}
