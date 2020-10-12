package by.epam.novik.array.line;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй

//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {

	public static void main(String[] args) {
		int n = 7;

		int[] array = createArray(n);

		printArray(array);
		
		arrayCompress(array);
		
		printArray(array);
		

	}

	public static void arrayCompress(int[] array) {

		int holdPosition = (array.length + 1) / 2;
		int bias = 0;

		for (int i = 0; i < array.length; i++) {

			if (i < holdPosition) {

				array[i] = array[i + bias];
				bias++;

			} else {

				array[i] = 0;

			}

		}

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

}
