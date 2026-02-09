public class SecondLargest {
    public static int Secondlargest(int arr[]) {
        int largest=Integer.MIN_VALUE;
        int seclargest=Integer.MAX_VALUE;
        for(int num:arr){
            if(num>largest){
                seclargest=largest;
                largest=num;
            }
            else if(num>seclargest&&num!=largest){
                seclargest=num;
            }

        }
        return seclargest;
    }
    public static void main(String[] args) {
        int arr[]={12,23,13,24,56,22};
        System.out.println(Secondlargest(arr));

    }
    
}
