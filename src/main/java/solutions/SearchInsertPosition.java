package solutions;
//Leetcode Problem 35. Search Insert Position
//Solution in C

/*
int searchInsert(int* nums, int numsSize, int target){

        int position = 0;
        int Max = numsSize -1;

        if(target <= nums[0])
        return 0;

        if(target > nums[Max])
        return Max+1;

        while(nums[position] < target && position < numsSize){

        if(nums[position] == target)
        return position;
        else
        position++;
        }

        return position;
        }
 */
