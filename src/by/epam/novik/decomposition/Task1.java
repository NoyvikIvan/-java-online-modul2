package by.epam.novik.decomposition;


//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:   HOK(A,B) = (A*B)/ НОД(A,B)

public class Task1 {
	
	public static void main (String[] args) {
		
		System.out.println(maxCommonDivisor(32, 40));
		System.out.println(minCommonMultiple(7, 11));
		System.out.println(minCommonMultiple(110, 25));
		
		
	
	}
	
	public static int maxCommonDivisor(int a, int b) {
		
		for (int i = a; i >= 1 ; i--) {
			
			if (a % i == 0) {
				
				for (int j = b; j >= 1; j--) {
					
					if (b % j == 0) {
						
						if (i==j) {
							return i;
						}
					}
				}
			}
		}
		return 1;
	}
	
	public static int minCommonMultiple(int a, int b) {
		
		return (a * b)/maxCommonDivisor(a, b);
		
		
	}
	

}
