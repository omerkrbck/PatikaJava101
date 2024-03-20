
public class Main {

	public static void main(String[] args) {

		
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        
        int rowNumber = matrix.length;
        int columnNumber = matrix[0].length;
        
        int[][] transpozMatrix = new int[columnNumber][rowNumber];
        
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                transpozMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("**********   Matris Transpozunu Bulma   **********");
        System.out.println("**********   Matris   **********");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        
        System.out.println("**********   Matrisin Transpozu   **********");
        for (int i = 0; i < columnNumber; i++) {
            for (int j = 0; j < rowNumber; j++) {
                System.out.print(transpozMatrix[i][j] + " ");
            }
            System.out.println();
        }
	}
}
