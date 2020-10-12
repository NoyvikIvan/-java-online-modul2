package by.epam.novik.array.line;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class Task9 {

	public static void main(String[] args) {

		int n = 10;

		int[] array = createArray(n);

		printArray(array);
		
		int result;
		
		result = taskBranch(array) ? min(array) : repeatNumber(array);
		
		System.out.println("Результат: " + result);

	}

	public static int[] createArray(int length) {

		length = length >= 0 ? length : 0;

		int[] array = new int[length];
		int value;

		for (int i = 0; i < array.length; i++) {

			value = (int) ((Math.random() - 0.5) * 10);
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

	public static int countValue(int[] array, int index) {

		if (index < 0 || index >= array.length) {

			return -1;

		}

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[index] == array[i]) {

				count++;

			}
		}

		return count;

	}

	public static int indexMaxRepeat(int[] array) {

		int countMax;
		int index = 0;
		int count;

		countMax = countValue(array, index);

		for (int i = 1; i < array.length; i++) {

			count = countValue(array, i);

			if (count > countMax) {

				countMax = count;
				index = i;

			}

		}

		return index;

	}
	
	public static int repeatNumber(int[] array) {
		
		int index = indexMaxRepeat(array);
		
		return array[index];
		
	}

	public static boolean taskBranch(int[] array) {

		int index = indexMaxRepeat(array);
		int count = countValue(array, index);
		int nexCount;

		for (int i = 0; i < array.length; i++) {

			if (array[i] != array[index]) {

				nexCount = countValue(array, i);

				if (count == nexCount) {

					return true;

				}
			}
		}

		return false;

	}

	public static int min(int[] array) {

		int index = indexMaxRepeat(array);
		int count = countValue(array, index);
		int min = array[index];
		int nexCount;


		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {

				nexCount = countValue(array, i);

				if (nexCount == count) {

					min = array[i];

				}
			}
		}
		
		return min;


	}

}
