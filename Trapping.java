public class Trapping {
    public static void TrappingRainwater(int height[]){
        int leftMaximum[]=new int[height.length];
        int rightMaximum[]=new int[height.length];
        
        int trappedwater=0;
        leftMaximum[0]=height[0];
        for (int i = 1; i < height.length; i++) {
            leftMaximum[i]=Math.max(height[i], leftMaximum[i-1]);  
        }
        rightMaximum[height.length-1]=height[height.length-1];
        for (int i = height.length-2; i>=0; i--) {
            rightMaximum[i]=Math.max(height[i], rightMaximum[i+1]);  

        }
        for (int i = 0; i < height.length; i++) {
           int waterlvl=Math.min(leftMaximum[i], rightMaximum[i]);  
           trappedwater += waterlvl-height[i];

        }
        System.out.println(trappedwater);
    }
    public static void main(String[]args ){
        int height[]={4,2,0,6,3,2,5};
        TrappingRainwater(height);

    }
    
}
