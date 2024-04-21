import java.util.Arrays;

public class MoveFirstTwoDigitsToLastInArray {
    
    /*
     * Given an Array {1,2,3,4,5} move the first two elements to end of the array and print the array
     * output: {3,4,5,1,2}
     */

     public static void main(String[] args){
        // Given array
        int[] a = {1,2,3,4,5,6,7,8,9};

        // Create a new array
        int[] newArray = new int [a.length];
        
        int index = 0;
       //iterate through the elements of the original array starting from index 2, copying them into newArray.
        for(int i=2; i<a.length; i++){
            newArray[index] = a[i];
            index++;
        }
        
        //Then, you iterate through the first two elements of the original array and copy them into newArray after the elements copied in the previous step.
        for(int i=0; i<2; i++){
            newArray[index] = a[i];
            index++;
        }
        
        // print out the newArray.
        System.out.println(Arrays.toString(newArray));
     }
}
