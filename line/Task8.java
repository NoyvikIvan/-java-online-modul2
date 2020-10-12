package by.epam.novik.array.line;

//8. Дана последовательность целых чисел
//a1,a2,..,an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1,a2,..,an) .

public class Task8 {

	public static void main(String[] args) {

		int[] array = createArray(17);

		printArray(array);
		
		int[] newArray = createNewArray(array);

		printArray(newArray);
		
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

	public static int min(int[] array) {

		int min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] < min) {

				min = array[i];

			}

		}

		return min;

	}

	public static int minCount(int[] array) {

		int count = 0;

		int min = min(array);

		for (int i = 0; i < array.length; i++) {

			if (array[i] == min) {

				count++;

			}

		}

		return count;

	}

	public static int[] createNewArray(int[] array) {

		int count = minCount(array);
		int min = min(array);

		int[] newArray = new int[array.length - count];

		int index = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] != min) {

				newArray[index++] = array[i];

			}

		}

		return newArray;
	}

}
