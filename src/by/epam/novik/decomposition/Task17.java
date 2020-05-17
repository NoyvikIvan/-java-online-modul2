package by.epam.novik.decomposition;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {
		
		int number = 123456789;
		
		int quantity;
		
		quantity = quantityDeductOperations(number);
		
		System.out.println("Необходимо действий: " + quantity);

	}

	private static int sumDigit(long number) {

		int sum = 0;
		int digit;

		int quantityDigit = quantityDigit(number);

		for (int position = 1; position <= quantityDigit; position++) {

			digit = digit(number, position, quantityDigit);
			sum += digit;

		}

		return sum;

	}

	private static int digit(long number, int position, int amount) {

		int digit;

		for (int i = amount - 1; i >= position; i--) {

			number = number / 10;

		}

		digit = (int) (number % 10);

		return digit;

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

	private static long deductSum(long number) {

		return number - sumDigit(number);

	}
	
	public static int quantityDeductOperations(long number) {
		
		int quantity = 0;
		
		number = Math.abs(number);
		
		while (number!=0) {
			
			quantity++;
			number = deductSum(number); 
			
		}
		
		return quantity;
		
	}

}
