class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store the numbers we've seen and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in our map, we've found the solution pair
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Otherwise, store the current number and its index for future lookups
            numMap.put(nums[i], i);
        }
        
        // Fallback return (problem guarantees exactly one valid solution will always be found)
        return new int[] {};
    }
}