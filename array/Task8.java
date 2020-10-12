package by.epam.novik.array.array;

import java.util.Scanner;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

public class Task8 {

	public static void main(String[] args) {

		double[][] array = createRectangleArray(4, 6);
		
		printArray(array);
		
		int firstColumn;
		int secondCoulumn;

		firstColumn = userInput("первый столбец");
		secondCoulumn = userInput("второй столбец");
		
		if (swichColumn(array, firstColumn, secondCoulumn)) {
			
			printArray(array);

		} else {
			
			System.out.println("Операция неуспешна, некорректно введены данные.");
			
		}
	}
	
	public static double[][] createRectangleArray(int line, int column) {

		line = line >= 0 ? line : 0;
		column = column >= 0 ? column : 0;

		double[][] array = new double[line][column];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) ((Math.random() - 0.5) * 200)/10.0;

			}
		}

		return array;

	}

	
	public static boolean swichColumn(double[][] array, int firstColumn, int secondCoulumn) {
		
		if ((firstColumn > 0 &&  firstColumn <= (array[0].length ))
			&& (secondCoulumn > 0 &&  secondCoulumn <= (array[0].length )) ) {
			
			for (int i = 0; i < array.length; i++) {
				
				double third = array[i][firstColumn-1];
				array[i][firstColumn-1] = array[i][secondCoulumn-1];
				array[i][secondCoulumn-1] = third;
				
			} 
			
			return true;
			
		} 

		return false;
		
	}
	
	public static void printArray(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static int userInput(String input) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите " + input + " >>");
		
		while (!sc.hasNextInt()) {
			
			sc.nextLine();
			System.out.println("Вы ввели некорректное значение.");
			System.out.println("Введите " + input + " >>");

			
		}
		
		return sc.nextInt();
		
		
		
	}

}
