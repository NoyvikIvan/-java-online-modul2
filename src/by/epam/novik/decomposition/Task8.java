package by.epam.novik.decomposition;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class Task8 {

	public static void main(String[] args) {

		int[] D = { 0, 2, 4, 3, 5, 7, -12 };

		printSumThreeElement(D, 1);
		printSumThreeElement(D, 3);
		printSumThreeElement(D, 4);
		printSumThreeElement(D, 5);

	}

	private static int sumThreeElement(int[] array, int start) {

		int sum;

		sum = array[start] + array[start + 1] + array[start + 2];

		return sum;

	}

	private static boolean isArrayHaveThreeElement(int[] array, int start) {

		if (start >= 0 && start < array.length - 2) {

			return true;

		}
		
		return false;

	}
	
	public static void printSumThreeElement(int[] array, int start) {
		
		if (isArrayHaveThreeElement(array, start)) {
			
			System.out.println("Cумма трех последовательно расположенных элементов массива с номерами от " + start + " до " + (start + 2) + " = "
					+ sumThreeElement(array, start));
			
		} else {
			
			System.out.println("Введены некоректные данные");
			
		}
		
	}

}
