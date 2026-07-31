class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int maxSub = nums[0];
        int sum = 0;

        for(int i=0; i<len; i++){
            if (sum < 0){
                sum = 0; // reset to 0 if sum goes to neg
            }
            sum += nums[i];
            maxSub = Math.max(maxSub, sum);
        }
        return maxSub;
    }
}