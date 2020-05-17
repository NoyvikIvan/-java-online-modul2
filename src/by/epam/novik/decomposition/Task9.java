package by.epam.novik.decomposition;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Task9 {

	public static void main(String[] args) {

		double x = 4;
		double y = 3;
		double z = 5;
		double t = 3;
		double cornerXY = 90;

		printQuadrangleArea(x, y, z, t, cornerXY);

	}

	public static void printQuadrangleArea(double firstSide, double secondSide, double thirdSide, double fourthSide, double cornerXY) {

		if (cornerXY == 90) {

			double hypotenuse;

			hypotenuse = hypotenuse(firstSide, secondSide);

			if (isTriangle(thirdSide, fourthSide, hypotenuse)) {

				double quadrangleArea;

				quadrangleArea = areaRectangularQuadrangle(firstSide, secondSide, hypotenuse, thirdSide, fourthSide);

				System.out.println("Площадь прямоугольника равна: " + quadrangleArea);

			} else {

				System.out.println("Прямоугольника с прямым углом и заданными сторонами не существует.");

			}

		} else {

			System.out.println("Угол прямоугольника не равен 90°");

		}
	}

	public static double triangleArea(double firstSide, double secondSide, double thirdSide) {

		double p;
		double s;

		p = (firstSide + secondSide + thirdSide) / 2;
		s = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));

		return s;
	}

	public static double hypotenuse(double a, double b) {

		double hypotenuse;

		hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		return hypotenuse;

	}

	public static boolean isTriangle(double a, double b, double c) {

		if (a + b > c && a + c > b && c + b > a) {

			return true;

		}

		return false;

	}

	public static double areaRectangularQuadrangle(double firstSide, double secondSide, double hypotenuse, double thirdSide, double fourthSide) {
		
		double firstTriangleArea;
		double secondTriangleArea;
		double quadrangleArea;

		firstTriangleArea = triangleArea(firstSide, secondSide, hypotenuse);
		secondTriangleArea = triangleArea(thirdSide, fourthSide, hypotenuse);
		quadrangleArea = firstTriangleArea + secondTriangleArea;
		
		return quadrangleArea;

	}
}
