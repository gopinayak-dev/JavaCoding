public class StringReverse {
    
     //Reverse the given string

    public static void main(String[] args) {
       
        String input = "Technologies";
        String output = stringReverse(input);
        System.out.println(output);
    }

    public static String stringReverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
             rev+=s.charAt(i);
        }
        return rev;
    }
}
