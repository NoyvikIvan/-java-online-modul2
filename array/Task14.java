package by.epam.novik.array.array;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Task14 {

	public static void main(String[] args) {


		int[][] array = createRectangleArray();

		printArray(array);

	}

	public static int[][] createRectangleArray() {

		int n = 1 + (int) (Math.random() * 10);
		int m = n + (int) (Math.random() * 5);

		int[][] array = new int[m][n];

		for (int i = 0; i < array[0].length; i++) {

			int quantityOne = i + 1;
			int countOne = 0;

			for (int j = 0; j < array.length; j++) {

				if ((array.length - j) <= (quantityOne - countOne)) {
					
					array[j][i] = 1;
					
				} else {
					
					if (countOne < quantityOne) {

						array[j][i] = (int) (Math.random() + 0.5);
						if (array[j][i] == 1) {
							countOne++;
						}
						
					} else {
						array[j][i] = 0;
					}

				}
			}

		}

		return array;

	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
