package solutions;
import static java.util.Arrays.sort;

/*
Leetcode Problem 414. Third Maximum Number
Runtime: 1 ms, faster than 89.42% of Java online submissions for Third Maximum Number.
Memory Usage: 38.1 MB, less than 95.65% of Java online submissions for Third Maximum Number.
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        //sort given array in ascending order
        sort(nums);

        //get array length
        int arrLength = nums.length;
        int index = arrLength-1;

        //if the array is less than 3 indices large then return the first maximum number
        if(arrLength <3)
            return nums[index];

            //else parse the array
        else {
            // count tracks how many unique numbers have been found
            int count = 1;


            // while there are less than 3 unique numbers and there are still elements to check in the array
            while(count <3 && index >0) {
                if(nums[index] == nums[index-1])  //parses array from the last to 0th index to find unique numbers
                    index--;
                else {
                    count++;
                    index--;
                }
            }

            //if three unique numbers are not found then return the last index of the sorted array
            if(count<3)
                return nums[arrLength-1];
                //else return the third unique number
            else
                return nums[index];
        }
    }
}
