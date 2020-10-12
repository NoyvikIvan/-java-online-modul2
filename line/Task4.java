package by.epam.novik.array.line;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task4 {

	public static void main(String[] args) {

		double[] array;
		
		array = createArray(15);
		
		printArray(array);
		
		swapMinMax(array);
		
		printArray(array);

		
		

	}

	public static double[] createArray(int length) {

		length = length >= 0 ? length : 0;

		double[] array = new double[length];
		Double value;
		

		for (int i = 0; i < array.length; i++) {
			
			value = (int)((Math.random() - 0.5) * 1000)/10.0;
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
	
	public static void swapMinMax(double[] array) {
		
        int minIndex = 0;
        int maxIndex = 0;

        double min = array[0];
        double max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
            	
                min = array[i];
                minIndex = i;

            } 
            
            if (array[i] > max) {
            	
                max = array[i];
                maxIndex = i;
                
            }
        }

        array[maxIndex] = min;
        array[minIndex] = max;
    }

}
