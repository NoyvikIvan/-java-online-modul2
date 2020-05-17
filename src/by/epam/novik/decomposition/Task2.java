package by.epam.novik.decomposition;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {

	public static void main(String[] args) {
		
		System.out.println(maxCommonDivisor(16, 64, 256, 1024));

	}

	public static int maxCommonDivisor(int a, int b, int c, int d) {

		int min = Math.min(Math.min(a, b), Math.min(c, d));

		for (int i = min; i >= 1; i--) {

			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {

				return i;

			}
		}
		return 1;
	}

}
