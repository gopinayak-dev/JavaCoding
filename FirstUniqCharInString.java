public class FirstUniqCharInString {
    /*
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:

Input: s = "leetcode"
Output: 0

Example 2:

Input: s = "loveleetcode"
Output: 2

Example 3:

Input: s = "aabb"
Output: -1
*/
public static void main(String[] args) {

    String s = "aabb";

    System.out.println(FirstUniqChar(s));
    
}

private static int FirstUniqChar(String s) {
  
    //initializes an integer array freq of size 26, representing the frequencies of characters in the string
    int[] freq = new int[26]; 

    //converts the input string s into a character array chars
    char[] chars = s.toCharArray();

    //iterates through each character in the chars array
    for(char c: chars){
        // For each character c, it increments the count in the freq array at the index corresponding to the character's position in the alphabet. 'a' - 'a' = 0, 'b' - 'a' = 1, and so on. This effectively increments the count for each character encountered.
        freq[c - 'a']++;
    }

    //iterates through the characters of the string again:
    for(int i=0; i<chars.length; i++){
        // For each character at index i in the chars array, it checks if the frequency of that character is equal to 1. If so, it means this is the first non-repeating character, so it returns the index i.
        if(freq[chars[i] - 'a'] == 1){
            return i;
        }
    }

    //If no non-repeating character is found, the function returns -1.
    return -1;
}
}
