public class ClearBit {
    public static int Clear_Ith(int n,int i) {
        int bitmask=~(1<<i);
        return n& bitmask;
        
    }
    public static void main(String args[]){
        System.out.println(Clear_Ith(10, 1));
    }

    
}
