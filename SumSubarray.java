public class SumSubarray {
    public static void maxSubarray(int Subarray[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <Subarray.length; i++) {
            for (int j = i; j <Subarray.length; j++) {
                currSum=0;
                for (int k = i; k <=j; k++) {
                    currSum+=Subarray[k];

                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);      
    }
    public static void main(String[] args) {
        int Subarray[]={2,3,4,5};
        maxSubarray(Subarray);
        
    }
    
}
