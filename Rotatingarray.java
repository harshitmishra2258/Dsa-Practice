public class Rotatingarray {
    public static void Rotating(int num[]) {
        int temp=1;
        int num1[]=new int[num.length];
        for (int i = 0; i < num.length-1; i++) {
            num1[i]=num[i+1];
            
        }
        num1[num.length-1]=temp;
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
            
        }
        
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        Rotating(num);
        
    }
    
}
