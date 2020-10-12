package by.epam.novik.array.line;

//7. Даны действительные числа a1,a2,...,an . Найти max( a1 + a2n,a2 + a2n−1,...,an + an+1) .

public class Task7 {

	public static void main(String[] args) {

		int N = 15;

		double[] array;

		array = createArray(N);

		printArray(array);

		double max = max(array);
		
		System.out.println(max);
		


	}

	public static double[] createArray(int length) {

		length = length >= 0 ? length : 0;

		double[] array = new double[length];
		Double value;

		for (int i = 0; i < array.length; i++) {

			value = (int) ((Math.random() - 0.5) * 1000) / 10.0;
			array[i] = value;

		}

		return array;

	}

	public static void printArray(double[] array) {

		System.out.println("");

		for (double d : array) {

			System.out.print(d + "  ");

		}

		System.out.println("");

	}

	public static double max(double[] array) {
		
		double max;
		
		if (array.length % 2 == 0) {
			
			max = maxEven(array);
			
		} else {
			
			max = maxOdd(array);
		}
		
		return max;
		
	}

	private static double maxEven(double[] array) {
		
		double max;
		double value;
		
		int begin = 0;
		int end = array.length-1;
		
		max = array[begin++] + array[end--];
				
		while (begin < end) {
			
			value = array[begin++] + array[end--];
			
			if (value > max) {
				
				max = value;
				
			}
			
		}
	
		
		return max;
		
	}
	
	
	private static double maxOdd(double[] array) {
		
		double max;
		double value;
		
		int begin = 0;
		int end = array.length-1;
		
		max = array[begin++] + array[end--];
				
		while (begin <= end) {
			
			value = array[begin++] + array[end--];
			
			if (value > max) {
				
				max = value;
				
			}
			
		}
	
		
		return max;
		
	}

}
