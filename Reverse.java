public class Reverse {
    public static void ReverseArray(int numbers[]) {
        int start=0;
        int end=numbers.length-1;
        while(start<end ){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
             
        }
        // System.out.println(numbers[]);

    
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,20};
        ReverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            
        }

    }


}