package by.epam.novik.decomposition;

//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {

	public static void main(String[] args) {
		
		int n = 5;
		
		searchNumbers(n);


	}



	public static int generateNumber(int amount, int start) {

		int number = 0;
		int digit;

		if (amount + start <= 10) {

			for (int i = 0; i <= amount; i++) {

				digit = getDigit(i, amount, start);
				number += digit;

			}
		}

		return number;

	}
	
	private static int getDigit(int position, int amount, int start) {
		
		int rank = (int) Math.pow(10, ((amount-1)-position));
		int digit = start + position;
		
		return digit * rank;

		
		
		
	}

	public static void printNumber(int number) {

		System.out.println("Число " + number + ".");

	}

	public static void searchNumbers(int amount) {

		if ((amount <= 9) && (amount > 1)) {
			
			int limit = 10 - amount;
			
		
			for (int i = 1; i <= limit; i++) {
				
				int number = generateNumber(amount, i);
				printNumber(number);
				
			}

		} else {
			
			System.out.println("Чисел удовлетворяющих условию задачи нет.");
			
		}

	}

}
