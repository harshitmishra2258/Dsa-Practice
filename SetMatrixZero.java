public class SetMatrixZero{
    public static void  setMatrixZero(int arr[][]) {
        boolean[] rows = new boolean[arr.length];
        boolean[] cols = new boolean[arr[0].length];

        // First pass: mark the rows and columns that need to be zeroed
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Second pass: set the marked rows and columns to zero
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (rows[i] || cols[j]) {
                    arr[i][j] = 0;
                }
            }
        }
       
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZero(matrix);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}