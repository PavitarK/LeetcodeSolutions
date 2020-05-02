package solutions;

//Leetcode Problem 27 Remove Element

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i;
        int length=0;

        for(i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
