package by.epam.novik.decomposition;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
//Для решения задачи использовать декомпозицию.

public class Task13 {

	public static void main(String[] args) {

		int n = 50;

		printTwins(n);

	}

	public static void printTwins(int n) {

		if (n > 2) {

			int limit = 2 * n;
			int i = n;

			while (getNextTwin(i) <= limit) {

				printNexTwins(i);
				i++;

			}

		} else {

			System.out.println("Некорректный параметр метода.");

		}
	}

	public static int getNextTwin(int number) {

		return number + 2;

	}

	public static int getPreviousTwin(int number) {

		return number - 2;

	}

	public static void printNexTwins(int number) {

		System.out.println("Пара близнец: " + number + " и " + getNextTwin(number) + ".");
	}

	public static void printPreviousTwins(int number) {

		System.out.println("Пара близнец: " + getPreviousTwin(number) + " и " + number + ".");
	}

}
