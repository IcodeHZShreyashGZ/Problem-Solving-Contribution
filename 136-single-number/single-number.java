class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length; 
        if(length == 1){
            return nums[0];
        }
        int x = 0;
        for(int i = 0; i < length; i++){
            x = (x ^ nums[i]); 
        }   
        return x;     
    }
}