import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array first
        Arrays.sort(nums);
        
        // The majority element will always be at the middle index
        return nums[nums.length / 2];
    }
}