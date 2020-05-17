package by.epam.novik.decomposition;


//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

public class Task10 {

	public static void main(String[] args) {
		
		int N = 1234567890;
		
		int[] array = arrayCreate(N);
		
		
		
		for (int i : array) { 
			
			System.out.print(i + " ");
			
		}
		
	}
	
	public static int[] arrayCreate(int number) {
		
		int numberDigit = numberDigit(number);
		
		int[] array = new int[numberDigit];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = digit(number, i+1);
			
		}
		
		return array;
		
	}
	
	public static int numberDigit(int number) {
		
		int numberDigit = 0;
		
		while (number > 0) {
			
			number = number/10;
			numberDigit++;
			
		}
		
		return numberDigit;
		
	}

	public static int digit(int number, int position) {
		
		int numberDigit = numberDigit(number);
		int digit;

		for (int i = numberDigit-1; i >= position; i--) {
			
			number = number/10;
			
		}
		
		digit = number % 10;
		
		return digit;
		
		
	}
	
}
