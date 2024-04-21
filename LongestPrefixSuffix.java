public class LongestPrefixSuffix {
    /*
     * Given a string find longest pre-fix and suf-fix
     * String input = "ababcdabab";
     * output = "abab"
     */

     public static void main(String[] args) {
        //input
        String input = "ababcdabab";
        int len = input.length();
        String longest = "";

        for(int i=1; i<len; i++){
            String prefix = input.substring(0, i);
            String suffix = input.substring(len -1);
            if(prefix.equals(suffix)){
                longest = prefix;
            }
        }

        System.out.println(longest);
     }
}
