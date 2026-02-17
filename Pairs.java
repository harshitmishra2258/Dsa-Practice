public class Pairs {
    public static void PairsArr(int number[]) {
        for (int i = 0; i <=number.length-1; i++) {
            for (int j = i; j <=number.length-1 ; j++) {
                System.out.print("("+number[i]+","+number[j]+")");                
            }
            System.out.println();
        }
    }
    public static void Sharddha(int number[]) {
        for (int i = 0; i <number.length; i++) {
            int curr = number[i];
            for (int j = i+1 ; j<number.length ; j++) {
                System.out.print("("+curr+","+number[j]+")");                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,5,6,7,8};
        Sharddha(number);

    }
    
}
