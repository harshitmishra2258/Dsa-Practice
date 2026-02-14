public class StringCompression {
    public static String Stringcompression(String s1) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s1.length(); i++) {
            Integer count=1;
            while (i<s1.length()-1 && s1.charAt(i) == s1.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s1.charAt(i));
            if(count >1){
                sb.append(count.toString());
            }

        }
        // sb.toString();
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1="aaaabbcd";
        System.out.println(Stringcompression(s1));
    }
    
}
