public class ReverseOnlyWordsInString {
    
    /*
     * Given a string that contains both words and numbers, so we need to reverse the only words and print the string
     * Input: "test1234epam5678"
     * Output: "mape1234tset5678"
     */

     public static void main(String[] args) {
        //given string
        String inputString = "test1234epam5678";
        
        String outputString = reverseWords(inputString);
        System.out.println(outputString); // Output: "mape1234tset5678"
       
     }

    private static String reverseWords(String str) {
    
        char[] charArray = str.toCharArray();

        //left and right pointers are initialized to the beginning and end of the character array respectively.
        int left = 0;
        int right = charArray.length - 1;
        
        //while loop continues until left pointer is less than right pointer
        while (left < right) {

            // Skip numbers from the left side
            while (left < right && !Character.isAlphabetic(charArray[left])) {
                left++;
            }

            // Skip numbers from the right side
            while (left < right && !Character.isAlphabetic(charArray[right])) {
                right--;
            }

            // Swap the characters if both are alphabetic
            if (Character.isAlphabetic(charArray[left]) && Character.isAlphabetic(charArray[right])) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
            }

            left++;
            right--;
        }

        //return the output
        return new String(charArray);
    }

    
}
