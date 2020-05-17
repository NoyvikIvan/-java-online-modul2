package by.epam.novik.decomposition;


//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
	
	public static void main(String[] args) {
        System.out.print("Cуммы факториалов всех нечетных чисел от 1 до 9 = " + oddFactorialSum(1, 9));
    }

	public static int factorial(int number) {
		
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
        	
            factorial *= i;
            
        }

        return factorial;
        
    }
	
	
	public static boolean isOdd(int number) {
		
        return number % 2 == 0 ? true : false;
        
    }
	
	
	public static int oddFactorialSum(int start, int end) {
		
        int oddFactorialSum = 0;

        for (int i = start; i <= end; i++) {
        	
            if (isOdd(i)) {
            	
            	oddFactorialSum += factorial(i);

            }
        }
        
        return oddFactorialSum;
        
    }


	

}
