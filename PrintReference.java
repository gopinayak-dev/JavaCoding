
public class PrintReference {
    
    public static void main(String[] args) {

        String[] str = {"Java", "Python", "Javascript", "C"};
        System.out.println(str);

        int[] arr = {1,2,3,4,5};
        System.out.println(arr);

        /*In Java, when you try to print an array directly using System.out.println(), 
        it doesn't print the content of the array. Instead, it prints the memory reference of the array object. 
        This is because the println() method for an array is overloaded to accept an Object, 
        and arrays are objects in Java. */


        char[] carr = {'a', 'b', 'c'};
        System.out.println(carr);

        /* 
        Char:
        -----
        When you pass a character array (char[]) to println(), Java treats it specially and prints the characters 
        in the array directly. This is because character arrays are often used to represent strings in Java, 
        and it's convenient for developers to see the characters themselves when printing. */
    }
}
