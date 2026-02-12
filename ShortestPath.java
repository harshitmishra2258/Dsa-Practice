public class ShortestPath{
    public static float Shortest(String shrot) {
        int x =0;
        int y =0;
        for (int i = 0; i < shrot.length(); i++) {
            char dir = shrot.charAt(i);

            if(dir== 'W'){
                x--;
            } 
            else if (dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;

            }
            else{
                x++;
            }
            
        }
        int Y2=y*y;
        int X2=x*x;
        float dis=(float)Math.sqrt(Y2+X2);

        return dis;
    }
    public static void main(String[] args) {
        String shrot = "WEESNSWEEN";
        System.out.println(Shortest(shrot));

    
    }
}