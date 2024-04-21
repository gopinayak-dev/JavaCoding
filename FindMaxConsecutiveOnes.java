public class FindMaxConsecutiveOnes {

    /*
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/

public static void main(String[] args) {
    
    int[] nums = {1,0,1,1,0,1};

    int maxCount = 0; //Initialize the maximum count of consecutive ones
    int currentCount = 0; //Initialize the current count of consecutive ones

    for(int i: nums){
        if(i == 1){
            //Increment current count if the current number is 1
            currentCount++;
        }
        else{

            if(currentCount>maxCount){
                //Update maxCount if the current sequence of ones is longer
                maxCount = currentCount;
                
                //Reset current count for the next sequence
                currentCount = 0;
            }
        }
    }

    //Update maxCount one more time after the loop in case the last sequence is the longest
    int ans = maxCount > currentCount ? maxCount : currentCount;

    //print the maximum count of consecutive ones
    System.out.println(ans);
}

}