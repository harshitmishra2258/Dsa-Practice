public class StairCaseSearch {
    public static void StairCase(int matrix[][],int key) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("Number is present at "+row+" ,"+col);
                break;
            }
            else if (key<matrix[row][col]) {
                col--;
            }
            
            else{
                row++;
            }

        }
        System.out.println("Number not found.");

        
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,38,50}};
        int key =33;
        StairCase(matrix, key);
    }    
}
