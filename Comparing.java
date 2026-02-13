public class Comparing {    
    public static void main(String[] args) {
        String s[]={"mango","banana","guava"};
        String largest= s[0];
        for (int i=0;i<s.length;i++){
            if (largest.compareTo(s[i])<0){
                largest=s[i];
                

            }
            

        }
        System.out.println(largest);
        
    }
    
}
