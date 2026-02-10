public class Binarysearch {
    public static int BinarySS(int number[],int key ) {
        int start = 0;
        int end = number.length-1;
        
        while(start<=end ){
            int mid =(end + start)/2;
            if (number[mid] == key){
                System.out.println("Number Found at index "+ mid );
                return mid;
            }
            if (number[mid] >key ) {
                end =mid -1;
              
            }
            else   {
                start =mid +1;
              
            }
            
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,5,6,7,8,9,10};
        int key =67;
        int result = BinarySS(number, key);
        if (result == -1) {
            System.out.println("Number not found in the array");
        }


    }
    
}
