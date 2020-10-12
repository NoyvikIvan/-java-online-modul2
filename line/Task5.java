package by.epam.novik.array.line;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {

	public static void main(String[] args) {

		int[] array;
		
		array = createArray(20);
		
		printArray(array);
		System.out.println("");
		
		printSolution(array);
		
		

	}

	public static int[] createArray(int length) {

		length = length >= 0 ? length : 0;

		int[] array = new int[length];
		int value;

		for (int i = 0; i < array.length; i++) {

			value = (int) ((Math.random() - 0.5) * 100);
			array[i] = value;

		}

		return array;

	}

	public static void printArray(int[] array) {

		System.out.println("");

		for (int d : array) {

			System.out.print(d + "  ");

		}

		System.out.println("");

	}

	private static void printElement(int element, int index) {

		System.out.println("Элемент - " + element + ", индекс - " + index);

	}

	public static void printSolution(int[] array) {

		for (int i = 1; i <= array.length; i++) {

			if (i > array[i-1]) {
				
				printElement(array[i-1], i);

			}

		}

	}

}
