package by.epam.novik.array.line;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.


public class Task1 {

    public static void main(String[] args) {
    	
        int[] array = {12, 11, 4, 21, 4, 8};
        int K = 2;
        
        
        printSolution(array, K);
        
    }

    private static void printSolution(int[] array, int k) {
    	
        int sum = 0;
        int count = 0;
        

        for (int element : array) {
        	
            if (element % k == 0) {
            	
            	count++;
                sum += element;
                
            }
            
            if (count==3) {
            	System.out.print("Сумма трех чисел массива кратных " + k + ": " + sum);
            	break;
            	
            }
        }
        
        if (count<3) {
        	
            System.out.print("В заданном массиве нет трех элементов кратных " + k );

        }

    }

}
