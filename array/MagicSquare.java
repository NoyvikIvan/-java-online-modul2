package by.epam.novik.array.array;


//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//				6 1 8
//				7 5 3
//				2 9 4

public class MagicSquare {

	public static void main(String[] args) {

		
		MagicSquare square5 = new MagicSquare(5);
		square5.showMagic();
		System.out.println();
		
		MagicSquare square4 = new MagicSquare(4);
		square4.showMagic();
		System.out.println();	
		
		MagicSquare square3 = new MagicSquare();
		square3.showMagic();
		System.out.println();
		
	}

	private int squareLevel;
	
	
	
	

	public MagicSquare() {
		super();
		this.squareLevel = 3;

		
	}

	public MagicSquare(int squareLevel) {
		super();
		this.squareLevel = squareLevel;
	}

	private int [][] oddSquare(int squareLevel) {

		int [][] square = new int[squareLevel][squareLevel];

		int a = 0;
		int b = (squareLevel - 1) / 2;
		square[a--][b++] = 1;
		
		
		for (int i = 2; i <= squareLevel * squareLevel; a--, b++, i++) {
			
			if (a < 0 && b > squareLevel - 1) {
				a += 2;
				b--;
			}
			
			if (a < 0) {
				a = squareLevel - 1;
			}
			
			if (b > squareLevel - 1) {
				b = 0;
			}
			
			if (square[a][b] != 0) {
				a += 2;
				b--;
			}
			
			square[a][b] = i;
		}
		
		return square;
		
	}
	
	private int [][] leapSquare(int squareLevel) {
    	
        int[][] square = new int[squareLevel][squareLevel];
        int a = 1;

        
        for (int i = 0; i < squareLevel; i++) {
            for (int j = 0; j < squareLevel; j++) {
            	
                square[i][j] = a;
                a++;
            }
        }

        for (int i = 0; i < squareLevel; i += 4) {
            for (int j = 1; j < squareLevel; j += 4) {
            	
                square[i][j] = squareLevel * squareLevel + 1 - square[i][j];
                square[i + 3][j] = squareLevel * squareLevel + 1 - square[i + 3][j];
                square[i][j + 1] = squareLevel * squareLevel + 1 - square[i][j + 1];
                square[i + 3][j + 1] = squareLevel * squareLevel + 1 - square[i + 3][j + 1];
            }
        }
        
        for (int i = 1; i < squareLevel; i += 4) {
            for (int j = 0; j < squareLevel; j += 4) {
            	
                square[i][j] = squareLevel * squareLevel + 1 - square[i][j];
                square[i + 1][j] = squareLevel * squareLevel + 1 - square[i + 1][j];
                square[i][j + 3] = squareLevel * squareLevel + 1 - square[i][j + 3];
                square[i + 1][j + 3] = squareLevel * squareLevel + 1 - square[i + 1][j + 3];
            }
        }
        
        return square;
    }
	
	
	
	
	
	 private int[][] heroicSquare(int squareLevel) {
		 
	        int[][] square = new int[squareLevel][squareLevel];
	        
	        int hafl = squareLevel / 2;
	        int max = squareLevel * squareLevel + 1;
	        int[][] leapSquare = leapSquare(squareLevel - 2);
	        
	        for (int i = 1; i < squareLevel - 1; i++) {
	            for (int j = 1; j < squareLevel - 1; j++) {
	                square[i][j] = leapSquare[i - 1][j - 1] + 2 * (squareLevel - 1);
	            }
	        }
	        
	        square[0][0] = 3 * hafl - 1;
	        square[0][squareLevel - 1] = 1;
	        square[squareLevel - 1][0] = max - 1;
	        square[squareLevel - 1][squareLevel - 1] = max - 3 * hafl + 1;

	        int i, j;
	        
	        for (i = 1; i <= hafl - 2; i++) {
	            square[0][i] = 2 * i + 1;
	        }
	        
	        for (j = 1; j <= hafl; j++) {
	            square[0][j + i - 1] = max - 2 * j;
	        }
	        
	        for (j = 1; j < squareLevel - 1; j++) {
	            square[squareLevel - 1][j] = squareLevel * squareLevel + 1 - square[0][j];
	        }
	        
	        square[1][0] = 2 * hafl - 1;
	        
	        for (i = 1; i <= hafl / 2; i++) {
	            square[i + 1][0] = 3 * hafl - 1 - i;
	        }
	        
	        i--;
	        
	        for (j = 1; j <= hafl / 2 + 1; j++) {
	            square[i + j + 1][0] = max - 4 * hafl + 1 + j;
	        }
	        
	        j--;
	        
	        for (int q = 1; q <= hafl / 2 - 1; q++, i++) {
	            square[i + j + q + 1][0] = 3 * hafl - 1 + q;
	            square[i + j + q + 2][0] = max - 2 * hafl - q;
	        }

	        for (i = 1; i < squareLevel - 1; i++) {
	            square[i][squareLevel - 1] = squareLevel * squareLevel + 1 - square[i][0];
	        }

	        return square;
	    }
	 
	 public int [][] createMagicSquare(){
		 
			int[][] square;

			if ((squareLevel - 1) % 2 == 0) {

				square = oddSquare(squareLevel);

			} else if (squareLevel % 4 == 0) {

				square = leapSquare(squareLevel);

			} else {

				square = heroicSquare(squareLevel);
			}

			return square;

	 }
	 
	 public void showMagic(){
		 
		 int[][] square = createMagicSquare();
		 
		 for (int[] array : square) {
				for (int element : array) {
					System.out.print(element + "    ");
				}
				System.out.println("\n");
			}
			
	 }

}
