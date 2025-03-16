public class PracticeProblem {
	//
	public static int sum2D(int[][] array2D){
		int sum =0;
		for (int row = 0; row<array2D.length; row++){
		for (int col =0; col<array2D[row].length; col++){
		sum = sum+array2D[row][col];
		}
	}
		return sum;
}

	public static int sumRow(int[][] arrTwo, int rowNum){
		int sum = 0;
		for (int x =0; x<arrTwo[rowNum].length; x++){
		sum = sum+arrTwo[rowNum][x];
	}
		return sum;
	}


	public static int sumColumn(int[][] arr2D, int colNum){
		// row = y; col =x
		int sum=0;
		for (int y=0; y<arr2D.length; y++){
		sum = sum + arr2D[y][colNum];
	}
		return sum;
}

}