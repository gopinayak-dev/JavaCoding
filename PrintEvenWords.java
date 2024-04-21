public class PrintEvenWords {

    /*
     * Given a string input from that print only even length words
     * input = 'sky is blue and vast'
     * output= is, blue, vast
     */

     public static void main(String[] args) {
        //input
        String input = "sky is blue and vast";

        //convert to array
        String[] wordsArray = input.split(" ");

        //iterate over each word from wordsArray
        for(String word: wordsArray){
            //check word is even or odd
            if(word.length() % 2 == 0){
                //if even then print word
                System.out.println(word);
            }
        }
     }
}