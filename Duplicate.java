public class Duplicate {
    public static void Dupl(int arr[]){
        int arr1[]=new int[arr.length];
        System.out.print(arr[0]+" ");
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int previous =arr[i-1];
            if(curr!=previous){
                arr1[i]=arr[i];

            }
            else{
                continue;
            }
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,5,5,5,5,656};
        Dupl(arr);
    }
    
}
