package solutions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Leetcode Problem 448. Find All Numbers Disappeared in an Array
Runtime: 3 ms, faster than 100.00% of Java online submissions for Find All Numbers Disappeared in an Array.
Memory Usage: 50.8 MB, less than 32.08% of Java online submissions for Find All Numbers Disappeared in an Array.
 */
//O(n) solution
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        int[] missing = new int[nums.length+1]; //need plus one since n is max number in the array. and n = nums.length+1
        ArrayList<Integer> list = new ArrayList<Integer>();

        //for each value in nums mark the respective index in missing[] with 1
        for(int i=0; i<nums.length; i++){
            missing[nums[i]] = 1;
        }

        //parse list to find values not marked with 1 and add that to the final list.
        for(int i=1; i<missing.length; i++){
            if(missing[i] != 1)
                list.add(i);
        }
        return list;
    }
}

//O(n^2) solution

/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> missing = new ArrayList<Integer>();
        int j;

        for(int i = 0; i<nums.length; i++){
            for(j =0; j<nums.length; j++){
                if(nums[j] == i)
                j=-1;
            }

            if(j == -1)
                missing.add(i);
        }

        return missing;

    }
}
*/
