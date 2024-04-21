public class MaxMinNo {

    //Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.

    public static void main(String[] args) {

        int[] arr = {4, 781, 8, 99, 103};
       // int[] arr = {1, 2, 3, 4, 5};
       // int[] arr = {3,5};
        int maxNo =  maxNoFromArray(arr);
        System.out.println("maximum number is: "+maxNo);

        int minNo = minNoFromArray(arr);
        System.out.println("minimum number is: "+minNo);

    }

    //Maximum Number method 
    private static int maxNoFromArray(int[] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //Minimum Number method
    private static int minNoFromArray(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;

    }
    
}
