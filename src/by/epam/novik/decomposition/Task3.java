package by.epam.novik.decomposition;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

public class Task3 {
	
	public static void main(String[] args) {
		
		System.out.println(equilateralHexagonArea(3));
		
	}
	
	public static double height (double side) {
		
		return side*Math.sqrt(3)/2;
		
	}
	
	
	public static double equilateralTriangleArea (double side) {
		
		return side*height(side)/2;
		
	}
	
	
	public static double equilateralHexagonArea (double side) {
		
		return 6*equilateralTriangleArea(side);
		
	}

}
