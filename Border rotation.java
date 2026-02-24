import java.util.Scanner;

public class BorderRotation {
    
    public static void rotateBorder(int[][] matrix, int n, int m) {
        
        if (n <= 1 || m <= 1) {
            return; // No rotation possible
        }

        int temp = matrix[0][0];

        // Move left column up
        for (int i = 0; i < n - 1; i++) {
            matrix[i][0] = matrix[i + 1][0];
        }

        // Move bottom row left
        for (int j = 0; j < m - 1; j++) {
            matrix[n - 1][j] = matrix[n - 1][j + 1];
        }

        // Move right column down
        for (int i = n - 1; i > 0; i--) {
            matrix[i][m - 1] = matrix[i - 1][m - 1];
        }

        // Move top row right
        for (int j = m - 1; j > 1; j--) {
            matrix[0][j] = matrix[0][j - 1];
        }

        matrix[0][1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateBorder(matrix, n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}