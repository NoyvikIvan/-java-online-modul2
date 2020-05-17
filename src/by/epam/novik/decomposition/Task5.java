package by.epam.novik.decomposition;


//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).


public class Task5 {

	public static void main(String[] args)  {
		
		int[] array = {7, 7, 7, 7, 7, 7, 7, 7, 7};

		try {
			System.out.println("Второе по величине число - " + nextMax(array));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		int[] array1 = {5, -3, 7, 3, 1, -8, 7, 4, 6};

		try {
			System.out.println("Второе по величине число - " + nextMax(array1));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static int maxNumber(int[] array, int namStart) {
		
		int maxNumber = namStart;
		int max = array[namStart];
		
		for (int i = namStart + 1; i < array.length; i++ ) {
			
			if (array[i] > max) {
				
				max = array[i];
				maxNumber = i;
				
			}
		}
		
		return maxNumber;
		
	}
	
	public static void sort(int[] array) {
		
		int maxNumber;
		
		
		for (int i = 0; i < array.length; i++) {
			
			maxNumber = maxNumber(array, i);
			
			int third = array[i];
			array[i] = array[maxNumber];
			array[maxNumber] = third;
			
		}
		
	}
	
	public static int[] copy(int[] array) {
		
		int [] copy = new int[array.length];
		
		for (int i = 0; i < copy.length; i++) {
			
			copy[i] = array[i];
			
		}
		
		return copy;
	}
	
	
	
	public static int nextMax(int[] array) throws Exception {
		
		int[] copy = copy(array);
		
		sort(copy);
		
		if (copy[0]==copy[copy.length-1]) {
			
			throw new Exception("В массиве все элементы равны");
			
		}
		
		int max = copy[0];
		int nextNumber = 1;
		
		while (nextNumber < copy.length - 1) {
			
			if (max == copy[nextNumber]) {
				max = copy[nextNumber];
				nextNumber++;
			} else {
				
				break;
			}
			
		}
		
		return copy[nextNumber];
		
		
	}
	

}
