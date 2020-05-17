package by.epam.novik.decomposition;

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task4 {

	public static void main(String[] args) {

		int[] xCoord = {3, 4, 7, -3, -5, -4};
		int[] yCoord = {-2, 3, 5, 3, -3, 0};

		int[][] point = { xCoord, yCoord };

		maxRange(point[0], point[1]);

	}

	public static double rangePoint(int x1, int y1, int x2, int y2) {

		double range;

		range = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		range = Math.sqrt(range);

		return range;

	}

	public static void maxRange(int[] xCoord, int[] yCoord) {

		if (yCoord.length == xCoord.length && yCoord.length > 1) {

			double maxRange = rangePoint(xCoord[0], yCoord[0], xCoord[1], yCoord[1]);
			double range;
			int firstPaint = 1;
			int secondPoint = 2;

			for (int i = 0; i < yCoord.length; i++) {

				for (int j = i + 1; j < yCoord.length; j++) {

					range = rangePoint(xCoord[i], yCoord[i], xCoord[j], yCoord[j]);

					if (range > maxRange) {

						maxRange = range;
						firstPaint = i + 1;
						secondPoint = j + 1;

					}
				}
			}

			System.out.println("Наибольшее расстояние - " + maxRange + " между " + firstPaint + " и " + secondPoint + " точками.");

		} else {

			System.out.println("Переданы некорректные аргументы");

		}
	}

}
