public class SpiralMatrix{
    public static void Spiral(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while (startRow<=endRow&&startCol<=endCol) { 
            // top
            for (int t = startCol; t <= endCol; t++) {
                System.out.print(matrix[startRow][t]+" ");
            }
            // right
            for (int r = startRow+1; r <= endRow; r++) {
                
                System.out.print(matrix[r][endCol]+ " ");

            }
            // bottom
            for (int b = endCol-1; b >= startCol; b--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][b]+" ");
            }
            // left
            for (int l = endRow-1; l >= startRow+1; l--) {
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[l][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(matrix);
    }
}