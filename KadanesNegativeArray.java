public class KadanesNegativeArray {
    public static void kadanes(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixSum[]=new int[numbers.length];
        int least=Integer.MIN_VALUE;
        prefixSum[0]=numbers[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i]=prefixSum[i-1]+numbers[i];

        }
        for (int i = 0; i < prefixSum.length; i++) {
            currSum=currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }

            if (currSum>maxSum){
                maxSum=currSum;
            }    
        }
        System.out.println(maxSum);
        
        if (maxSum==0){

        
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]>least){
                    least=numbers[i];
                }
            }
        }
        System.out.println(least);
        
    }
    public static void main(String[] args) {
        int numbers[]={-1,-2,-3,-4};
        kadanes(numbers);
    }
    
}
