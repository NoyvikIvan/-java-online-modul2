package by.epam.novik.decomposition;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = 5;
		b = 2;
		c = 8;

		if (isSimple(a, b, c)) {
			
			System.out.println("Числа взаимно простые");
			
		} else {

			System.out.println("Числа не взаимно простые");
			
		}

	}

		
	public static int maxCommonDivisor(int a, int b) {

		int maxCommonDivisor = 1;
		int min = Math.min(a, b);

		for (int i = 2; i <= min; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				maxCommonDivisor = i;

			}
		}

		return maxCommonDivisor;

	}
	
	

	public static boolean isSimple(int a, int b, int c) {

		int maxCommonDivisorAB = maxCommonDivisor(a, b);
		int maxCommonDivisorBC = maxCommonDivisor(c, b);
		int maxCommonDivisorCA = maxCommonDivisor(a, c);
		
		int maxCommonDivisor = Math.max(maxCommonDivisorCA, Math.max(maxCommonDivisorAB, maxCommonDivisorBC));

		return maxCommonDivisor == 1;
	}

}
