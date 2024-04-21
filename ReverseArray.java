import java.util.Arrays;

public class ReverseArray {

    //ReverseArray 
    public static void main(String[] args){

        int[] input = {1,2,3,4,5,6,7};
        int[] output = reverseArray(input);
        System.out.println("Reversed Array is: "+Arrays.toString(output));
    }

    public static int[] reverseArray(int[] x){
        int start = 0;
        int end = x.length-1;
        int[] revArray = new int[x.length];
        while(start<x.length){
            revArray[start] = x[end];
            start++;
            end--;
        }
        return revArray;
    }
    

    /* When you print an array directly using System.out.println(), 
    it doesn't print the contents of the array but rather the reference to the array object in memory. 
    This reference is not very useful in terms of understanding the actual content of the array. 
    For example, if you have an array int[] arr = {1, 2, 3}, and you print it directly like this:
    System.out.println(arr);
    You will get output like this:
    [I@15db9742
    This output [I@15db9742 is not the content of the array [1, 2, 3], but rather it's the type of 
    the array ([I indicating an integer array) followed by an identifier representing its memory address.
    To display the actual content of the array, you need to iterate over its elements and print them one by one, 
    or you can use utility methods like Arrays.toString() to print the content of the array in a more readable format.*/
    
}
