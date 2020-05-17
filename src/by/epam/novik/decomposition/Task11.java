package by.epam.novik.decomposition;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {

	public static void main(String[] args) {

		int one = 3456;
		int two = -34569;
		
		printCompare(one, two);

	}

	public static void printCompare(int firstNumber, int secondNumber) {

		int compare = compareToQuantityDigit(firstNumber, secondNumber);

		if (compare > 0) {
			
			System.out.println("В первом числе(" + firstNumber + ") больше цифр.");
			
		} else {
			
			if (compare < 0) {
				
				System.out.println("Во втором числе(" + secondNumber + ") больше цифр.");

			} else {
				
				System.out.println("Колличество цифр в числах равны");

			}
		}

	}

	public static int compareToQuantityDigit(int firstNumber, int secondNumber) {

		int firstNumberDigit = quantityDigit(firstNumber);
		int secondNumberDigit = quantityDigit(secondNumber);

		return firstNumberDigit - secondNumberDigit;

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

}
